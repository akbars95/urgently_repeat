package com.mtsmda.springCore.OXM;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/OXM/springBeansOXM.xml");
        XMlConverter xMlConverter = applicationContext.getBean("XMlConverter", XMlConverter.class);

        Computer computer = new Computer();
        computer.setGram(false);
        computer.setManufacturer("Sony");
        computer.setVolumeHDD(1024);

        try {
            xMlConverter.convertFromObjectToXML(computer, "file.xml");
        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("done");

    }

}