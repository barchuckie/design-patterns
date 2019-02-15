package decorator;

public class MessageTruncator extends SocialChannelDecorator {

    private int maxLength;

    MessageTruncator(int maxLength) {
        this.maxLength = maxLength;
    }

    public MessageTruncator(int maxLength, SocialChannel decoratedSocialChannel) {
        this.maxLength = maxLength;
        this.delegate = decoratedSocialChannel;
    }

    public String getMessage() {
        return delegate.getMessage().substring(0, maxLength);
    }

}
