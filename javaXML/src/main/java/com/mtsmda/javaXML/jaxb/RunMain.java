package com.mtsmda.javaXML.jaxb;

import javax.xml.bind.JAXBContext;
import javax.xml.bind.JAXBElement;
import javax.xml.bind.Marshaller;
import javax.xml.bind.Unmarshaller;
import javax.xml.namespace.QName;
import javax.xml.transform.stream.StreamSource;
import java.io.File;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/**
 * Created by c-DMITMINZ on 15.12.2015.
 */
public class RunMain {

    public static void main(String[] args) throws Exception {
        convertObjectToXML();
        List<FootballClub> footballClubs = Arrays.asList(new FootballClub("Barcelona", "Spain", "Barcelona", "Leo Messi", 25), new FootballClub("Real Madrid", "Spain", "Madrid", "C.Ronaldo", 29));

        convertXMLToObject();

        Customer customer = new Customer(new ArrayList<String>());
        customer.setCountEmails(new ArrayList<Integer>());
        customer.setNumber(300);
        customer.getEmailAddress().add("ivan.ivanov@gmail.com");
        customer.getEmailAddress().add("petrov.petr@gmail.com");
        customer.getCountEmails().add(15);
        customer.getCountEmails().add(19);
        customer.getPriceList().put("milk", 10);
        createCustomer(customer);

        System.out.println("_____________________");
        createWrapperClass();

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

    private static void convertXMLToObject() throws Exception {
        File file = new File("Barcelona.xml");

        JAXBContext jaxbContext = JAXBContext.newInstance(FootballClub.class);
        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        Object unmarshal = unmarshaller.unmarshal(file);
        if (unmarshal instanceof FootballClub) {
            System.out.println(((FootballClub) unmarshal));
        }
        System.out.println("Unmarshal - OK");
    }


    private static void createCustomer(Customer customer) throws Exception {
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

    private static void createWrapperClass() throws Exception {
        JAXBContext jaxbContext = JAXBContext.newInstance(Wrapper.class, Person.class);

        Marshaller marshaller = jaxbContext.createMarshaller();
        marshaller.setProperty(Marshaller.JAXB_ENCODING, "UTF-8");
        marshaller.setProperty(Marshaller.JAXB_FORMATTED_OUTPUT, true);

        List<Person> persons = Arrays.asList(new Person("Ivan", 7),new Person("Petr", 27));

        marshal(marshaller, persons, "persons", new File("person.xml"));

        Unmarshaller unmarshaller = jaxbContext.createUnmarshaller();

        for (Object o : unmarshal(unmarshaller, Person.class, "person.xml")){
            System.out.println(o);
        }

    }

    private static void marshal(Marshaller marshaller, List<?> objects, String name, File file) throws Exception {
        QName qName = new QName(name);
        Wrapper wrapper = new Wrapper(objects);
        JAXBElement<Wrapper> jaxbElement = new JAXBElement<Wrapper>(qName, Wrapper.class, wrapper);
        if (!file.exists()) {
            file.createNewFile();
        }
        marshaller.marshal(jaxbElement, file);
    }

    private static <T> List<T> unmarshal(Unmarshaller unmarshaller, Class<T> tClass, String xmlLocation) throws Exception{
        StreamSource streamSource = new StreamSource(new File(xmlLocation));
        Wrapper<T> tWrapper = (Wrapper<T>)unmarshaller.unmarshal(streamSource, Wrapper.class).getValue();
        return tWrapper.getItems();
    }

}