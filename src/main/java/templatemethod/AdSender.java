package templatemethod;

public interface AdSender {

    default void deliver(Advertisement ad) {
        ad = translate(ad);
        send(ad);
    }

    Advertisement translate(Advertisement ad);
    void send(Advertisement ad);
}
