import chainofresponsibility.DisposeFilter;
import chainofresponsibility.ProperValueFilter;
import chainofresponsibility.denomination.FiftiesDisposer;
import chainofresponsibility.denomination.HundredsDisposer;
import chainofresponsibility.denomination.TensDisposer;
import chainofresponsibility.denomination.TwentiesDisposer;
import org.junit.Test;

import static org.mockito.Mockito.*;

public class ChainOfResponsibilityTest {
    @Test
    public void testDispose() {
        DisposeFilter filter1 = new ProperValueFilter();
        DisposeFilter filter2 = new HundredsDisposer();
        DisposeFilter filter3 = new FiftiesDisposer();
        DisposeFilter filter4 = new TwentiesDisposer();
        DisposeFilter filter5 = new TensDisposer();
        filter1.setNext(filter2);
        filter2.setNext(filter3);
        filter3.setNext(filter4);
        filter4.setNext(filter5);
        filter1.dispose(190);
    }

    @Test
    public void testProperValueDisposeWithMock() {
        DisposeFilter filter = new ProperValueFilter();
        DisposeFilter mockedFilter = mock(DisposeFilter.class);
        filter.setNext(mockedFilter);
        filter.dispose(190);
        verify(mockedFilter).dispose(190);
        filter.dispose(98);
        verifyNoMoreInteractions(mockedFilter);
    }


}
