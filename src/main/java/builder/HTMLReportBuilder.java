package builder;

public class HTMLReportBuilder implements ReportBuilder {
    private StringBuilder builder = new StringBuilder();

    public void setCustomerName(String name) {
        builder.append("Name: ").append(name);
    }
    public void setCustomerPhone(int phoneNumber) {
        builder.append("Phone: ").append(phoneNumber);
    }
    public void setCustomerAge(int age) {
        builder.append("Age: ").append(age);
    }
    public void setCustomerGender(String gender) {
        builder.append("Gender: ").append(gender);
    }
    public void setCustomerBalance(double balance) {
        builder.append("Balance: ").append(balance);
    }

    public Report getReport() {
        HTMLReport report = new HTMLReport();
        report.putContent(builder.toString());
        return report;
    }
}
