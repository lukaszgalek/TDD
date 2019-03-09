package SDA;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;

import java.util.Arrays;
import java.util.Collection;
import java.util.Collections;

@RunWith(JUnitParamsRunner.class)
public class SortTest {
    private Sort sort;
private int []tab = {7,3,5,1};

    @Before
    public void setUp() throws Exception {
        this.sort = new Sort();
    }

    @Test
    public void sortowanie() {
       int [] result =  sort.sortowanie(tab);
        Arrays.sort(tab);

        Assert.assertEquals(tab,result);}
        @Test
        @Parameters(method = "tablice")
        public void sortowanie2(int []a , int []b) {
        int []result = sort.sortowanie(a);
            Assert.assertArrayEquals(b,result);

        }
        private Object[][] tablice () {
        return new Object[][]{
                new Object[]{new int[]{2, 4, 1, 8},new int[] {1, 2, 4, 8}},
                new Object[]{new int[]{7, 2, 5, 3},new int[] {2, 3, 5, 7}},
                              };
    }
}

