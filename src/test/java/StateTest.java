import org.junit.Assert;
import org.junit.Test;
import state.Context;

public class StateTest {
    @Test
    public void testStates() {
        Context context = new Context();

        Assert.assertEquals("StateOne", context.getStateName());
        context.goNext();
        Assert.assertEquals("StateTwo", context.getStateName());
        context.goNext();
        Assert.assertEquals("StateThree", context.getStateName());
        context.goNext();
        Assert.assertEquals("StateOne", context.getStateName());
    }
}
