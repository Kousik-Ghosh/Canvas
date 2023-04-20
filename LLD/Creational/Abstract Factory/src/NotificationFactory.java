public class NotificationFactory {
    public static Notification geNotificationObject(NotificationAbstractFactory notificationAbstractFactory){
        return notificationAbstractFactory.createNotification();
    }
}
