package unit;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;
import org.ricecooker.utils.Utils;

import static org.junit.Assert.assertEquals;

public class UtilsUnitTest {

    private final ByteArrayOutputStream outputStreamCaptor = new ByteArrayOutputStream();

    @Before
    public void setUp() {
        System.setOut(new PrintStream(outputStreamCaptor));
    }

    @After
    public void tearDown() {
        System.setOut(System.out);
    }

    @Test
    public void print_test_ok() {
        Utils.print("Test message");
        assertEquals("Test message", outputStreamCaptor.toString().trim());
    }

    @Test
    public void print_welcome_ok() {
        Utils.notImplemented();
        assertEquals("Not implemented yet.", outputStreamCaptor.toString().trim());
    }
}