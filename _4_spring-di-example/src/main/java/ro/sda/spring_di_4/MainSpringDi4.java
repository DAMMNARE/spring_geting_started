package ro.sda.spring_di_4;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_4.components.Dog;
import ro.sda.spring_di_4.components.Owners;
import ro.sda.spring_di_4.config.ProjectConfig;

public class MainSpringDi4 {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(ProjectConfig.class)) {

            Dog d1 = context.getBean("myCustomBeanForDog", Dog.class);
            System.out.println(d1);

            Owners o1 = context.getBean("owners", Owners.class);
            System.out.println(o1);
            System.out.println(o1.getDog());

        }
    }
}
