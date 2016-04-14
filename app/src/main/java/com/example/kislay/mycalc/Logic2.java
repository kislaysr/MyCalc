package com.example.kislay.mycalc;

import android.util.Log;

import java.util.Stack;

/**
 * Created by kislay on 14-04-2016.
 */
public class Logic2 {
    BaseFragment baseFragment;
    public String clac()
    {
        baseFragment = new BaseFragment();
        String exp = baseFragment.getResult();
        double answer;
        try {
            answer = evaluate(exp);
            if((answer-(int)answer)==0){
                return (int)answer + "";
            }else{
                return Double.toString(answer);
            }
        }
        catch (Exception e)
        {
            return e.getMessage();
        }
    }
    public static double evaluate(String expression) throws Exception
    {
        Log.e("expression ", expression);
        char[] tokens = expression.toCharArray();

        // Stack for numbers: 'values'
        Stack<Double> values = new Stack<Double>();

        // Stack for Operators: 'ops'
        Stack<Character> ops = new Stack<Character>();

        for (int i = 0; i < tokens.length; i++)
        {

            Log.e("log",i+"");
            // Current token is a whitespace, skip it
            if (tokens[i] == ' ')
                continue;

            // Current token is a number, push it to stack for numbers

            if ((tokens[i] >= '0' && tokens[i] <= '9') || tokens[i]=='.')
            {
                Log.e("Inside ", "1sr if");
                StringBuffer sbuf = new StringBuffer();
                // There may be more than one digits in number
                while (i < tokens.length && ((tokens[i] >= '0' && tokens[i] <= '9') || (tokens[i]=='.')))
                    sbuf.append(tokens[i++]);
                i--;
                if(tokens[i]=='.')throw new Exception("Invalid number format");
                values.push(Double.parseDouble(sbuf.toString()));
            }
            else if (tokens[i] == '(')
                ops.push(tokens[i]);
            else if (tokens[i] == ')')
            {
                while (ops.peek() != '('){
                    if(ops.size()<1 || values.size()<2)throw new Exception("Please check brackets");
                    double a = values.pop();
                    double b = values.pop();
                    char op = ops.pop();
                    values.push(applyOp(op,a,b));
                }
                ops.pop();
            }
            else if (tokens[i] == '+' || tokens[i] == '-' || tokens[i] == '*' || tokens[i] == '/')
            {
                Log.e("operator ","Inside operator "+tokens[i]);
                // While top of 'ops' has same or greater precedence to current
                // token, which is an operator. Apply operator on top of 'ops'
                // to top two elements in values stack
                while (!ops.empty() && hasPrecedence(tokens[i], ops.peek())) {
                    if(values.size()<2)throw new Exception("Invalid expression");
                    values.push(applyOp(ops.pop(), values.pop(), values.pop()));
                }

                // Push current token to 'ops'.
                ops.push(tokens[i]);
            }else {
                throw new Exception("Invalid operation");
            }
        }

        // Entire expression has been parsed at this point, apply remaining
        // ops to remaining values
        while (!ops.empty()) {
            if(values.size()<2)throw new Exception("Invalid expression");
            values.push(applyOp(ops.pop(), values.pop(), values.pop()));
        }

        // Top of 'values' contains result, return it
       // Log.e("values ",Integer.toString(values.pop()));
        if(values.size()>1)throw new Exception("Invalid expression");
        return values.pop();
    }

    // Returns true if 'op2' has higher or same precedence as 'op1',
    // otherwise returns false.
    public static boolean hasPrecedence(char op1, char op2)
    {
        if (op2 == '(' || op2 == ')')
            return false;
        if ((op1 == '*' || op1 == '/') && (op2 == '+' || op2 == '-'))
            return false;
        else
            return true;
    }

    // A utility method to apply an operator 'op' on operands 'a'
    // and 'b'. Return the result.
    public static double applyOp(char op, double b, double a)
    {
        switch (op)
        {
            case '+':
                //Log.e("Sum ",Integer.toString(a+b));
                return a + b;
            case '-':
                //Log.e("Sum ",Integer.toString(a-b));
                return a - b;
            case '*':
                //Log.e("Sum ",Integer.toString(a*b));
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            UnsupportedOperationException("Cannot divide by zero");
                //Log.e("Sum ",Integer.toString(a/b));
                return a / b;
        }
        return 0;
    }
}
