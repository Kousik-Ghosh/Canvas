class Runner{
    public static void main(String[] args) throws Exception{
        
        DB db =  NotificationDBConnector.getConnector().getDB();
        
        db.insert("1", new Notification("HDFC", "Home Loan"));
        db.insert("2", new Notification("HDFC", "Car Loan"));

        System.out.println(db.retrive("1"));
        System.out.println(db.retrive("2"));

    }
}