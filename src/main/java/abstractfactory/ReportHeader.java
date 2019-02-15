package abstractfactory;

import java.util.Date;

public interface ReportHeader extends ReportElement {
    void setName(String name);
    void setDate(Date date);
}
