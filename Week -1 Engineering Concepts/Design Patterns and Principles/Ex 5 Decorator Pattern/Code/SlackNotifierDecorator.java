package decorator;

public class SlackNotifierDecorator extends NotifierDecorator {
    public SlackNotifierDecorator(Notifier notifier) {
        super(notifier);
    }

    @Override
    public void send(String message) {
        super.send(message); // Send via the wrapped notifier
        addSlackNotification(message);
    }

    private void addSlackNotification(String message) {
        System.out.println("Sending Slack message: " + message);
    }
}