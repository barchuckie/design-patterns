package state;

public class StateThree implements State {
    public void goNext(Context in) {
        in.setState(new StateOne());
    }

    public String getName() {
        return "StateThree";
    }
}
