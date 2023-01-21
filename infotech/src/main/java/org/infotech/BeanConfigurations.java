package org.infotech;

import org.infotech.model.Employee;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class BeanConfigurations {

    @Bean
    Employee employee() {
        return new Employee();
    }

}
