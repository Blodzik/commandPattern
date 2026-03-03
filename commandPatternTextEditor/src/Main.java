import command.AppendTextCommand;
import command.DeleteTextCommand;
import invoker.EditorEngine;
import receiver.TextDocument;

public class Main {
    public static void main(String[] args) {
        TextDocument document = new TextDocument();
        EditorEngine engine = new EditorEngine();

        System.out.println("Beginning: [" + document.getContent() + "]");

        engine.executeCommand(new AppendTextCommand(document, "Hello"));
        System.out.println("After Append 1: [" + document.getContent() + "]");

        engine.executeCommand(new AppendTextCommand(document, " Java"));
        System.out.println("After Append 2: [" + document.getContent() + "]");

        engine.executeCommand(new DeleteTextCommand(document, 4));
        System.out.println("After delete 4 symbols: [" + document.getContent() + "]");

        System.out.println("\n--- Undo Ctrl+Z ---");
        engine.undo();
        System.out.println("After 1 UNDO: [" + document.getContent() + "]");

        engine.undo();
        System.out.println("After 2 UNDO: [" + document.getContent() + "]");

        engine.undo();
        System.out.println("After 3 UNDO: [" + document.getContent() + "]");


    }
}