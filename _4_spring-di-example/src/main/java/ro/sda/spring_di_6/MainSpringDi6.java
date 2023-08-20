package ro.sda.spring_di_6;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_6.beans.Cat;
import ro.sda.spring_di_6.configuration.ProjectConfig;

public class MainSpringDi6 {
    public static void main(String[] args) {

        try (var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            System.out.println("Context was properly initialized");

            Cat c1 = context.getBean(Cat.class);
            c1.sayMeow();

            System.out.println("Before exiting try-with-resources");

        }
        System.out.println("Context was gracefully shutdown");

    }
}
