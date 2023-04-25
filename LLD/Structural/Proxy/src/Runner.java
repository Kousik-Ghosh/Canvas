class Runner{
    public static void main(String[] args) {
      
        NotificationDispatcherProxy notificationDispatcherProxy = new NotificationDispatcherProxy();
        notificationDispatcherProxy.dispatcherProxy(new Notification());
        notificationDispatcherProxy.dispatcherProxy(new SMS());
        notificationDispatcherProxy.dispatcherProxy(new Email());

    }
}