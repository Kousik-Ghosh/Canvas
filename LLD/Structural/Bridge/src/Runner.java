@SuppressWarnings(value = "unused")
class Runner{

    public static void main(String[] args) {
        
        HomeLoanOffer homeLoanOfferByEmail = new HomeLoanOffer(new EmailNotification());
        HomeLoanOffer homeLoanOfferBySMS   = new HomeLoanOffer(new SMSNotification());

        CarLoanOffer carLoanOfferByEmail = new CarLoanOffer(new EmailNotification());
        CarLoanOffer carLoanOfferBySMS   = new CarLoanOffer(new SMSNotification());

    }

}