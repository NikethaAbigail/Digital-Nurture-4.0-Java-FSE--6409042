package proxy;

public class Main {
    public static void main(String[] args) {
        
        Image image1 = new ProxyImage("photo1.jpg");
        Image image2 = new ProxyImage("photo2.jpg");

        
        System.out.println("First display of image1 at 10:59 PM IST, June 21, 2025:");
        image1.display();

        
        System.out.println("\nSecond display of image1:");
        image1.display();

        
        System.out.println("\nFirst display of image2:");
        image2.display();
    }
}