package chainofresponsibility;

public class ProperValueFilter extends DisposeFilter {
    @Override
    public void dispose(int sum) {
        if(sum % 10 == 0) {
            next.dispose(sum);
        }
    }
}
