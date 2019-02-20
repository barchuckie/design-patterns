package decorator;

public class FacebookChannel implements SocialChannel {
    private String message;

    public FacebookChannel(String message) {
        this.message = message;
    }

    public String getMessage() {
        return "Facebook: " + message;
    }
}
