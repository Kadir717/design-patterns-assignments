package adapter.notification;

public class Main {

    public static void main(String[] args) {

        NotificationManager smsManager =
                new NotificationManager(new SmsNotificationService());

        NotificationManager telegramManager =
                new NotificationManager(
                        new TelegramAdapter(new TelegramClient()));

        NotificationManager emailManager =
                new NotificationManager(
                        new EmailAdapter(new EmailClient()));

        smsManager.sendNotification(
                "+998901234567", "Hello via SMS!");

        telegramManager.sendNotification(
                "123456789", "Hello via Telegram!");

        emailManager.sendNotification(
                "test@gmail.com", "Hello via Email!");
    }
}