package behavioral.command.client;

import behavioral.command.command.Command;
import behavioral.command.command.LightOffCommand;
import behavioral.command.command.LightOnCommand;
import behavioral.command.invoker.RemoteControl;
import behavioral.command.receiver.Light;

//Client
public class Client{
    public static void main(String[] args)    {
        RemoteControl control = new RemoteControl();
        Light light = new Light();
        Command lightsOn = new LightOnCommand(light);
        Command lightsOff = new LightOffCommand(light);
        //switch on
        control.setCommand(lightsOn);
        control.pressButton();
        //switch off
        control.setCommand(lightsOff);
        control.pressButton();
    }
}
