class Runner{
    public static void main(String[] args) {
        
        String offerDescription = "Easy-Affordable loans.\n" +
                                    "For all the Govt Employee\n" +
                                    "as well as Business Owners.";
        Offer offer = new Offer("Loans", offerDescription);
        Notification notification = NotificationAdapter.getNotification(offer);

        System.out.println(notification.toString());
    }
}