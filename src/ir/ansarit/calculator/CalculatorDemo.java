package ir.ansarit.calculator;

import ir.ansarit.arithmetic.operation.ArithmeticOperation;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        boolean wantToUse = true;
        do{
            System.out.println("Calculator is ready to use :)");
            Scanner scanner = new Scanner(System.in);
            ArithmeticOperation calculator = new Calculator();
            ArrayList<String> blockList = calculator.extractTokens(String.valueOf(scanner.next()));
            Double result = null;
            switch (blockList.get(2)){
                case "+":{
                    result = calculator.add(Double.parseDouble(blockList.get(0)),Double.parseDouble(blockList.get(1)));
                }
                break;
                case "-":{
                    result = calculator.subtract(Double.parseDouble(blockList.get(0)),Double.parseDouble(blockList.get(1)));
                }
                break;
                case "*":{
                    result = calculator.multiplication(Double.parseDouble(blockList.get(0)),Double.parseDouble(blockList.get(1)));
                }
                break;
                case "/":{
                    try {
                        result = calculator.division(Double.parseDouble(blockList.get(0)),Double.parseDouble(blockList.get(1)));
                    }
                    catch (Exception e){
                        System.out.println("division By zero occurred");
                    }
                }
                break;
                default:{
                    System.out.println("invalid input! smile");
                }
            }
            System.out.println(result);
            System.out.println("continue? y/n");
            if ("y".equals(String.valueOf(scanner.next()))){
                wantToUse = true ;
            }
            else {
                wantToUse = false;
            }
        }while(wantToUse);


    }
}
