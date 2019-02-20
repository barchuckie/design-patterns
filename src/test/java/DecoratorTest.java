import decorator.*;
import org.junit.Assert;
import org.junit.Test;

public class DecoratorTest {
    @Test
    public void testMessageTruncator() {
        SocialChannel facebookChannel = new FacebookChannel("Hello World!");
        SocialChannelDecorator decorator = new MessageTruncator(20, facebookChannel);

        Assert.assertEquals("Facebook: Hello Worl", decorator.getMessage());
    }

    @Test
    public void testCensorship() {
        SocialChannel facebookChannel = new FacebookChannel("Hello World!");
        SocialChannelDecorator decorator = new CensorshipDecorator("Hello", facebookChannel);

        Assert.assertEquals("Facebook: XXX World!", decorator.getMessage());
    }

    @Test
    public void testChainDecorators() {
        SocialChannel facebookChannel = new FacebookChannel("Hello World!");
        SocialChannelDecorator messageTruncator = new MessageTruncator(20, facebookChannel);
        SocialChannelDecorator censorshipDecorator = new CensorshipDecorator("Hello", messageTruncator);

        Assert.assertEquals("Facebook: XXX Worl", censorshipDecorator.getMessage());
    }
}
