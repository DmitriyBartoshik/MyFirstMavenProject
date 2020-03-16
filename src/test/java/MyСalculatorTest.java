import org.junit.Test;

import static org.junit.Assert.*;

public class MyСalculatorTest {

    @Test
    public void countSum() {
        MyСalculator myСalculator= new MyСalculator();
        int actual=myСalculator.countSum(7,5);
        int expected =12;
        assertEquals(expected,actual);
    }

    @Test
    public void countMultiplication() {
        MyСalculator myСalculator= new MyСalculator();
        int actual=myСalculator.countMultiplication(7,5);
        int expected =35;
        assertEquals(expected,actual);
    }

    @Test
    public void countSubtraction() {
        MyСalculator myСalculator= new MyСalculator();
        int actual=myСalculator.countSubtraction(7,5);
        int expected =2;
        assertEquals(expected,actual);
    }
}