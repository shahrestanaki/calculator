package ir.ansarit.arithmetic.operation;

import java.util.ArrayList;

public interface ArithmeticOperation {

    Double add(double firstOperand ,double secondOperand);

    Double subtract(double firstOperand ,double secondOperand);

    Double division(double firstOperand ,double secondOperand) throws ArithmeticException;

    Double multiplication(double firstOperand ,double secondOperand);

    ArrayList extractTokens(String input);

}
