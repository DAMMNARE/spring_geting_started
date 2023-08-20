package ro.sda.spring_di_5.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Scope;
import ro.sda.spring_di_5.beans.Rat;
import ro.sda.spring_di_5.beans.Wolf;

@Configuration
public class ProjectConfig {

    @Bean
    public Rat rat() {
        return new Rat();
    }

    @Bean
    @Scope(value = "prototype")
    public Wolf wolf(){
        return new Wolf();
    }

}
