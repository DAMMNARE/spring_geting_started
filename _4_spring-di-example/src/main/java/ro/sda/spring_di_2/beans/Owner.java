package ro.sda.spring_di_2.beans;

import lombok.Getter;
import org.springframework.beans.factory.annotation.Autowired;

@Getter
public class Owner {

    private String name;

    @Autowired
    private Dog dog;

    public void setName(String name) {
        this.name = name;
    }

    public void setDog(Dog dog) {
        this.dog = dog;
    }
}
