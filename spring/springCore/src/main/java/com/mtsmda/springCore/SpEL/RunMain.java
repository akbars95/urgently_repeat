package com.mtsmda.springCore.SpEL;

import com.mtsmda.springCore.SpEL.annotationVersion.Person;
import com.mtsmda.springCore.SpEL.referenceBean.HelloBean;
import javafx.application.Application;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring\\SpEL\\springBeansSpEL.xml");
        Car carAudi100 = applicationContext.getBean("carAudi100", Car.class);
        System.out.println(carAudi100);

        System.out.println(applicationContext.getBean("personGrigorii", Person.class));

        //annotation version
        HelloBean helloBean1 = applicationContext.getBean("helloBean1", HelloBean.class);
        System.out.println(helloBean1.getSayHello());
        System.out.println(helloBean1.getMyInformation());
        System.out.println(helloBean1.getaDouble100());

        //xml version
        System.out.println("--------------xml--");
        HelloBean helloBean2 = applicationContext.getBean("helloBean2", HelloBean.class);
        System.out.println(helloBean2.getSayHello());
        System.out.println(helloBean2.getMyInformation());
        System.out.println(helloBean2.getaDouble100());

        //operators
        JavaOperators spELJavaOp = applicationContext.getBean("SpELJavaOp", JavaOperators.class);
        System.out.println(spELJavaOp);
        System.out.println("arbitrar - y" + spELJavaOp.getArbitrary());

        JavaOperators javaOperatorsXML = applicationContext.getBean("javaOperatorsXML", JavaOperators.class);
        System.out.println(javaOperatorsXML.isLess());
        System.out.println(javaOperatorsXML.isLessEquals());
        System.out.println("arbitrary - " + javaOperatorsXML.getArbitrary());

        SpELCollections spELCollections = applicationContext.getBean("spELCollections", SpELCollections.class);
        System.out.println(spELCollections.getList());
        System.out.println(spELCollections.getMap());
        System.out.println(spELCollections.getIntegers().length);
        System.out.println(spELCollections.getGetIndex1());
    }

}