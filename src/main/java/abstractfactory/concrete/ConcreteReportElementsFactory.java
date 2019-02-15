package abstractfactory.concrete;

import abstractfactory.AbstractReportElementsFactory;
import abstractfactory.ReportBody;
import abstractfactory.ReportFooter;
import abstractfactory.ReportHeader;

public class ConcreteReportElementsFactory implements AbstractReportElementsFactory {
    public ReportHeader createHeader() {
        return new ConcreteReportHeader();
    }

    public ReportBody createBody() {
        return new ConcreteReportBody();
    }

    public ReportFooter createFooter() {
        return new ConcreteReportFooter();
    }
}
