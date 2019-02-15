import adapter.Shape;
import adapter.SquareAdapter;
import org.junit.Assert;
import org.junit.Test;

public class AdapterTest {

    @Test
    public void testSquareAdapter() {
        Shape square = new SquareAdapter(5);

        Assert.assertEquals(25, square.getArea(), 0.0125);
        Assert.assertEquals(20, square.getPerimeter(), 0.0125);
    }
}
