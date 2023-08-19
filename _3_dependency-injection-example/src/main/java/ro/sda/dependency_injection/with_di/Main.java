package ro.sda.dependency_injection.with_di;

/**
 * As we can see we can further extend our application to allow facebook/slack and other messaging, without rewriting the
 * existent classes. We will have to write a new service class that implements the contract interface.
 * So the dependency injection solved the problem with hard-coded dependency and helped us in making our app
 * flexible and easy to extend.
 */

public class Main {
    public static void main(String[] args) {

        // we keep inside a variable of type interface/parent
        // the reference to a child object (polymorphism)
        MessageSender sender = new MessageSenderImpl(new EmailService());
        sender.processMessage("ALERT", "Catalin@yahoo.com");

        MessageSender sender2 = new MessageSenderImpl(new SmsService());
        sender2.processMessage("ALERT", "0722222222");


    }

}