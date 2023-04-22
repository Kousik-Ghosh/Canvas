public class Notification extends Communication implements Cloneable{

    String type;
    Content content;

    public Notification(String communicationType, String type, Content content) {
        super(communicationType);
        this.type = type;
        this.content = content;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public Content getContent() {
        return content;
    }

    public void setContent(Content content) {
        this.content = content;
    }

    @Override
    public Notification clone(){
        return new Notification(super.getCommunicationType(),this.type, new Content(this.getContent().getHeading(), this.getContent().getBody()));
    }
    
}
