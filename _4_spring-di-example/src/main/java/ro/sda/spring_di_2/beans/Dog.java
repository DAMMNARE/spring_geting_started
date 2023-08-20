package ro.sda.spring_di_2.beans;

import lombok.Getter;

@Getter
public class Dog {

    private String name;

    public void setName(String name) {
        this.name = name;
    }
}
