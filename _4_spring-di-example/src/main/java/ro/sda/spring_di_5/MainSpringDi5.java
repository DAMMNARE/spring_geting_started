package ro.sda.spring_di_5;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_5.beans.Rat;
import ro.sda.spring_di_5.beans.Wolf;
import ro.sda.spring_di_5.config.ProjectConfig;

public class MainSpringDi5 {
    public static void main(String[] args) {

        try(var context = new  AnnotationConfigApplicationContext(ProjectConfig.class)) {

            Rat r1 = context.getBean(Rat.class);
            Rat r2 = context.getBean(Rat.class);

            r1.eatCheese();
            r2.eatCheese();

            System.out.println(r1);
            System.out.println(r2);

            System.out.println("..............................");

            Wolf w1 = context.getBean(Wolf.class);
            Wolf w2 = context.getBean(Wolf.class);
            Wolf w3 = context.getBean(Wolf.class);

            w1.hunt();
            w2.hunt();
            w3.hunt();

            System.out.println(w1);
            System.out.println(w2);
            System.out.println(w3);

        }

    }
}
