package com.mtsmda.springCore.OXM.jaxb;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import org.springframework.oxm.Marshaller;
import org.springframework.oxm.jaxb.Jaxb2Marshaller;

import javax.xml.transform.stream.StreamResult;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Created by MTSMDA on 18.12.2015.
 */
public class RunMain {

    public static void main(String[] args) throws Exception {
        ApplicationContext applicationContext = new ClassPathXmlApplicationContext("spring/OXM/springBeansJAXB.xml");
        Jaxb2Marshaller jaxbMarshallerBean = applicationContext.getBean("jaxbMarshallerBean", Jaxb2Marshaller.class);

        Program program = new Program();
        program.setId(15);
        program.setName("Skype");
        program.setProcessName("skype.exe");

        jaxbMarshallerBean.marshal(program, new StreamResult(new FileWriter("program")));
        System.out.println("done");

    }

}