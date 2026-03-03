package command;

import receiver.TextDocument;

public class AppendTextCommand implements Command {
    private final TextDocument document;
    private final String textToAppend;

    public AppendTextCommand(TextDocument document, String textToAppend) {
        this.document = document;
        this.textToAppend = textToAppend;
    }

    @Override
    public void execute() {
        document.append(textToAppend);
    }

    @Override
    public void undo() {
        document.delete(textToAppend.length());
    }

}
