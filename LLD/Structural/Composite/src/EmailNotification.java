public class EmailNotification implements Notification{
    String heading;
    EmailNotification(String s){
        heading = s;
    }
    @Override
    public String toString() {
        return "EmailNotification [heading=" + heading + "]";
    }
}
