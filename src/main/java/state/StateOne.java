package state;

public class StateOne implements State {
    public void goNext(Context in) {
        in.setState(new StateTwo());
    }

    public String getName() {
        return "StateOne";
    }
}