package templatemethod;

import templatemethod.services.SMSService;

public class SMSAdSender implements AdSender {

    @Override
    public Advertisement translate(Advertisement ad) {
        return null;
    }

    @Override
    public void send(Advertisement ad) {
        SMSService.send(ad);
    }
}
