public class NotificationDispatcher {
    
    static void dispatch(Communication communication){
        System.out.println("Dispatching :: "+communication.getClass());
    }

}