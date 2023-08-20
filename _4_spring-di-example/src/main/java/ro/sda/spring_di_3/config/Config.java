package ro.sda.spring_di_3.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring_di_3.beans.Dog;
import ro.sda.spring_di_3.beans.Owner;

@Configuration
public class Config {

    @Bean
    public Owner owner786() {
        Owner o1 = new Owner();
        o1.setName("Alex");
        o1.setDog(dog123());
        return o1;
    }

    @Bean
    public Dog dog123() {
        Dog d = new Dog();
        d.setName("Rex");
        return d;
    }
}
