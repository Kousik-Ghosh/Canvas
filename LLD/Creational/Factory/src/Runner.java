public class Runner {
  public static void main(String[] args){


    Notification emailNotification = NotificationFactory.getEmailNotification();
    emailNotification.notifyUser();

    Notification smsNotification = NotificationFactory.getSMSNotification();
    smsNotification.notifyUser();

  }
}
