public class NotificationFactory {
    
    static Notification getSMSNotification(){
        return new SMSNotification();
    }

    static Notification getEmailNotification(){
        return new EmailNotification();
    }

}
