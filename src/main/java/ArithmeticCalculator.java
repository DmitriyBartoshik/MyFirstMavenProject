import java.util.logging.Logger;

public class ArithmeticCalculator {
private  static  final Logger logger= Logger.getLogger(ArithmeticCalculator.class.getName());
    public int countSum(int firstNumber, int secondNumber) {
        logger.info("Process is Sum");
        return firstNumber + secondNumber;
    }
    public int countMultiplication(int firstNumber, int secondNumber) {
        logger.info("Process is multiplication");
        return firstNumber * secondNumber;
    }
    public int countSubtraction(int firstNumber, int secondNumber) {
        logger.info("Process is subtraction");
        return firstNumber - secondNumber;
    }
}
