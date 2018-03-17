import org.junit.Ignore;
import org.junit.Test;

import static org.junit.Assert.assertEquals;

@Ignore("This is an example of ignoring a whole test class")
public class JunitExampleTest {

    public String message = "Thomas";

    JUnitMessage junitMessage = new JUnitMessage(message);

    //@Ignore("This is an example of a single test method being ignored")
    @Test
    public void testJUnitMessage() {

        System.out.println("Junit Message is printing");
        assertEquals(message, junitMessage.printMessage());

    }

    @Test
    public void testJUnitHiMessage() {
        message="Hi!" +message;
        System.out.println("Junit Hi Message is printing ");
        assertEquals(message, junitMessage.printHiMessage());

    }
}
