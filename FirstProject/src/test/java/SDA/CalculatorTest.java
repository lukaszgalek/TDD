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
    public void testRoznica() {
        int result = calculator.roznica(3,1);
        Assert.assertEquals(2,result);
    }

    @Test
    public void testMnozenie() {
        int result = calculator.mnozenie(2,3);
        Assert.assertEquals(6,result);
    }
    @Test
    public void testDzielenie() {
Double result = null;
try{
    result = calculator.dzielenie(new Double(4), new Double(0));
}catch (ArithmeticException exception ){

        Assert.assertNull(result);
        Assert.assertEquals(exception.getMessage(),"Incorrect value");
    }}

    @Test
    public void silnia( )throws Exception{
       int result = calculator.silnia(4);
       Assert.assertEquals(24,result);
    }

}
