package invoker;

import command.Command;

import java.util.Stack;

public class EditorEngine {
    private Stack<Command> historyStack = new Stack<>();

    public void executeCommand(Command command) {
        command.execute();
        historyStack.push(command);
    }

    public void undo() {
        if(!historyStack.isEmpty()) {
            Command lastCommand = historyStack.pop();
            lastCommand.undo();
        } else {
            System.out.println("Nothing to undo");
        }
    }
}
