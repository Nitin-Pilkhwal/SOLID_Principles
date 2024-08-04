// The Dependency Inversion Principle (DIP) is one of the SOLID principles in object-oriented programming. It states that high-level modules should not depend on low-level modules. Both should depend on abstractions.

// To illustrate this principle, let's consider an example. Suppose we have a NotificationService class that sends notifications to users. It currently depends on a EmailSender class to send email notifications.


class NotificationService {
    private EmailSender emailSender;

    public NotificationService() {
        this.emailSender = new EmailSender();
    }

    public void sendNotification(String message) {
        emailSender.sendEmail(message);
    }
}

class EmailSender {
    public void sendEmail(String message) {
        // Code to send email
    }
}
// In the above code, the NotificationService directly depends on the EmailSender class. This violates the Dependency Inversion Principle because the high-level module (NotificationService) depends on the low-level module (EmailSender).



// To adhere to the Dependency Inversion Principle, we need to introduce an abstraction between the NotificationService and EmailSender. We can create an interface called NotificationSender that both classes will depend on:
interface NotificationSender {
    void sendNotification(String message);
}

class NotificationService2 {
    private NotificationSender notificationSender;

    public NotificationService2(NotificationSender notificationSender) {
        this.notificationSender = notificationSender;
    }

    public void sendNotification(String message) {
        notificationSender.sendNotification(message);
    }
}

class EmailSender2 implements NotificationSender {
    public void sendNotification(String message) {
        // Code to send email
    }
}

// Now, the NotificationService depends on the NotificationSender interface instead of the concrete EmailSender class. This allows us to easily switch to a different implementation of NotificationSender without modifying the NotificationService class. The Dependency Inversion Principle helps in reducing coupling between classes and makes the code more flexible and maintainable.