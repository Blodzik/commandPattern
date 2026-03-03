package invoker;

import command.Command;

public class RemoteController {
    private Command button1;
    private Command button2;

    public RemoteController(Command button1, Command button2) {
        this.button1 = button1;
        this.button2 = button2;
    }

    public void pressButton1() {
        if(button1 != null) {
            button1.execute();
        } else {
            System.out.println("Button has not been configured");
        }
    }

    public void pressButton2() {
        if(button2 != null) {
            button2.execute();
        } else {
            System.out.println("Button has not been configured");
        }
    }
}
