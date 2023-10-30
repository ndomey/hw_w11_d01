import org.example.Calculator;
import org.junit.Before;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

public class CalculatorTest {

    Calculator calculator;


    @Before
    public void before(){
        calculator = new Calculator(3, 5, 8, 7);
    }

    @Test
    public void hasAddFunction(){
        assertEquals(8, calculator.add());
    }

    @Test
    public void hasSubFunction(){
        assertEquals(2, calculator.sub());
    }

    @Test
    public void hasMultFunction(){
        assertEquals(15, calculator.mult());
    }

    @Test
    public void hasDivFunction(){
        assertEquals(1.1428, calculator.div(), 0.0001);
    }

}
