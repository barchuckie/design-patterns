package decorator;

public class FacebookChannel implements SocialChannel{
    public String getMessage() {
        return "Facebook: ";
    }
}
