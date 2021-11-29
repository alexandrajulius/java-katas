import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.Test;

public class HelloTest {

    @Test 
    public void testHello() {
        assertEquals("Hello world", Hello.hello());
    }

}