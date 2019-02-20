package chainofresponsibility;

public abstract class DisposeFilter {
    protected DisposeFilter next;

    public void setNext(DisposeFilter next) {
        this.next = next;
    }

    public abstract void dispose(int sum);
}
