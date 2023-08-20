package ro.sda.spring_di_3;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_3.beans.Dog;
import ro.sda.spring_di_3.beans.Owner;
import ro.sda.spring_di_3.config.Config;

public class MainSpringDi3 {
    public static void main(String[] args) {

        try(var context = new AnnotationConfigApplicationContext(Config.class)) {

            Owner o1 = context.getBean(Owner.class);
            Dog d1 = o1.getDog();

            System.out.println(d1);
            System.out.println(d1.getName());

        }
    }
}
