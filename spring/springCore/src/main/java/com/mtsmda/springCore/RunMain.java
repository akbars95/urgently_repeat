package com.mtsmda.springCore;

import com.mtsmda.springCore.beanScopes.Message;
import com.mtsmda.springCore.beanScopes.ScopeBean;
import com.mtsmda.springCore.di.FileOutputGenerator;
import com.mtsmda.springCore.di.JSONOutputGenerator;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by MTSMDA on 13.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        String[] paths = new String[]{"spring/springBeans.xml", "spring/di/springBeansDI.xml", "spring/di/p3wayPropertyInsert.xml"};
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext(paths);
        Person person = applicationContext.getBean("person", Person.class);
        System.out.println(person);

        Database database = applicationContext.getBean("database", Database.class);
        System.out.println(database);

        applicationContext.getBean("fileOutputGeneratorCSV", FileOutputGenerator.class).getOutputGenerator().generate("");
        applicationContext.getBean("jsonOutputGenerator", JSONOutputGenerator.class).generate("");

        System.out.println(applicationContext.getBean("customer", Customer.class));
        System.out.println(applicationContext.getBean("customer2", Customer.class));

        //scope
        Message message = applicationContext.getBean("message", Message.class);
        System.out.println(message.getMessage());
        message.setMessage("Change message");
        System.out.println("change - " + message.getMessage());

        Message message2 = applicationContext.getBean("message", Message.class);
        System.out.println("second - " + message2.getMessage());


        //Prototype
        Message message3 = applicationContext.getBean("messagePrototype", Message.class);
        System.out.println("from spring - " + message3.getMessage());
        message3.setMessage("change");
        System.out.println("change in code - " + message3.getMessage());


        Message message4 = applicationContext.getBean("messagePrototype", Message.class);
        System.out.println("from spring{4} - " + message4.getMessage());
        System.out.println("change in code{4} - " + message4.getMessage());

        System.out.println(applicationContext.getBean("scopeBean1", ScopeBean.class).getCount());
    }



}