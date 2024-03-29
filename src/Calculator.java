public class Calculator {

    public static final char ADDITION = '+';
    public static final char SUBTRACTION = '-';
    public static final char MULTIPICATION = '*';
    public static final char DIVISION = '/';

    public static int calculate(int  firstOperand, int secondOperand, char operator) {
        switch (operator) {
            case ADDITION:
                return firstOperand + secondOperand;
            case SUBTRACTION:
                return  firstOperand - secondOperand;
            case MULTIPICATION:
                return  firstOperand * secondOperand;
            case DIVISION:
                if (secondOperand != 0)
                    return  firstOperand / secondOperand;
                else
                    throw new RuntimeException("Can not divide by 0");
            default:
                throw new RuntimeException("Unsupported operation");
        }
    }

    public static void main(String[] args) {
        calculate(5,6,ADDITION);
        System.out.println(calculate(5,6,ADDITION));

    }
}
