package builder.concrete;

import builder.Report;

public class ConcreteReport implements Report {
    private String content;

    public void putContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
