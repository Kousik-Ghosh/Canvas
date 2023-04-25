import java.util.Iterator;
import java.util.LinkedList;

public class NotificationBundle implements Notification{

    static LinkedList<Notification> notificationQueue = new LinkedList<Notification>();

    static void addNotification(Notification...notifications){
        for (Notification notification : notifications) {
            notificationQueue.offer(notification);
        }
    }

    static void printAllNotification(){
        System.out.println("Notification Queue:: "+notificationQueue.size());

        Iterator<Notification> itr = notificationQueue.iterator();
        while (itr.hasNext()) {
            System.out.println(itr.next().toString());
        }

        while (notificationQueue.size() > 0) {
            notificationQueue.removeFirst();
        }
        
        if(notificationQueue.size() == 0){
            System.out.println("Notification Printer Tray is Empty.");
        }
    }


}
