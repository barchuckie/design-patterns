package abstractfactory;

public class Report {
    private ReportHeader reportHeader;
    private ReportBody reportBody;
    private ReportFooter reportFooter;

    public Report(AbstractReportElementsFactory factory) {
        reportHeader = factory.createHeader();
        reportBody = factory.createBody();
        reportFooter = factory.createFooter();
    }

    public ReportHeader getReportHeader() {
        return reportHeader;
    }

    public ReportBody getReportBody() {
        return reportBody;
    }

    public ReportFooter getReportFooter() {
        return reportFooter;
    }
}
