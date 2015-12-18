package com.mtsmda.springCore;

import com.mtsmda.springCore.InitializingBeanAndDisposableBean.AnnotationVariant;
import com.mtsmda.springCore.InitializingBeanAndDisposableBean.CustomService;
import com.mtsmda.springCore.InitializingBeanAndDisposableBean.InitAndDestroyXML;
import com.mtsmda.springCore.beanScopes.Message;
import com.mtsmda.springCore.beanScopes.ScopeBean;
import com.mtsmda.springCore.collections.ExampleListFactoryBean;
import com.mtsmda.springCore.collections.ExampleMapFactoryBean;
import com.mtsmda.springCore.collections.ExampleSetFactoryBean;
import com.mtsmda.springCore.collections.ExampleWithCollections;
import com.mtsmda.springCore.dateInject.ExampleDate;
import com.mtsmda.springCore.di.FileOutputGenerator;
import com.mtsmda.springCore.di.JSONOutputGenerator;
import com.mtsmda.springCore.inheritance.Player;
import com.mtsmda.springCore.mandatory.MandatoryClass;
import org.springframework.context.ApplicationContext;
import org.springframework.context.ConfigurableApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.jdbc.datasource.DriverManagerDataSource;

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

        collections(applicationContext);
        list(applicationContext);
        set(applicationContext);
        map(applicationContext);
        date(applicationContext);


        //
        Database database9 = applicationContext.getBean("driverManagerDataSource", Database.class);
        System.out.println(database9.getUrl());

        //inheritance
        Player bean = applicationContext.getBean("cronaldo", Player.class);
        System.out.println(bean);
        bean = applicationContext.getBean("ronaldo", Player.class);
        System.out.println(bean);
        /*bean = applicationContext.getBean("general", Player.class);
        System.out.println(bean);   Error creating bean with name 'general': Bean definition is abstract*/

        //mandatory
        /*System.out.println(applicationContext.getBean("mandatoryClass", MandatoryClass.class).toString());//Caused by: org.springframework.beans.factory.BeanInitializationException: Property 'color' is required for bean 'mandatoryClass'*/

        configurableApplicationContext();
    }


    private static void collections(ApplicationContext applicationContext) {
        System.out.println("---------------collections------------------");
        System.out.println("list - " + applicationContext.getBean("collections", ExampleWithCollections.class).getGenderPersons());
        System.out.println("persons - " + applicationContext.getBean("collections", ExampleWithCollections.class).getPersons());
        System.out.println("cars - " + applicationContext.getBean("collections", ExampleWithCollections.class).getProductPrice());
        System.out.println("db properties - " + applicationContext.getBean("collections", ExampleWithCollections.class).getPropertiesDB());
        System.out.println("---------------------------------");
    }

    private static void list(ApplicationContext applicationContext) {
        System.out.println("---------------list------------------");
        System.out.println("ListFactoryBean - " + applicationContext.getBean("exampleListFactoryBean", ExampleListFactoryBean.class).getStringList());
        System.out.println("class - " + applicationContext.getBean("exampleListFactoryBean", ExampleListFactoryBean.class).getStringList().getClass().getCanonicalName());
        System.out.println("ListFactoryBean 2 - " + applicationContext.getBean("exampleListFactoryBean2", ExampleListFactoryBean.class).getStringList());
        System.out.println("class - " + applicationContext.getBean("exampleListFactoryBean2", ExampleListFactoryBean.class).getStringList().getClass().getCanonicalName());
        System.out.println("---------------------------------");
    }

    private static void set(ApplicationContext applicationContext) {
        System.out.println("---------------set------------------");
        ExampleSetFactoryBean exampleSetFactoryBean = applicationContext.getBean("exampleSetFactoryBean", ExampleSetFactoryBean.class);
        System.out.println("SetFactoryBean - " + exampleSetFactoryBean.getDoubleSet());
        System.out.println("class - " + exampleSetFactoryBean.getDoubleSet().getClass().getCanonicalName());
        ExampleSetFactoryBean exampleSetFactoryBean2 = applicationContext.getBean("exampleSetFactoryBean2", ExampleSetFactoryBean.class);
        System.out.println("SetFactoryBean 2 - " + exampleSetFactoryBean2.getDoubleSet());
        System.out.println("class - " + exampleSetFactoryBean2.getDoubleSet().getClass().getCanonicalName());
        System.out.println("---------------------------------");
    }

    private static void map(ApplicationContext applicationContext) {
        System.out.println("---------------map------------------");
        ExampleMapFactoryBean exampleMapFactoryBean = applicationContext.getBean("exampleMapFactoryBean", ExampleMapFactoryBean.class);
        System.out.println("MapFactoryBean - " + exampleMapFactoryBean.getStringStringMap());
        System.out.println("class - " + exampleMapFactoryBean.getStringStringMap().getClass().getCanonicalName());
        ExampleMapFactoryBean exampleMapFactoryBean2 = applicationContext.getBean("exampleMapFactoryBean2", ExampleMapFactoryBean.class);
        System.out.println("MapFactoryBean 2 - " + exampleMapFactoryBean2.getStringStringMap());
        System.out.println("class - " + exampleMapFactoryBean2.getStringStringMap().getClass().getCanonicalName());
        System.out.println("---------------------------------");
    }

    private static void date(ApplicationContext applicationContext) {
        System.out.println("---------------date------------------");
        ExampleDate exampleDate = applicationContext.getBean("exampleDate", ExampleDate.class);
        System.out.println(exampleDate.getDate());
        /*ExampleDate customDateEditor = applicationContext.getBean("exampleDate2", ExampleDate.class);
        System.out.println(customDateEditor.getDate());*/
        System.out.println("---------------------------------");
    }

    private static void configurableApplicationContext() {
        System.out.println("---------------configurableApplicationContext------------------");
        String[] s = new String[]{"spring/InitializingBeanAndDisposableBean/springBeansInitDispose.xml"};
        ConfigurableApplicationContext configurableApplicationContext = new ClassPathXmlApplicationContext(s);
        System.out.println(configurableApplicationContext.getBean("customService", CustomService.class).getMessage());

        System.out.println(configurableApplicationContext.getBean("initAndDestroyXML", InitAndDestroyXML.class).getMessage());

        System.out.println(configurableApplicationContext.getBean("annotationVariant", AnnotationVariant.class).getMessage());

        configurableApplicationContext.close();
        System.out.println("---------------------------------");
    }


}