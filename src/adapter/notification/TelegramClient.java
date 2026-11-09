package adapter.notification;

public class TelegramClient {

    public void sendTelegramMessage(String chatId, String text) {
        System.out.println("Telegram message sent to " + chatId);
        System.out.println("Message: " + text);
    }
}