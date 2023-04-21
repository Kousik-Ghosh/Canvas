public class SMSNotificationBuilder extends NotificationBuilder{

    String sourcePhoneNo;
    SMSNotificationBuilder(String sourcePhoneNo, String heading, String body) {
        super(heading, body);
        this.sourcePhoneNo =  sourcePhoneNo;
    }

    public SMSNotificationBuilder setSiteLink(String siteLink) {
        this.siteLink = siteLink;
        return this;
    }

    public SMSNotificationBuilder setImageLink(String imageLink) {
        this.imageLink = imageLink;
        return this;
    }
    
    SMSNotification build(){
        return new SMSNotification(this);
    }
}
