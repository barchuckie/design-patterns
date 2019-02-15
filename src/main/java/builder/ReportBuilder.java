package builder;

public interface ReportBuilder {
    void setCustomerName(String name);
    void setCustomerPhone(int phoneNumber);
    void setCustomerAge(int age);
    void setCustomerGender(String gender);
    void setCustomerBalance(double balance);

    Report getReport();
}
