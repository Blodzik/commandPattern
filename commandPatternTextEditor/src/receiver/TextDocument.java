package receiver;

public class TextDocument {
    private StringBuilder content = new StringBuilder();

    public void append(String text) {
        content.append(text);
    }

    public void delete(int length) {
        if(length > content.length()) {
            length = content.length();
        }
        content.delete(content.length() - length, content.length());
    }

    public String getContent() {
        return content.toString();
    }
}
