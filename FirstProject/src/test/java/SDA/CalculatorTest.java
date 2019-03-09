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

//@RunWith(JUnitParamsRunner.class)
@RunWith(Parameterized.class)
public class CalculatorTest {

    private Calculator calculator;
    private Integer value;

    public CalculatorTest(Integer value){
        this.value = value;
    }
@Parameterized.Parameters
public static Collection getParameters(){
        return  Arrays.asList(
                new Integer[][]{
                        {10},
                        {20},
                        {30}
                });
                }


    @Test
    public void testMnozenie() {
    calculator = new Calculator();
        int result = calculator.mnozenie(value, value);
        Assert.assertEquals(value* value, result);
    }

//    @Before
//    public void setUp() throws Exception {
//        this.calculator = new Calculator();
//    }
//
//    @Test
//    @Parameters({"3,2,", "4,4", "8,2"})
//    public void testAdding(int a, int b) throws Exception {
//        Assert.assertEquals(a + b, calculator.add(a, b));
//    }
//
//    @Test
//    @Parameters({"2,2,0", "4,2,2"})
//    public void testRoznica(int a, int b, int c) throws Exception {
//
//        Assert.assertEquals(c, calculator.roznica(a, b));
//    }


    // dzieki rzutowaniiu na obiekt Double nie trzeba delty po przecinku
    @Test
    public void testDzielenie() {

        Double result = calculator.dzielenie(4, 2);
        Assert.assertEquals(Double.valueOf(2.0), result);
    }
// miejsca po przecinku możńa określić
//    @Test
//    public void testDzielenie() {
//
//        double result = calculator.dzielenie(4,2);
//        Assert.assertEquals(5.0,result, 2);
//    }
}
