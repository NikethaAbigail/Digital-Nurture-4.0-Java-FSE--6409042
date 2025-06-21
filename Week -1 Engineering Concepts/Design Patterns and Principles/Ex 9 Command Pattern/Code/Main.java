package command;

public class Main {
    public static void main(String[] args) {
       
        Light livingRoomLight = new Light("Living Room");

       
        Command lightOn = new LightOnCommand(livingRoomLight);
        Command lightOff = new LightOffCommand(livingRoomLight);

        
        RemoteControl remote = new RemoteControl();

        // Test turning light on
        remote.setCommand(lightOn);
        System.out.println("Pressing button to turn light ON:");
        remote.pressButton();

        // Test turning light off
        remote.setCommand(lightOff);
        System.out.println("\nPressing button to turn light OFF:");
        remote.pressButton();

        // Test with no command set
        remote.setCommand(null);
        System.out.println("\nPressing button with no command set:");
        remote.pressButton();
    }
}