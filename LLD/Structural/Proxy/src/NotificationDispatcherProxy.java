public class NotificationDispatcherProxy {
    
    void dispatcherProxy(Communication communication){
        if(communication instanceof Notification || communication instanceof SMS){
            NotificationDispatcher.dispatch(communication);
        }else{
            System.out.println(communication.getClass()+" Not Suitable for dispatch. Try other ways to send.");
        }
    }

}