public class NotificationFactory {
    public static Notification getNotificationObject(NotificationAbstractFactory notificationAbstractFactory){
        return notificationAbstractFactory.createNotification();
    }
}
