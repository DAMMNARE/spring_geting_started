package ro.sda.spring_di_4.components;

import lombok.Getter;
import org.springframework.stereotype.Component;

@Getter
@Component("myCustomBeanForDog")
public class Dog {
    private String name;

    public Dog() {
        System.out.println("Dog constructor called!");
    }

    public Dog(String name) {
        this.name = name;
    }

    public void setName(String name) {
        this.name = name;
    }
}
