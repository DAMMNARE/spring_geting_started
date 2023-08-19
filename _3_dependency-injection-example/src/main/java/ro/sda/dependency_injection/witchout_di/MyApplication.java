package ro.sda.dependency_injection.witchout_di;

/**
 * If we want to extend ou app in the future to provide some additional messaging futures, such as
 * sending SMS or SLACK messages then we would need to change our MessageSender for that. This will
 * involve code changes in MessageSender  and MYApplication class too.
 *-
 * Testing the application will be very difficult since our application is directly creating the email
 * service instance. There is no way we can mock this email service. (mock means mimic the service)
 */
public class MyApplication {
    public static void main(String[] args) {

        MessageSender sender = new MessageSender();
        sender.processMessage("ALERT ON PRODUCTION", "madalin@yahoo.com");
    }
}
