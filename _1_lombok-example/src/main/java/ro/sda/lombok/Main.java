package ro.sda.lombok;

public class Main {
    public static void main(String[] args) {
        User u1 = new User();
        User u2 = new User("Madalin", "Ioan", 20);

        u1.setFirstName("Leo");
        u1.setLastName("Messi");
        u1.setAge(36);

        System.out.println(u1.toString());
        System.out.println(u2);

        System.out.println("--------------------------------");

        System.out.println(u1.getFirstName());
        System.out.println(u1.getAge());

    }
}
