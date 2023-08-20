package ro.sda.spring_di_4.components;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Getter
@Component
public class Owners {
    private String name;

    public Owners() {
        System.out.println("Owners constructor called!");
    }

    // field injection
    // @Autowired
    private Dog dog;

    public void setName(String name) {
        this.name = name;
    }

    //setter injection
    @Autowired
    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
