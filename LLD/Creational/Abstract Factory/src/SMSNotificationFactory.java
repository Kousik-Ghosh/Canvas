public class SMSNotificationFactory implements NotificationAbstractFactory{

    @Override
    public Notification createNotification() {
        return new SMSNotification();
    }
    
}
