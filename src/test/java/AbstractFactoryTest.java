import abstractfactory.AbstractReportElementsFactory;
import abstractfactory.Report;
import abstractfactory.concrete.ConcreteReportElementsFactory;
import org.junit.Assert;
import org.junit.Test;

public class AbstractFactoryTest {

    @Test
    public void testCreateConcreteReport() {
        AbstractReportElementsFactory factory = new ConcreteReportElementsFactory();
        Report report = new Report(factory);
        Assert.assertEquals("Concrete", report.getReportBody().getType());
        Assert.assertEquals("Concrete", report.getReportHeader().getType());
        Assert.assertEquals("Concrete", report.getReportFooter().getType());
    }

}
