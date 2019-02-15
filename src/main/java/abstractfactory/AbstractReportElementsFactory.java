package abstractfactory;

public interface AbstractReportElementsFactory {
    ReportHeader createHeader();
    ReportBody createBody();
    ReportFooter createFooter();
}
