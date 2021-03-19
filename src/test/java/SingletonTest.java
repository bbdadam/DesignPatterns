import static org.junit.jupiter.api.Assertions.*;

import Singleton.*;
import org.junit.jupiter.api.Test;
public class SingletonTest {

    @Test
    void testSingleTonInstance(){
        Singleton singletonInstance = Singleton.getInstance();
        Singleton singletonInstance_2 = Singleton.getInstance();

        assertEquals(singletonInstance, singletonInstance_2);
    }
}
