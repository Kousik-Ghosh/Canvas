public class NotificationFacade {
    
    private static EmailNotification emailNotification;
    private static void createNewNotification(){
        emailNotification = new EmailNotification();
    }

    private static void setHeading(){
        emailNotification.setHeading("Easy Loans!");
    }

    private static void setBody(){
        emailNotification.setBody("Easy Car Loans for you!");
    }

    private static void verifyWithAccounting(){
        System.out.println("Verifying with Accounting...");
    }

    private static void verifyWithFinance(){
        System.out.println("Verifying with Finance...");
    }

    private static void checkForInconsistency(){
        System.out.println("Checking for Inconsistency...");
    }

    public static void sendNotification(){
        createNewNotification();
        setHeading();
        setBody();
        verifyWithAccounting();
        verifyWithFinance();
        checkForInconsistency();

        System.out.println("Sending Notification :: "+emailNotification);
    }

}
