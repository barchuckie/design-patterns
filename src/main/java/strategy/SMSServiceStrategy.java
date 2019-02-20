package strategy;

import templatemethod.Advertisement;
import templatemethod.services.SMSService;

public class SMSServiceStrategy implements ServiceStrategy {
    @Override
    public void send(Advertisement ad) {
        SMSService.send(ad);
    }
}
