package builder;

public class Main {
    public static void main(String[] args) {


        Computer basicComputer = new Computer.Builder("Intel i3", 8, 256)
                .build();
        System.out.println("Basic Computer: " + basicComputer);

        
        Computer gamingComputer = new Computer.Builder("Intel i7", 16, 512)
                .setGraphicsCard(true)
                .setSSD(true)
                .build();
        System.out.println("\nGaming Computer: " + gamingComputer);

       
        Computer workstation = new Computer.Builder("AMD Ryzen 9", 32, 1000)
                .setGraphicsCard(true)
                .build();
        System.out.println("\nWorkstation: " + workstation);
    }
}