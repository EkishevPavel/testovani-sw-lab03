package cz.cvut.fel.ts1;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

public class CalculatorTest {
    static Calculator c;

    @Test
    public void add_isFive_returnAddTwoNumbers(){
        Calculator calculator = new Calculator();

        //ACT
        int num = calculator.add(2,3);
        //ASSERT
        Assertions.assertEquals(5, num);
    }

    @Test
    public void subtract_IsTwo_returnSubtractTwoNumbers(){
        Calculator calculator = new Calculator();

        //ACT
        int num = calculator.subtract(6,4);
        //ASSERT
        Assertions.assertEquals(2, num);

    }
    @Test
    public void multiply_IsTen_returnMultiplyTwoNumbers(){
        Calculator calculator = new Calculator();

        //ACT
        int num = calculator.multiply(5,2);
        //ASSERT
        Assertions.assertEquals(10, num);

    }
    @Test
    public void divide_divideZero_returnDivedeTwoNumbers(){
        Calculator calculator = new Calculator();

        //ACT
        int num = calculator.divide(5,0);
        //ASSERT
        Assertions.assertEquals(0, num);

    }


}
