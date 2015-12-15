package com.mtsmda.javaXML.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.Marshaller;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by c-DMITMINZ on 15.12.2015.
 */
public class RunMain {

    public static void main(String[] args) throws Exception{
        convertObjectToXML();
        List<FootballClub> footballClubs = Arrays.asList(new FootballClub("Barcelona", "Spain", "Barcelona", "Leo Messi", 25), new FootballClub("Real Madrid", "Spain", "Madrid", "C.Ronaldo", 29));
        FootballClubs footballClubs1 = new FootballClubs();
        footballClubs1.setFootballClubs(footballClubs);
        convertObjectToXML2(footballClubs1, FootballClubs.class);
        Customer customer = new Customer(new ArrayList<String>());
        customer.setCountEmails(new ArrayList<Integer>());
        customer.setNumber(300);
        customer.getEmailAddress().add("ivan.ivanov@gmail.com");
        customer.getEmailAddress().add("petrov.petr@gmail.com");
        customer.getCountEmails().add(15);
        customer.getCountEmails().add(19);
        createCustomer(customer);
    }

    private static void convertObjectToXML() throws Exception {
        FootballClub footballClub = new FootballClub("Barcelona", "Spain", "Barcelona", "Leo Messi", 25);
        File file = new File(footballClub.getClubName() + ".xml");
        if (!file.exists()) {
            file.createNewFile();
        }

        JAXBContext jaxbContext = JAXBContext.newInstance(FootballClub.class);
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(footballClub, file);
        System.out.println("OK");
    }

    private static void convertObjectToXML2(FootballClubs footballClubs, Class<?> aClass) throws Exception {
        File file = new File("footballClubs" + footballClubs.getFootballClubs().size() + ".xml");
        if (!file.exists()) {
            file.createNewFile();
        }

        JAXBContext jaxbContext = JAXBContext.newInstance(aClass.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(footballClubs, file);
        System.out.println("OK");
    }

    private static void createCustomer(Customer customer) throws Exception{
        File file = new File("customer" + customer.getEmailAddress().size() + ".xml");
        if (!file.exists()) {
            file.createNewFile();
        }
        JAXBContext jaxbContext = JAXBContext.newInstance(customer.getClass());
        Marshaller marshaller = jaxbContext.createMarshaller();

        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        marshaller.marshal(customer, file);
        System.out.println("OK");
    }

}