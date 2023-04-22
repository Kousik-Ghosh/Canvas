public class NotificationAdapter {
    
    static public Notification getNotification(Offer offer) {
		return new Notification(offer.offerName, offer.offerDescription.split("\n")[0]);
	}


}
