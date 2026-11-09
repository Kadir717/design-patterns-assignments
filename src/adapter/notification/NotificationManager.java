package adapter.notification;

public class NotificationManager {

    private NotificationService notificationService;

    public NotificationManager(NotificationService notificationService) {
        this.notificationService = notificationService;
    }

    public void sendNotification(String recipient, String message) {
        notificationService.send(recipient, message);
    }
}