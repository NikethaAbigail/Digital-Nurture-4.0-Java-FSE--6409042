package command;

public class Light {
    private String location;

    public Light(String location) {
        this.location = location;
    }

    public void turnOn() {
        System.out.println("Light is ON at " + location + " at 11:15 PM IST, June 21, 2025.");
    }

    public void turnOff() {
        System.out.println("Light is OFF at " + location + " at 11:15 PM IST, June 21, 2025.");
    }
}