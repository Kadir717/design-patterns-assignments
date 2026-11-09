package adapter.notification;

public class SmsNotificationService implements NotificationService {

    @Override
    public void send(String recipient, String message) {
        System.out.println("SMS sent to " + recipient);
        System.out.println("Message: " + message);
    }
}