import org.junit.Test;

import static org.junit.Assert.*;

public class MyСalculatorTest {

    @Test
    public void countSum() {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        int actual= arithmeticCalculator.countSum(7,5);
        int expected =12;
        assertEquals(expected,actual);
    }

    @Test
    public void countMultiplication() {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        int actual= arithmeticCalculator.countMultiplication(7,5);
        int expected =35;
        assertEquals(expected,actual);
    }

    @Test
    public void countSubtraction() {
        ArithmeticCalculator arithmeticCalculator = new ArithmeticCalculator();
        int actual= arithmeticCalculator.countSubtraction(7,5);
        int expected =2;
        assertEquals(expected,actual);
    }
}