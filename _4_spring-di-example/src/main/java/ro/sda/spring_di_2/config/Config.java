package ro.sda.spring_di_2.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring_di_2.beans.Dog;
import ro.sda.spring_di_2.beans.Owner;

@Configuration
public class Config {

    @Bean
    public Dog dog(){
        Dog d = new Dog();
        d.setName("Pit");
        return d;
    }

    @Bean
    public Owner owner(){
        Owner o = new Owner();
        o.setName("John");
        o.setDog(dog());
        return o;
    }

}
