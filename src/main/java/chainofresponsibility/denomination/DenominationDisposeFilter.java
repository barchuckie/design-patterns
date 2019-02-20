package chainofresponsibility.denomination;

import chainofresponsibility.DisposeFilter;

public class DenominationDisposeFilter extends DisposeFilter {

    protected int value;

    @Override
    public void dispose(int sum) {
        int counter = 0;
        while(sum >= value) {
            counter++;
            sum-=value;
        }
        System.out.println("Num of $" + value + " bills: " + counter);
        if(next != null) next.dispose(sum);
    }
}
