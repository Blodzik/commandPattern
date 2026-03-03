package command;

import receiver.TextDocument;

public class DeleteTextCommand implements Command {
    private final TextDocument textDocument;
    private final int length;

    private String deletedText;

    public DeleteTextCommand(TextDocument textDocument, int length) {
        this.textDocument = textDocument;
        this.length = length;
    }

    @Override
    public void execute() {
        String currentDocument = textDocument.getContent();
        int actualLength = Math.min(length, currentDocument.length());

        deletedText = currentDocument.substring(currentDocument.length() - actualLength);

        textDocument.delete(actualLength);
    }

    @Override
    public void undo() {
        textDocument.append(deletedText);
    }
}
