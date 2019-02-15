package state;

public class StateTwo implements State {
    public void goNext(Context in) {
        in.setState(new StateThree());
    }

    public String getName() {
        return "StateTwo";
    }
}
