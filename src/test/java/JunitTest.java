import org.junit.runner.RunWith;
import org.junit.runners.Suite;

@RunWith(Suite.class)
@Suite.SuiteClasses({
        SuiteOneTest.class,
        SuiteTwoTest.class
})
public class JunitTest {
    // This class remains empty, it is used only as a holder for the above annotations
}
