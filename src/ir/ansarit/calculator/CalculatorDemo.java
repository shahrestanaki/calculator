package ir.ansarit.calculator;

import ir.ansarit.arithmetic.operation.ArithmeticOperation;

import java.util.ArrayList;
import java.util.Scanner;

public class CalculatorDemo {
    public static void main(String[] args) {
        boolean wantToUse;
        Scanner scanner = new Scanner(System.in);
        String inputUserType;
        do {
            inputUserType = getInputUserdata(scanner, true);
            Double result = calc(inputUserType);
            if (result != null) {
                System.out.println(result);
            }
            inputUserType = getInputUserdata(scanner, false);
            if ("y".equals(inputUserType)) {
                wantToUse = true;
            } else {
                wantToUse = false;
            }

        } while (wantToUse);
    }

    static String getInputUserdata(Scanner scanner, boolean flag) {
        if (flag) {
            System.out.println("Calculator is ready to use :)");
        } else {
            System.out.println("continue? y/n");
        }
        String inputUserType = String.valueOf(scanner.next());
        return inputUserType;
    }

    static Double calc(String inputUserType) {
        ArithmeticOperation calculator = new Calculator();
        ArrayList<String> blockList = calculator.extractTokens(inputUserType);
        switch (blockList.get(2)) {
            case "+": {
                return calculator.add(Double.parseDouble(blockList.get(0)), Double.parseDouble(blockList.get(1)));
            }
            case "-": {
                return calculator.subtract(Double.parseDouble(blockList.get(0)), Double.parseDouble(blockList.get(1)));
            }
            case "*": {
                return calculator.multiplication(Double.parseDouble(blockList.get(0)), Double.parseDouble(blockList.get(1)));
            }
            case "/": {
                try {
                    return calculator.division(Double.parseDouble(blockList.get(0)), Double.parseDouble(blockList.get(1)));
                } catch (Exception e) {
                    System.out.println("division By zero occurred");
                }
            }
            default: {
                System.out.println("invalid input! smile");
            }
        }
        return null;
    }
}
