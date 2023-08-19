package ro.sda.spring_di_1.components;

import org.springframework.stereotype.Component;

// Stereotype annotation -> @Component, @Service, @Controller, @Repository
@Component
public class Dog {

    public Dog() {
        System.out.println("Dog constructor called!");
    }

    public void sayHam() {
        System.out.println("ham ham");
    }
}
