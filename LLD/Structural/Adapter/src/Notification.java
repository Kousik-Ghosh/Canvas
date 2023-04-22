public class Notification {
    
    String notificationHeading;
    String notificationText;

    public Notification(String notificationHeading, String notificationText) {
        this.notificationHeading = notificationHeading;
        this.notificationText = notificationText;
    }

    @Override
    public String toString() {
        return "Notification [notificationHeading=" + notificationHeading + ", notificationText=" + notificationText
                + "]";
    }

    

    
}