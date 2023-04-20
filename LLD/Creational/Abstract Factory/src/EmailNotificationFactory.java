public class EmailNotificationFactory implements NotificationAbstractFactory{

    @Override
    public Notification createNotification() {
        return new EmailNotification();
    }
    
}
