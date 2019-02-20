package templatemethod;

import templatemethod.services.MailService;

public class MailAdSender implements AdSender {

    @Override
    public Advertisement translate(Advertisement ad) {
        return null;
    }

    @Override
    public void send(Advertisement ad) {
        MailService.send(ad);
    }
}
