public class SMSNotification implements Notification{
    String heading;
    SMSNotification(String s){
        heading = s;
    }
    @Override
    public String toString() {
        return "SMSNotification [heading=" + heading + "]";
    }
}
