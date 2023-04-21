public class EmailNotification extends Notificaion{

    String sourceEmailID;
    EmailNotification(EmailNotificationBuilder emailNotificationBuilder) {
        super(emailNotificationBuilder);
        this.sourceEmailID = emailNotificationBuilder.sourceEmailID;
    }
    
    public String getSourceEmailID() {
        return sourceEmailID;
    }
    
}
