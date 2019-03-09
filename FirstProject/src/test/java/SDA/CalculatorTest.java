package SDA;

import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

public class CalculatorTest {

    private Calculator calculator;


    @Before
    public void setUp () throws Exception {
        this.calculator = new Calculator();
    }

    @Test
    @Parameters({"3,2","4,4","8,2"})
    public void testAdding(int a, int b)throws Exception{
        int result = calculator.add(a,b);
        Assert.assertEquals(a+b,result);
    }

    @Test
    public void testRoznica() {
        int result = calculator.roznica(3,1);
        Assert.assertEquals(,result);
    }

    @Test
    public void testMnozenie() {
        int result = calculator.mnozenie(2,3);
        Assert.assertEquals(6,result);
    }
// dzieki rzutowaniiu na obiekt Double nie trzeba delty po przecinku
    @Test
    public void testDzielenie() {

        Double result = calculator.dzielenie(4,2);
        Assert.assertEquals(Double.valueOf(2.0),result);
    }
// miejsca po przecinku możńa określić
//    @Test
//    public void testDzielenie() {
//
//        double result = calculator.dzielenie(4,2);
//        Assert.assertEquals(5.0,result, 2);
//    }
}
