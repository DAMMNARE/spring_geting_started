package ro.sda.spring_di_1;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;
import ro.sda.spring_di_1.components.Dog;
import ro.sda.spring_di_1.config.ProjectConfig;

public class MainSpringD1 {
    public static void main(String[] args) {

        AnnotationConfigApplicationContext ctx = new AnnotationConfigApplicationContext(ProjectConfig.class);

        Dog d1 = ctx.getBean(Dog.class);
        d1.sayHam();
        System.out.println(d1);

        Dog d2 = ctx.getBean(Dog.class);
        d2.sayHam();
        System.out.println(d2);
    }
}
