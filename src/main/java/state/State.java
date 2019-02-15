package state;

public interface State {
    void goNext(Context in);
    String getName();
}
