package SDA;

import org.junit.Before;
import org.junit.Test;
import org.mockito.Mock;

import static org.mockito.Mockito.*;

public class IdGeneratorTest {

    private IdGenerator idGenerator;
    private IdGenerator mockidGenerator;



    @Before
    public void setUp(){
        this.idGenerator = new IdGenerator();
        this.mockidGenerator = mock(IdGenerator.class);// tworzy moka
    }

    @Test
    public void testIdGenerator() {
        System.out.println(idGenerator.getUniqueId());

        when(mockidGenerator.getUniqueId()).thenReturn(15);// wpisujemy jaki wynik chcemy sprawdzic

        System.out.println(mockidGenerator.getUniqueId());

        verify(mockidGenerator).getUniqueId(); // sprawdza czy chociaż raz wywołała sie metoda i mozemy określić ilość wywołań jaką oczekujemy


    }
}
