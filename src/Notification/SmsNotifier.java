package Notification;

public class SmsNotifier implements INotification{
    @Override
    public void sendMassage(String massage) {
        System.out.println("sms sent");
    }
}
