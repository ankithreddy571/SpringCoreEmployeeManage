package org.example;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
@Configuration
@ComponentScan
public class AppConfig {
    @Bean
    public Employee employee1() {
        return new Employee(101, "John Doe", "Engineering");
    }
    @Bean
    public Employee employee2() {
        return new Employee(102, "Jane Smith", "Marketing");
    }
    @Bean
    public Employee employee3() {
        return new Employee(103, "Ankith Reddy", "Computer Engineering");
    }
}
