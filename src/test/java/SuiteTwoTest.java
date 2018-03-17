import org.junit.Assert;
import org.junit.Test;

public class SuiteTwoTest {

    /** Test of setName() method, of class Value */

    @Test
    public void createAndSetName() {

        Value v1 = new Value();

        v1.setName("Y");

        String expected = "Y";
        String actual = v1.getName();

        Assert.assertEquals(expected, actual);
        System.out.println("Suite Test 1 is successful " + actual);
    }
}
