package ro.sda.spring_di_2;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_2.beans.Dog;
import ro.sda.spring_di_2.beans.Owner;
import ro.sda.spring_di_2.config.Config;

public class MainSpringDi2 {

    public static void main(String[] args) {

        try(AnnotationConfigApplicationContext ctx =
                    new AnnotationConfigApplicationContext(Config.class)){

            Owner o = ctx.getBean(Owner.class);

            System.out.println(o);

            Dog d1 = o.getDog();
            System.out.println(d1);

            Dog d2 = ctx.getBean(Dog.class);
            System.out.println(d2);

            System.out.println(o);

        }





    }
}
