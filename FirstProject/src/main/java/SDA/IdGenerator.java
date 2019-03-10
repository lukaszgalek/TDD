package SDA;

import java.util.Random;

public class IdGenerator {


    public Integer getUniqueId() {
        Random random = new Random();

        return random.nextInt(1000);
    }
}
