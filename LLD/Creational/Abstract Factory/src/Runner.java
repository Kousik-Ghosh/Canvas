public class Runner {
    public static void main(String[] args){
        
       Notification emailNotification =  NotificationFactory.getNotificationObject(new EmailNotificationFactory());
       emailNotification.notifyUser();

       Notification smsNotification =  NotificationFactory.getNotificationObject(new SMSNotificationFactory());
       smsNotification.notifyUser();

    }
}
