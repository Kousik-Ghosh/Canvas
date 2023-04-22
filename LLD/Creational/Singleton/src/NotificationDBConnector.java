public class NotificationDBConnector {

    private DB notificationDB;
    private static NotificationDBConnector notificationDBConnector;
    private NotificationDBConnector(DB notificationDB){
        this.notificationDB = notificationDB;
    }

    public static NotificationDBConnector getConnector(){
        if(notificationDBConnector == null){
            notificationDBConnector = new NotificationDBConnector(new DB());
        }
        return notificationDBConnector;
    }
    
    public DB getDB() throws Exception{
        if(notificationDBConnector == null){
            System.out.println("Error::NotificationDBConnector not initialised.");
            throw new Exception();
        }
        return notificationDBConnector.notificationDB;
    }

}
