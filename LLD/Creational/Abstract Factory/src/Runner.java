public class Runner {
    public static void main(String[] args){
        
       Notification emailNotification =  NotificationFactory.geNotificationObject(new EmailNotificationFactory());
       emailNotification.notifyUser();

       Notification smsNotification =  NotificationFactory.geNotificationObject(new SMSNotificationFactory());
       smsNotification.notifyUser();

    }
}
