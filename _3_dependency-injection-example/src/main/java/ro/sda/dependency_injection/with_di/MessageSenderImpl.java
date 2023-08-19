package ro.sda.dependency_injection.with_di;

public class MessageSenderImpl implements MessageSender{

    private MessageService service;

    public MessageSenderImpl(MessageService service) {
        this.service = service;
    }

    @Override
    public void processMessage(String msg, String rec) {
        // do some validation, manipulation logic etc.
        if (msg == null || msg.isBlank()) {
            throw new InvalidMessageException("Message is blank or null");
        }
        if (rec == null || rec.isBlank()) {
            throw new InvalidMessageException("Receiver is blank or null");
        }
        this.service.sendMessage(msg,rec);
    }

    static class InvalidMessageException extends RuntimeException {
        public InvalidMessageException(String message) {
            super(message);
        }
    }
}
