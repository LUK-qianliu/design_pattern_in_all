package com.qianliu.behavioral.interpret;

import java.util.Stack;

public class ExpressionParser {

    private static Stack<Interpret> stack = new Stack<>();

    public static int parser(String string){
        String[] interprets = string.split(" ");
        for (String interpret: interprets) {
            if(isOperation(interpret)){
                Interpret interpret1 = stack.pop();
                Interpret interpret2 = stack.pop();

                Integer result = execOperation(interpret1, interpret2, interpret);
                stack.push(new NumberInterpret(result.toString()));
            }else {
                stack.push(new NumberInterpret(interpret));
            }
        }

        return stack.pop().interpret();
    }

    // 判断是否是运算符
    private static Boolean isOperation(String opearation){
        if(opearation.equals("+")
                || opearation.equals("-")
                ||opearation.equals("*")
                ||opearation.equals("/") ){
            return true;
        }

        return false;
    }

    // 执行运算
    private static Integer execOperation(Interpret interpret1,Interpret interpret2,String operation){
        if (operation.equals("+")){
            return new AddInterpret(interpret1,interpret2 ).interpret();
        }else if(operation.equals("*")){
            return new MultiInterpret(interpret1,interpret2 ).interpret();
        }

        return null;
    }
}
