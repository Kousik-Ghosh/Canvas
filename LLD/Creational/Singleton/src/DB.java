import java.util.HashMap;

public class DB {
    
    static HashMap<String, Notification> db = new HashMap<String, Notification>();

    void insert(String ID, Notification notification){
        db.put(ID, notification);
    }

    void delete(String ID){
        db.remove(ID);
    }

    Notification retrive(String ID){
        return db.get(ID);
    }

}
