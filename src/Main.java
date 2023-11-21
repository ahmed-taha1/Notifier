import Notification.*;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        // variables
        NotifierFactory notifierFactory = NotifierFactory.getNotifierFactoryInstance();
        String[] strategies = notifierFactory.getStrategies();
        INotification notifier = null;
        int choose;

        //view
        System.out.println("please choose notification method: ");
        for (int i = 0; i < strategies.length; i++) {
            System.out.println((i + 1) + "- " + strategies[i]);
        }
        System.out.print(">> ");
        choose = new Scanner(System.in).nextInt();


        notifier = notifierFactory.getStrategy(strategies[choose - 1]);
        assert notifier != null;
        notifier.sendMassage("hello world");
    }
}