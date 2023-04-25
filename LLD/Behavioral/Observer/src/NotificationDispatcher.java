import java.util.ArrayList;

public class NotificationDispatcher {
    
    static ArrayList<Subsriber> subsribers = new ArrayList<Subsriber>();

    void addSubscriber(Subsriber subsriber){
        subsribers.add(subsriber);
    }

    void notifySubscribers(){
        for (Subsriber subsriber : subsribers) {
                subsriber.showNotification();
        }
    }

}