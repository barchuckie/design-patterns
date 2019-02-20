import builder.Report;
import builder.ReportBuilder;
import builder.concrete.ConcreteReportBuilder;
import org.junit.Assert;
import org.junit.Test;

public class BuilderTest {
    @Test
    public void testReportBuilding() {
        ReportBuilder builder = new ConcreteReportBuilder();
        builder.setCustomerName("Patryk");
        builder.setCustomerAge(21);
        builder.setCustomerPhone(612901872);
        builder.setCustomerGender("Male");
        builder.setCustomerBalance(781.63);
        Report report = builder.getReport();
        String expected = "Name: Patryk\nAge: 21\nPhone: 612901872\nGender: Male\nBalance: 781.63\n";
        Assert.assertEquals(expected, report.getContent());
    }
}
