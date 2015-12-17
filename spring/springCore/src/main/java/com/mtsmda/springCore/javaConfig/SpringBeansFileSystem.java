package com.mtsmda.springCore.javaConfig;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.io.File;

/**
 * Created by MTSMDA on 14.12.2015.
 */
@Configuration
public class SpringBeansFileSystem {

    @Bean(name = "fileName1txt")
    public String fileName(){
        return "1.txt";
    }

    @Bean(name = "file")
    public File getFile(){
        return new File(fileName());
    }

}