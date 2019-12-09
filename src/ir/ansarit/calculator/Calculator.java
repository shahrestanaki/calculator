package ir.ansarit.calculator;

import ir.ansarit.arithmetic.operation.ArithmeticOperation;

import java.util.ArrayList;
import java.util.Arrays;

public class Calculator implements ArithmeticOperation {
    @Override
    public Double add(double firstOperand, double secondOperand) {
        return firstOperand + secondOperand;
    }

    @Override
    public Double subtract(double firstOperand, double secondOperand) {
        return firstOperand - secondOperand;
    }

    @Override
    public Double division(double firstOperand, double secondOperand) throws ArithmeticException {
        if(secondOperand == 0){
            throw new ArithmeticException();
        }else{
            return firstOperand / secondOperand;

        }
    }

    @Override
    public Double multiplication(double firstOperand, double secondOperand) {
        return firstOperand * secondOperand;
    }

    @Override
    public ArrayList extractTokens(String input){
        ArrayList<String> tokenList;
        tokenList = new ArrayList<>(Arrays.asList(input.split("\\+|\\-|\\*|\\/")));

        if(input.contains("+")) {tokenList.add("+");}
        else if(input.contains("-")) {tokenList.add("-");}
        else if(input.contains("*")) {tokenList.add("*");}
        else if(input.contains("/")) {tokenList.add("/");}
        else {tokenList.add(null);}
        return tokenList;
    }
}
