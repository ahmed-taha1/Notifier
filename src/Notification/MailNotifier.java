package Notification;

public class MailNotifier implements INotification{
    @Override
    public void sendMassage(String massage) {
        System.out.println("mail sent");
    }
}