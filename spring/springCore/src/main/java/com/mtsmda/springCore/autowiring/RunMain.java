package com.mtsmda.springCore.autowiring;

import com.mtsmda.springCore.autowiring.controller.FootballPlayerController;
import com.mtsmda.springCore.autowiring.service.FootballPlayerService;
import com.mtsmda.springCore.autowiring.service.FootballPlayerServiceImpl;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

import java.lang.annotation.Annotation;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring\\autowiring\\springBeansAutowiring.xml");
        EmployeeService employeeService = applicationContext.getBean("employeeService", EmployeeService.class);
        System.out.println(employeeService.getEmployeeDAO());

        FootballPlayerController footballPlayerController = applicationContext.getBean("footballPlayerController", FootballPlayerController.class);
        footballPlayerController.index();

        System.out.println("****************************");
        AutowiredSetter autowiredSetter = applicationContext.getBean("autowiredSetter", AutowiredSetter.class);
        System.out.println("SETTER - " + autowiredSetter.getFootballPlayer());

        AutowiredInstanceVariable autowiredInstanceVariable = applicationContext.getBean("autowiredInstanceVariable", AutowiredInstanceVariable.class);
        System.out.println("INSTANCE VARIABLE - " + autowiredInstanceVariable);

        AutowiredConstructor autowiredConstructor = applicationContext.getBean("autowiredConstructor", AutowiredConstructor.class);
        System.out.println("CONSTRUCTOR - " + autowiredConstructor);



        //getAnnotations();
    }

    private static void getAnnotations(){
        Annotation[] declaredAnnotations = FootballPlayerServiceImpl.class.getAnnotations();
        for(Annotation annotation : declaredAnnotations){
            System.out.println(annotation.toString());
        }
    }

}
