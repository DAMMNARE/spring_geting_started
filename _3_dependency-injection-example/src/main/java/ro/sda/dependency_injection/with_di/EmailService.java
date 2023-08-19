package ro.sda.dependency_injection.with_di;

public class EmailService implements MessageService {

    public EmailService() {
        System.out.println("Email service created!");
    }

    @Override
    public void sendMessage(String message, String receiver) {
        // logic to send email
        System.out.println("Email send to " + receiver + " with message=" + message);
    }
}
