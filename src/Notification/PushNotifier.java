package Notification;

public class PushNotifier implements INotification{
    @Override
    public void sendMassage(String massage) {
        System.out.println("notification sent");
    }
}
