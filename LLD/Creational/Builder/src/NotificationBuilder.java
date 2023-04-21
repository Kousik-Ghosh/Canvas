public class NotificationBuilder {
    // Required
    String heading;
    String body;

    // Optional
    String siteLink;
    String imageLink;

    NotificationBuilder(String heading, String body){
        this.heading = heading;
        this.body = body;
    }  
}
