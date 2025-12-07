public class Main {
    public static void main(String[] args) {
        System.out.println("SOLID Principles Demo");

        UserRepository repository = new DatabaseUserRepository();

        User user1 = new User(1, "John", "john@example.com");
        User user2 = new User(2, "Alice", "alice@example.com");

        System.out.println("\n1. Email notification:");
        Notification email = new EmailNotification();
        UserService emailService = new UserService(repository, email);
        emailService.registerUser(user1);
        emailService.notifyUser(1, "Your account is active");

        System.out.println("\n2. SMS notification:");
        Notification sms = new SMSNotification();
        UserService smsService = new UserService(repository, sms);
        emailService.registerUser(user2);
        smsService.notifyUser(2, "Your verification code is 123456");

        System.out.println("\n3. Push notification:");
        Notification push = new PushNotification();
        UserService pushService = new UserService(repository, push);
        pushService.notifyUser(1, "New feature available!");

        System.out.println("\n4. Non-existent user:");
        emailService.notifyUser(999, "This should not be sent");
    }
}