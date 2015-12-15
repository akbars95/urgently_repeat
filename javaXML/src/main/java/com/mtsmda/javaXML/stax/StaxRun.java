package com.mtsmda.javaXML.stax;

import javax.xml.stream.*;
import javax.xml.stream.events.Characters;
import javax.xml.stream.events.EndElement;
import javax.xml.stream.events.StartElement;
import javax.xml.stream.events.XMLEvent;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

/**
 * Created by c-DMITMINZ on 15.12.2015.
 */
public class StaxRun {

    public static void main(String[] args) throws Exception {
        staxReadXML();
        staxWriteXML();
        System.out.println("_______________________");
        staxReadCursorAPI();
    }

    private static void staxReadXML() throws Exception {
        String fileName = "staxXMLIn.xml";
        File file = new File(fileName);
        System.out.println(file.getAbsolutePath());

        //input
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        xmlInputFactory.setProperty(XMLInputFactory.IS_NAMESPACE_AWARE, true);
        XMLEventReader xmlEventReader = xmlInputFactory.createXMLEventReader(new FileReader(fileName));
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new FileReader(fileName));

        while (xmlEventReader.hasNext()){
            XMLEvent xmlEvent = xmlEventReader.nextEvent();

            if(xmlEvent.getEventType() == XMLStreamConstants.START_ELEMENT){
                StartElement startElement = xmlEvent.asStartElement();
                System.out.println("startElement = " + startElement.getName().getLocalPart());
            }

            if(xmlEvent.getEventType() == XMLStreamConstants.END_ELEMENT){
                EndElement endElement = xmlEvent.asEndElement();
                System.out.println("\tendElement = " + endElement.getName().getLocalPart());
            }

            if(xmlEvent.getEventType() == XMLStreamConstants.CHARACTERS){
                Characters characters = xmlEvent.asCharacters();
                if(characters.getData() != null && !characters.getData().trim().isEmpty()){
                    System.out.println("\t\tcharacter = " + characters.getData());
                }

            }

        }

    }

    private static void staxWriteXML() throws Exception {
        String fileNameStaxXMLOut = "staxXMLOut.xml";
        File fileStaxXMLOut = new File(fileNameStaxXMLOut);
        System.out.println(fileStaxXMLOut.getAbsolutePath());
        //output
        XMLOutputFactory xmlOutputFactory = XMLOutputFactory.newFactory();
        XMLEventFactory xmlEventFactory = XMLEventFactory.newInstance();
        xmlOutputFactory.setProperty(XMLOutputFactory.IS_REPAIRING_NAMESPACES, true);
        XMLEventWriter xmlEventWriter = xmlOutputFactory.createXMLEventWriter(new FileWriter(fileNameStaxXMLOut));

        XMLEvent xmlEvent = xmlEventFactory.createStartDocument();
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createStartElement("mtsmda", "http://mtsmda.com", "document");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createNamespace("mtsmda", "http://mtsmda.com");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createAttribute("documentNumber", "1");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createStartElement("mtsmda", "http://mtsmda.com", "persons");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createStartElement("mtsmda", "http://mtsmda.com", "person");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createStartElement("mtsmda", "http://mtsmda.com", "name");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createCharacters("Ivanov");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createEndElement("mtsmda", "http://mtsmda.com", "name");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createStartElement("mtsmda", "http://mtsmda.com", "lastname");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createCharacters("Ivan");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createEndElement("mtsmda", "http://mtsmda.com", "lastname");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createEndElement("mtsmda", "http://mtsmda.com", "person");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createEndElement("mtsmda", "http://mtsmda.com", "persons");
        xmlEventWriter.add(xmlEvent);

        xmlEvent = xmlEventFactory.createEndElement("mtsmda", "http://mtsmda.com", "document");
        xmlEventWriter.add(xmlEvent);

        xmlEventWriter.flush();
        xmlEventWriter.close();


        //xmlOutputFactory.createXMLStreamWriter(new FileWriter(fileNameStaxXMLOut));
    }

    private static void staxReadCursorAPI() throws Exception{
        String fileName = "staxXMLIn.xml";
        File file = new File(fileName);
        System.out.println(file.getAbsolutePath());
        XMLInputFactory xmlInputFactory = XMLInputFactory.newInstance();
        XMLStreamReader xmlStreamReader = xmlInputFactory.createXMLStreamReader(new FileReader(fileName));

        while(xmlStreamReader.hasNext()){
            //System.out.println(/*xmlStreamReader.next() + */" _____ " + xmlStreamReader.getLocation().getColumnNumber() + " = " + xmlStreamReader.getLocation().getLineNumber());
            if(xmlStreamReader.getEventType() == XMLStreamConstants.START_DOCUMENT){
            }

        }

    }

}