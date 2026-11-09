package adapter.notification;

public class EmailClient {

    public void sendEmail(String emailAddress, String subject, String body) {
        System.out.println("Email sent to " + emailAddress);
        System.out.println("Subject: " + subject);
        System.out.println("Body: " + body);
    }
}