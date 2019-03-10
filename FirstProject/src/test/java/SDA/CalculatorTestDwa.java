package SDA;

import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;

import static org.assertj.core.api.AssertionsForInterfaceTypes.assertThat;

public class CalculatorTestDwa {

    private Calculator calculator;



    @Before
    public void setUp() throws Exception {
        this.calculator = new Calculator();
    }

@Test
public void testAdding(){
        int result = calculator.add(2,2);
        assertThat(result).isEqualTo(4);
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
}
