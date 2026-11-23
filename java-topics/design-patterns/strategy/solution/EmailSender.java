package strategy.solution;

public class EmailSender implements Notifier {
    @Override
    public void sendNotification(String message, String recipient) {
        System.out.println("Sending Email Notification");
        System.out.println("Recipient: " + recipient);
        System.out.println("Message: " + message);
    }

}
