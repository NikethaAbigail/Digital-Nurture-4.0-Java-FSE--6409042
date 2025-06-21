package decorator;

public class Main {
    public static void main(String[] args) {

        Notifier emailNotifier = new EmailNotifier();

        Notifier smsNotifier = new SMSNotifierDecorator(emailNotifier);

        
        Notifier multiChannelNotifier = new SlackNotifierDecorator(smsNotifier);

        
        String message = "Meeting scheduled at 11:00 AM IST on June 21, 2025.";
        System.out.println("Sending notification:");
        multiChannelNotifier.send(message);
    }
}