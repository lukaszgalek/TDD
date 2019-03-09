package SDA;

import junitparams.JUnitParamsRunner;
//import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.junit.runners.Parameterized;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

@RunWith(JUnitParamsRunner.class)
//@RunWith(Parameterized.class)
public class CalculatorTest {

    private Calculator calculator;



    @Before
    public void setUp() throws Exception {
        this.calculator = new Calculator();
    }

    @Test
    public void testDzielenie() {

        Double result = calculator.dzielenie(4, 2);
        Assert.assertEquals(Double.valueOf(2.0), result);
    }

    @Test
    public void silnia( )throws Exception{
       int result = calculator.silnia(4);
       Assert.assertEquals(24,result);
    }

}
