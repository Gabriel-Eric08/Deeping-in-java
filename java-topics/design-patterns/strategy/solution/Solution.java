package strategy.solution;

public class Solution {
    public void main(String[] args) {
        SendNotificationWithStrategy(new EmailSender(), "Hello, this is a test email notification.", "test@example.com");
    }
    public static void SendNotificationWithStrategy(Notifier notifier, String message, String recipient) {
        notifier.sendNotification(message, recipient);
    }
}
