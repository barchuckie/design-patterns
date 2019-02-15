package abstractfactory.concrete;

import abstractfactory.ReportBody;

public class ConcreteReportBody implements ReportBody {
    private String content;

    public void setContent(String content) {
        this.content = content;
    }

    public String getType() {
        return "Concrete";
    }
}
