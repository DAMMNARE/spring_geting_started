package ro.sda.spring_di_6.configuration;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring_di_6.beans.Cat;

@Configuration
public class ProjectConfig {

    @Bean
    public Cat cat() {
        return new Cat();
    }
}
