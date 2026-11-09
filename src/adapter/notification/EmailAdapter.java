package adapter.notification;

public class EmailAdapter implements NotificationService {

    private EmailClient emailClient;

    public EmailAdapter(EmailClient emailClient) {
        this.emailClient = emailClient;
    }

    @Override
    public void send(String recipient, String message) {
        emailClient.sendEmail(recipient, "Notification", message);
    }
}