public class SMSNotification extends Notificaion{

    String sourcePhoneNo;
    SMSNotification(SMSNotificationBuilder smsNotificationBuilder) {
        super(smsNotificationBuilder);
        this.sourcePhoneNo = smsNotificationBuilder.sourcePhoneNo;
    }
    
    public String getSourcePhoneNo() {
        return sourcePhoneNo;
    }

}
