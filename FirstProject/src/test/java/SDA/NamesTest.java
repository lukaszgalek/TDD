package SDA;

import org.junit.Before;
import org.junit.Test;

public class NamesTest {

    private Names names;


    @Before
    public void setUp() throws Exception {
        this.names = new Names();
    }

    @Test
    public void randomNameTest() {
        System.out.println(names.getRandomName());
    }
}
