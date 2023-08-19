package ro.sda.spring_di_1.config;

import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;

@Configuration
@ComponentScan(basePackages = "ro.sda.spring_di_1.components")
public class ProjectConfig {

    public ProjectConfig() {
        System.out.println("Project configuration constructor called.");
    }
}
