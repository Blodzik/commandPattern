import command.Command;
import command.LightOnCommand;
import command.RadioOnCommand;
import invoker.RemoteController;
import receiver.Light;
import receiver.Radio;

public class Main {
    public static void main(String[] args) {
        Light livingRoomLight = new Light();
        Radio kitchenRadio = new Radio();

        Command lightOn = new LightOnCommand(livingRoomLight);
        Command radioOn = new RadioOnCommand(kitchenRadio);

        RemoteController controller = new RemoteController(lightOn, radioOn);

        controller.pressButton1();

        controller.pressButton2();
    }
}