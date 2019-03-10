package SDA;

import java.util.ArrayList;
import java.util.List;

public class Names {

    private List<String> names = new ArrayList<>();
    private IdGenerator idGenerator = new IdGenerator(); // nie można przez new idGenerator bo kazda wartosc bedzie losowa

    public Names(){
        names.add("Jan");
        names.add("Tomasz");
        names.add("Krzysztof");
        names.add("Zdzich");
    }


    public String getRandomName(){
        return names.get(idGenerator.getUniqueId());
    }
}
