public class EmailNotification {
    
    String heading;
    String body;


    public void setHeading(String heading) {
        this.heading = heading;
    }
    public void setBody(String body) {
        this.body = body;
    }

    @Override
    public String toString() {
        return "EmailNotification [heading=" + heading + ", body=" + body + "]";
    }
}