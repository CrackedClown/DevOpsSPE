package calculator;

import static org.junit.Assert.*;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {
    private static final double DELTA = 1e-15;
    Calculator calculator = new Calculator();

    @Test
    public void SQRTTruePositive(){
        assertEquals("Square Root of an integer number for True Positive", 3, calculator.SQRT(9), DELTA);
        assertEquals("Square Root of an integer number for True Positive", 0.9, calculator.SQRT(0.81), DELTA);
    }

    @Test
    public void SQRTFalsePositive(){
        assertNotEquals("Square Root of an integer number for False Positive", 6, calculator.SQRT(9), DELTA);
        assertNotEquals("Square Root of an integer number for False Positive", 7.3, calculator.SQRT(0.81), DELTA);
    }

    @Test
    public void factTruePositive(){
        assertEquals("Factorizing an integer number for True Positive", 6, calculator.fact(3), DELTA);
        assertEquals("Factorizing an integer number for True Positive", 24, calculator.fact(4), DELTA);
    }

    @Test
    public void factFalsePositive(){
        assertNotEquals("Factorizing an integer number for False Positive", 92, calculator.fact(3), DELTA);
        assertNotEquals("Factorizing an integer number for False Positive", 2, calculator.fact(4), DELTA);
    }
    @Test
    public void logTruePositive(){
        assertEquals("Logarithmic an integer number for True Positive", 0, calculator.log(1), DELTA);
    }

    @Test
    public void logFalsePositive(){
        assertNotEquals("Logarithmic an integer number for False Positive", 19, calculator.log(6), DELTA);
        assertNotEquals("Logarithmic an integer number for False Positive", 20, calculator.log(1), DELTA);
    }


    @Test
    public void powerTruePositive(){
        assertEquals("Power of an integer number for True Positive", 36, calculator.power(6,2), DELTA);
        assertEquals("Power of an integer number for True Positive", 1, calculator.power(1,3), DELTA);
    }
    @Test
    public void powerFalsePositive(){
        assertNotEquals("Power of an integer number for False Positive", 1, calculator.power(6,2), DELTA);
        assertNotEquals("Power of an integer number for False Positive", 32, calculator.power(1,3), DELTA);
    }
}
