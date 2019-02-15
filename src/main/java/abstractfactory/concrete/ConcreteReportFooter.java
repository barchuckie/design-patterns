package abstractfactory.concrete;

import abstractfactory.ReportFooter;

public class ConcreteReportFooter implements ReportFooter {
    private String signature;

    public void setSignature(String signature) {
        this.signature = signature;
    }

    public String getType() {
        return "Concrete";
    }
}
