package SDA;

import junitparams.JUnitParamsRunner;
//import junitparams.Parameters;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Rule;
import org.junit.Test;
import org.junit.rules.ExpectedException;
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

    @Rule
    public ExpectedException wyjatek = ExpectedException.none();
    @Test
    public void testDzielenie() {

wyjatek.expect(ArithmeticException.class);
wyjatek.expectMessage("Incorrect value");
   Double result = calculator.dzielenie(new Double(4), new Double(0));


        Assert.assertNull(result);

    }

    @Test
    @Parameters({"-4,24","-4,24","-8,2"})
    public void silnia( int a, int b ){
        wyjatek.expect(IllegalArgumentException.class);
        wyjatek.expectMessage("Incorrect value");
       int result = calculator.silnia(a);
       Assert.assertEquals(b,result);
    }

}
