package decorator;

public abstract class SocialChannelDecorator implements SocialChannel {
    SocialChannel delegate;

    public void setDecoratedSocialChannel(SocialChannel decoratedSocialChannel) {
        this.delegate = decoratedSocialChannel;
    }
}
