package strategy.problem;

public class Problem {
    public static void main(String[] args) {
        SendNotificationWithoutStrategy("Email", "Hello, this is a test email notification.", "user@example.com");  
    }
    public static void SendNotificationWithoutStrategy(String notificationType, String message, String recipient) {

        if (notificationType.equals("Email")) {
            System.out.println("Sending Email Notification");
            System.out.println("Recipient: " + recipient);
            System.out.println("Destination: " + recipient);
            System.out.println("Message: " + message);

        } else if (notificationType.equals("SMS")) {
            System.out.println("Sending SMS Notification");
            System.out.println("Recipient: " + recipient);
            System.out.println("Destination: " + recipient);
            System.out.println("Message: " + message);

        } else if (notificationType.equals("Push")) {
            System.out.println("Sending Push Notification");
            System.out.println("Recipient: " + recipient);
            System.out.println("Destination: " + recipient);
            System.out.println("Message: " + message);

        } else {
            System.out.println("Invalid Notification Type");
        }
    }
}