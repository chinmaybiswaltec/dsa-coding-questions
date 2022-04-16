package com.chinmaybiswaltech.stringquestions;

import javax.script.ScriptEngine;
import javax.script.ScriptEngineManager;
import javax.script.ScriptException;
import java.util.Stack;

public class ExpressionEvaluation {

    public static void main(String[] args) {
     String str = "(10+20)*(20-10)";
        System.out.println(evaluateExpression(str));
        try {
            usingScriptEngine(str);
        } catch (ScriptException e) {
            e.printStackTrace();
        }
    }

    private static  void usingScriptEngine(String exp) throws ScriptException {
        ScriptEngineManager scriptEngineManager = new ScriptEngineManager();
        ScriptEngine scriptEngine = scriptEngineManager.getEngineByName("JavaScript");
        Object obj = scriptEngine.eval(exp);
        System.out.println(obj);
    }


    private static int evaluateExpression(String exp){
        //Convert to array of characters
        char[] expArr = exp.toCharArray();

        //Initialize a stack for operands
        Stack<Integer> operands = new Stack<>();

        //Initialize a stack for operators
        Stack<Character> operators = new Stack<>();

        // Iterate over all the characters
        for(int i=0; i< expArr.length ;i++){
            // If the character is a blank character move to the next character
            if(expArr[i]==' '){
                 continue;
            }

            if(expArr[i] >= '0' && expArr[i] <= '9'){
               StringBuffer sb = new StringBuffer();
               // This is to form a number out of different letters in the string
                // [1,0,2] should be formed as 102
               while(i< expArr.length && expArr[i] >= '0' && expArr[i] <= '9'){
                   sb.append(expArr[i++]);
               }
               operands.push(Integer.valueOf(sb.toString()));
               i--;
            }else if(expArr[i]=='('){
                // Push opening parenthesis to stack
                operators.push(expArr[i]);
            }else if( expArr[i] == ')' ){
                // When we encounter a closing parenthesis
               while (operators.peek() != '('){
                   operands.push(applyOperator(operators.pop(), operands.pop(), operands.pop()));
               }
               operators.pop();
               // If the character is an operator
            }else if (expArr[i] == '+' || expArr[i] == '-' ||
                    expArr[i] == '*' || expArr[i] == '/'){
                // While operator stack is not empty or
                // top of the stack has an operator whose precedence is equal or \
                //more than the current operator, apply the operator at the top
                // of the stack to the two operands(top and below it) from operands stack
                while (!operators.isEmpty() && hasPrecedence(expArr[i], operators.peek())){
                    operands.push(applyOperator(operators.pop(),
                            operands.pop(),operands.pop()));
                }
                operators.push(expArr[i]);
            }
        }

        // If the expression has been evaluated and still the stacks are not empty
        while (!operators.empty()) {
            operands.push(applyOperator(operators.pop(),
                    operands.pop(), operands.pop()));
        }

        return operands.pop();
    }

    // Returns true if operator2 has higher or same precedence than
    // operator1 that is character under evaluation
    public static boolean hasPrecedence(
            char operator1, char operator2)
    {
        if (operator2 == '(' || operator2 == ')')
            return false;
        if ((operator1 == '*' || operator1 == '/') &&
                (operator2 == '+' || operator2 == '-'))
            return false;
        else
            return true;
    }

    private static int applyOperator(char op,int b, int a)
    {
        switch (op)
        {
            case '+':
                return a + b;
            case '-':
                return a - b;
            case '*':
                return a * b;
            case '/':
                if (b == 0)
                    throw new
                            UnsupportedOperationException(
                            "Cannot divide by zero");
                return a / b;
        }
        return 0;
    }
}

