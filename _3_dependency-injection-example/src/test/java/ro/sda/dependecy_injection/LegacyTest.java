package ro.sda.dependecy_injection;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import ro.sda.dependency_injection.witchout_di.MessageSender;

import java.io.ByteArrayOutputStream;
import java.io.PrintStream;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class LegacyTest {

    private ByteArrayOutputStream outputStream;


    @BeforeEach
    public void setUp() {
        System.out.println("Setup executed before EACH test");
        outputStream = new ByteArrayOutputStream();
        System.setOut(new PrintStream(outputStream));
    }

    @Test
    public void legacyTest() {

        MessageSender sender = new MessageSender();

        sender.processMessage("ALERT ON PRODUCTION", "madalin@yahoo.com");

        assertEquals("Email sent to madalin@yahoo.com with message = ALERT ON PRODUCTION", outputStream.toString());
    }
}
