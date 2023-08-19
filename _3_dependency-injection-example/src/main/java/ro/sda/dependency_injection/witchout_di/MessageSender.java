package ro.sda.dependency_injection.witchout_di;

public class MessageSender {

    private  EmailService emailService = new EmailService();

    public void processMessage(String msg, String receiver) {
        if (msg == null || msg.isBlank()) {
            throw new InvalidEmailException("Message is blank or null");
        }
        if (receiver == null || receiver.isBlank()) {
            throw new InvalidEmailException("Message is blank or null");
        }
        this.emailService.sendEmail(msg, receiver);
    }

    static class InvalidEmailException extends RuntimeException{
        public InvalidEmailException(String message) {
            super(message);
        }
    }
}
