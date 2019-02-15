package decorator;

public class SocialChannelApp {
    public static void main(String[] args) {
        SocialChannelDecorator decorator = new MessageTruncator(100);
        decorator.getMessage();
    }
}