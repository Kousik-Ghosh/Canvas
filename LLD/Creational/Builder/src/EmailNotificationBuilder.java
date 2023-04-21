public class EmailNotificationBuilder extends NotificationBuilder{

    String sourceEmailID;
    EmailNotificationBuilder(String sourceEmailID, String heading, String body) {
        super(heading, body);
        this.sourceEmailID = sourceEmailID;
    }
    
    public EmailNotificationBuilder setSiteLink(String siteLink) {
        this.siteLink = siteLink;
        return this;
    }

    public EmailNotificationBuilder setImageLink(String imageLink) {
        this.imageLink = imageLink;
        return this;
    }

    EmailNotification build(){
        return new EmailNotification(this);
    }
}
