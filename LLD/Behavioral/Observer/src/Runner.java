class Runner{

    public static void main(String[] args) {
        
        Subsriber a = new Subsriber("A");
        Subsriber b = new Subsriber("B");
        Subsriber c = new Subsriber("C");
        Subsriber d = new Subsriber("D");
        Subsriber e = new Subsriber("E");


        NotificationDispatcher notificationDispatcher = new NotificationDispatcher();
        notificationDispatcher.addSubscriber(a);
        notificationDispatcher.addSubscriber(b);
        notificationDispatcher.addSubscriber(c);
        notificationDispatcher.addSubscriber(d);
        notificationDispatcher.addSubscriber(e);


        notificationDispatcher.notifySubscribers();
    }
}