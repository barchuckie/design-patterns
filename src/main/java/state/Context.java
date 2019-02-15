package state;

public class Context {
    private State state;

    public Context() {
        state = new StateOne();
    }

    public void goNext() {
        state.goNext(this);
    }

    public String getStateName() {
        return state.getName();
    }

    void setState(State state) {
        this.state = state;
    }
}
