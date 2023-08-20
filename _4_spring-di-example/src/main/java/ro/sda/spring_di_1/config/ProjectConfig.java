package ro.sda.spring_di_1.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import ro.sda.spring_di_1.beans.Cat;

@Configuration
@ComponentScan(basePackages = "ro.sda.spring_di_1.components")
public class ProjectConfig {

    public ProjectConfig() {
        System.out.println("Project configuration constructor called.");
    }

    // Using @Bean annotation makes this class/instance a component managed by the framework

    @Bean
    public Cat myCatBean() {
        return new Cat();
    }
}
