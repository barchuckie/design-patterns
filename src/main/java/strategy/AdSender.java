package strategy;

import templatemethod.Advertisement;

public class AdSender {
    private ServiceStrategy serviceStrategy;
    private TranslateStrategy translateStrategy;

    public AdSender(ServiceStrategy serviceStrategy, TranslateStrategy translateStrategy) {
        this.serviceStrategy = serviceStrategy;
        this.translateStrategy = translateStrategy;
    }

    public void deliver(Advertisement ad) {
        translateStrategy.translate(ad);
        serviceStrategy.send(ad);
    }
}
