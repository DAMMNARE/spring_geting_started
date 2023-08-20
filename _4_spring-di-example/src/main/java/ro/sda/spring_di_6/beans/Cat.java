package ro.sda.spring_di_6.beans;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

public class Cat {

    public Cat() {
        System.out.println("Cat constructor called!");
    }

    public void sayMeow() {
        System.out.println("Meow");
    }

    @PostConstruct
    public void init(){
        System.out.println("Cat was created!");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Cat is destroying!");
    }
}
