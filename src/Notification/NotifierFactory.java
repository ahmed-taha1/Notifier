package Notification;

import java.util.HashMap;
import java.util.Map;

public class NotifierFactory {
    private static Map<String, INotification> notifierMapping;
    private static NotifierFactory notifierFactoryInstance = null;
    private NotifierFactory(){
        notifierMapping = new HashMap<>();
        notifierMapping.put("mail",new MailNotifier());
        notifierMapping.put("sms",new SmsNotifier());
        notifierMapping.put("push",new PushNotifier());
    }
    public static NotifierFactory getNotifierFactoryInstance(){
        if(notifierFactoryInstance == null){
            notifierFactoryInstance = new NotifierFactory();
        }
        return notifierFactoryInstance;
    }
    public INotification getStrategy(String strategyName){
        return notifierMapping.get(strategyName);
    }
    public String[] getStrategies(){
        return notifierMapping.keySet().toArray(new String[0]);
    }
}