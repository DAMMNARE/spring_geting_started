package ro.sda.dependency_injection.with_di;

public class SlackService implements MessageService{

    @Override
    public void sendMessage(String message, String receiver) {
        System.out.println("Slack send to " + receiver + " with message= " + message);
    }
}
