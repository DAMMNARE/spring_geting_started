package ro.sda.dependency_injection.witchout_di;

/**
 * EmailService class gold the logic to send an email message to recipient email address
 */

public class EmailService {
    public void sendEmail(String email, String receiver) {
        System.out.print("Email sent to " + receiver + " with message = " + email);
    }
}
