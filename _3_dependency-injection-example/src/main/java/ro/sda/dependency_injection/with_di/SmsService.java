package ro.sda.dependency_injection.with_di;

public class SmsService implements MessageService{

    public SmsService() {
        System.out.println("SmsService created!");
    }

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Sms send to " + receiver + " with message= " + message);
    }
}
