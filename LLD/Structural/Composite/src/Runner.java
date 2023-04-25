class Runner{

    public static void main(String[] args) {
        
        NotificationBundle.addNotification(new SMSNotification("Loan1"), 
                                            new EmailNotification("Loan2"),
                                            new SMSNotification("Loan3"),
                                            new EmailNotification("Loan4"));        
        NotificationBundle.printAllNotification();     
        

        NotificationBundle.addNotification(new SMSNotification("Loan1"));
        NotificationBundle.printAllNotification();     


        NotificationBundle.addNotification(new SMSNotification("Loan1"), 
                                            new EmailNotification("Loan2"));
        NotificationBundle.printAllNotification();     

    }

}