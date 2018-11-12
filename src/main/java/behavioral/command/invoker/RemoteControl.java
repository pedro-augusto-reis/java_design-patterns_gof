package behavioral.command.invoker;

import behavioral.command.command.Command;

//Invoker
public class RemoteControl{
    private Command command;
    public void setCommand(Command command){
        this.command = command;
    }
    public void pressButton(){
        command.execute();
    }
}
