package command;

import receiver.Radio;

public class RadioOnCommand implements Command {
    private Radio radio;

    public RadioOnCommand(Radio radio) {
        this.radio = radio;
    }

    @Override
    public void execute() {
        radio.turnOn();
    }
}
