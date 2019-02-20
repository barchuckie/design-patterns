package builder.concrete;

import builder.Report;
import builder.ReportBuilder;
import builder.concrete.ConcreteReport;

public class ConcreteReportBuilder implements ReportBuilder {
    private StringBuilder builder = new StringBuilder();

    public void setCustomerName(String name) {
        builder.append("Name: ").append(name).append("\n");
    }
    public void setCustomerPhone(int phoneNumber) {
        builder.append("Phone: ").append(phoneNumber).append("\n");
    }
    public void setCustomerAge(int age) {
        builder.append("Age: ").append(age).append("\n");
    }
    public void setCustomerGender(String gender) {
        builder.append("Gender: ").append(gender).append("\n");
    }
    public void setCustomerBalance(double balance) {
        builder.append("Balance: ").append(balance).append("\n");
    }

    public Report getReport() {
        ConcreteReport report = new ConcreteReport();
        report.putContent(builder.toString());
        return report;
    }
}
