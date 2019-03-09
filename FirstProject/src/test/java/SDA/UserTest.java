package SDA;

import junitparams.JUnitParamsRunner;
import junitparams.Parameters;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;

@RunWith(JUnitParamsRunner.class)
public class UserTest {
    @Test
    @Parameters(method = "parametersForTest")
    public void userTest(User user1, User user2) {
        Assert.assertTrue(user1.equals(user2));
    }

    private Object[] parametersForTest() {
        return new Object[]{
                new Object[]{new User("jan", 12), new User("jan", 12)},
                new Object[]{new User("jan2", 14), new User("jan2", 25)},
                new Object[]{new User("jan3", 56), new User("jan3", 23)},
                new Object[]{new User("jan4", 46), new User("jan4", 16)},
        };
    }
}
