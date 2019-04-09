import cipher.App;
import org.junit.*;
import static org.junit.Assert.*;


public class CaesarCipherTest {
    @Test public void testAppHasAGreeting() {
        App classUnderTest = new App();
        assertNotNull("app should have a greeting", classUnderTest.getGreeting());
    }
}
