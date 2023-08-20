package ro.sda.spring_di_6.components;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import ro.sda.spring_di_6.beans.Cat;

import javax.annotation.PostConstruct;
import javax.annotation.PreDestroy;

@Component
public class Owner {

    private  Cat cat;

    public Owner(Cat cat) {
        this.cat = cat;
        System.out.println("Owner constructor called");
    }

    @PostConstruct
    public void init(){
        System.out.println("Owner was created");
    }

    @PreDestroy
    public void destroy() {
        System.out.println("Owner is destroying");
    }

    // Injection by setter
    //@Autowired
    public void setCat(Cat cat) {
        this.cat = cat;
    }
}
