package decorator;

public class CensorshipDecorator extends SocialChannelDecorator {
    private String censure;

    public CensorshipDecorator(String censure, SocialChannel socialChannel) {
        delegate = socialChannel;
        this.censure = censure;
    }

    @Override
    public String getMessage() {
        return delegate.getMessage().replace(censure, "XXX");
    }
}
