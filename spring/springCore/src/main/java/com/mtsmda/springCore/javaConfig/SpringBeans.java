package com.mtsmda.springCore.javaConfig;

import com.mtsmda.springCore.Person;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.Import;

/**
 * Created by MTSMDA on 14.12.2015.
 */
@Configuration
@Import(value = {SpringBeansFileSystem.class})
public class SpringBeans {

    @Bean(name = "personPetrov")
    public Person getPerson(){
        return new Person("Petrov", "Petr", "Petrovici");
    }

}