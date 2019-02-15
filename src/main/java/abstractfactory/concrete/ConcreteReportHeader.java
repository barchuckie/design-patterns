package abstractfactory.concrete;

import abstractfactory.ReportHeader;

import java.util.Date;

public class ConcreteReportHeader implements ReportHeader {
    private String name;
    private Date date;

    public void setName(String name) {
        this.name = name;
    }
    public void setDate(Date date) {
        this.date = date;
    }

    public String getType() {
        return "Concrete";
    }
}
