public class Runner {
  public static void main(String[] args){

    Content content = new Content("HDFC", "Home Loans.");
    Notification notification = new Notification("Online","Email", content);

    System.out.println(notification.getCommunicationType());
    System.out.println(notification.getType());
    System.out.println(notification.getContent().getHeading());
    System.out.println(notification.getContent().getBody());
    System.out.println();
    
    
    Notification notificationClone = notification.clone();


    notificationClone.setCommunicationType("Phone");
    notificationClone.setType("SMS");
    notificationClone.getContent().setHeading("ICICI");
    notificationClone.getContent().setHeading("Car Loans.");
    System.out.println();

    
    System.out.println(notification.getCommunicationType());
    System.out.println(notification.getType());
    System.out.println(notification.getContent().getHeading());
    System.out.println(notification.getContent().getBody());
    System.out.println();


    System.out.println(notificationClone.getCommunicationType());
    System.out.println(notificationClone.getType());
    System.out.println(notificationClone.getContent().getHeading());
    System.out.println(notificationClone.getContent().getBody());

  }
}
