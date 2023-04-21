public class Runner {
  public static void main(String[] args){


    EmailNotification email = new EmailNotificationBuilder("marketing@hdfc.com", "Loan", "Cheap Home Loan").build();
    System.out.println(email.getSourceEmailID());
    System.out.println(email.getHeading());
    System.out.println(email.getBody());
    System.out.println(email.getSiteLink());
    System.out.println(email.getImageLink());


    System.out.println("-----");

    EmailNotification emailWithLink = new EmailNotificationBuilder("marketing@HDFC.com", "Loan", "Cheap Home Loan")
                                          .setSiteLink("http://www.hdfc.com/loan")
                                          .build();
    System.out.println(emailWithLink.getSourceEmailID());
    System.out.println(emailWithLink.getHeading());
    System.out.println(emailWithLink.getBody());
    System.out.println(emailWithLink.getSiteLink());
    System.out.println(emailWithLink.getImageLink());

    System.out.println("-----");

    EmailNotification emailComplete = new EmailNotificationBuilder("marketing@HDFC.com", "Loan", "Cheap Home Loan")
                                          .setSiteLink("http://www.hdfc.com/loan")
                                          .setImageLink("http://www.hdfc.com/logo.png")
                                          .build();
    System.out.println(emailComplete.getSourceEmailID());
    System.out.println(emailComplete.getHeading());
    System.out.println(emailComplete.getBody());
    System.out.println(emailComplete.getSiteLink());
    System.out.println(emailComplete.getImageLink());



    System.out.println("--------------------------");


    SMSNotification sms = new SMSNotificationBuilder("+91-9999999999", "Loan", "Cheap Home Loan").build();
    System.out.println(sms.getSourcePhoneNo());
    System.out.println(sms.getHeading());
    System.out.println(sms.getBody());
    System.out.println(sms.getSiteLink());
    System.out.println(sms.getImageLink());


    System.out.println("-----");

    SMSNotification smsWithLink = new SMSNotificationBuilder("+91-9999999999", "Loan", "Cheap Home Loan")
                                  .setSiteLink("http://www.hdfc.com/loan")
                                  .build();
    System.out.println(smsWithLink.getSourcePhoneNo());
    System.out.println(smsWithLink.getHeading());
    System.out.println(smsWithLink.getBody());
    System.out.println(smsWithLink.getSiteLink());
    System.out.println(smsWithLink.getImageLink());

    System.out.println("-----");

    SMSNotification smsComplete = new SMSNotificationBuilder("+91-9999999999", "Loan", "Cheap Home Loan")
                                  .setSiteLink("http://www.hdfc.com/loan")
                                  .setImageLink("http://www.hdfc.com/logo.png")
                                  .build();
    System.out.println(smsComplete.getSourcePhoneNo());
    System.out.println(smsComplete.getHeading());
    System.out.println(smsComplete.getBody());
    System.out.println(smsComplete.getSiteLink());
    System.out.println(smsComplete.getImageLink());



  }
}
