package builder;

public class HTMLReport implements Report {
    private String content;

    public void putContent(String content) {
        this.content = content;
    }

    public String getContent() {
        return content;
    }
}
