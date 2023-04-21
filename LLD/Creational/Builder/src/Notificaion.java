public class Notificaion {
    
    // Required
    String heading;
    String body;

    // Optional
    String siteLink;
    String imageLink;

    Notificaion(NotificationBuilder notificationBuilder){
         this.heading = notificationBuilder.heading;
         this.body = notificationBuilder.body;
         this.siteLink = notificationBuilder.siteLink;
         this.imageLink = notificationBuilder.imageLink;
    }

    public String getHeading() {
        return heading;
    }

    public String getBody() {
        return body;
    }

    public String getSiteLink() {
        return siteLink;
    }

    public String getImageLink() {
        return imageLink;
    }


    
}
