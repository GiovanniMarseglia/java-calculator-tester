package org.learning;

import static org.junit.jupiter.api.Assertions.assertEquals;
import org.junit.jupiter.api.Test;
import java.util.Random;

public class CalculatorTest {
    float num1 = new Random().nextFloat();
    float num2 = new Random().nextFloat();
    Calculator calculator = new Calculator();
    @Test
    void add() {
        assertEquals(num1+num2,calculator.add(num1,num2));
    }

    @Test
    void subtract() {
        assertEquals(num1-num2,calculator.subtract(num1,num2));
    }

    @Test
    void divide() {
        assertEquals(num1/num2,calculator.divide(num1,num2));
    }

    @Test
    void multiply() {
        assertEquals(num1*num2,calculator.multiply(num1,num2));
    }
}
