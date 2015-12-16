package com.mtsmda.javaXML.sax;

import org.xml.sax.Attributes;
import org.xml.sax.InputSource;
import org.xml.sax.SAXException;
import org.xml.sax.helpers.DefaultHandler;

import javax.xml.parsers.SAXParser;
import javax.xml.parsers.SAXParserFactory;
import java.io.*;

/**
 * Created by c-DMITMINZ on 16.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        readSAX();
        System.out.println("_____________________________________________________________");
        readSAXUTF8();
    }

    private static void readSAX() {
        try {
            SAXParserFactory saxParserFactory = SAXParserFactory.newInstance();
            SAXParser saxParser = saxParserFactory.newSAXParser();

            DefaultHandler defaultHandler = new DefaultHandler() {

                boolean firstname = false;
                boolean lastname = false;
                boolean nickname = false;
                boolean salary = false;

                @Override
                public void startElement(String uri, String localName, String qName, Attributes attributes) throws SAXException {
                    System.out.println("Start element: " + qName);

                    if (qName.equalsIgnoreCase("firstname")) {
                        firstname = true;
                    }

                    if (qName.equalsIgnoreCase("lastname")) {
                        lastname = true;
                    }

                    if (qName.equalsIgnoreCase("nickname")) {
                        nickname = true;
                    }

                    if (qName.equalsIgnoreCase("salary")) {
                        salary = true;
                    }
                }

                @Override
                public void endElement(String uri, String localName, String qName) throws SAXException {
                    System.out.println("End Element: " + qName);
                }

                @Override
                public void characters(char[] ch, int start, int length) throws SAXException {
                    if (firstname) {
                        System.out.println("First Name : " + new String(ch, start, length));
                        firstname = false;
                    }

                    if (lastname) {
                        System.out.println("Last Name : " + new String(ch, start, length));
                        lastname = false;
                    }

                    if (nickname) {
                        System.out.println("Nick Name : " + new String(ch, start, length));
                        nickname = false;
                    }

                    if (salary) {
                        System.out.println("Salary : " + new String(ch, start, length));
                        salary = false;
                    }

                }
            };
            saxParser.parse("company.xml", defaultHandler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private static void readSAXUTF8() {
        try {

            SAXParserFactory factory = SAXParserFactory.newInstance();
            SAXParser saxParser = factory.newSAXParser();

            DefaultHandler handler = new DefaultHandler() {

                boolean bfname = false;
                boolean blname = false;
                boolean bnname = false;
                boolean bsalary = false;

                public void startElement(String uri, String localName,
                                         String qName, Attributes attributes)
                        throws SAXException {

                    System.out.println("Start Element :" + qName);

                    if (qName.equalsIgnoreCase("FIRSTNAME")) {
                        bfname = true;
                    }

                    if (qName.equalsIgnoreCase("LASTNAME")) {
                        blname = true;
                    }

                    if (qName.equalsIgnoreCase("NICKNAME")) {
                        bnname = true;
                    }

                    if (qName.equalsIgnoreCase("SALARY")) {
                        bsalary = true;
                    }

                }

                public void endElement(String uri, String localName,
                                       String qName)
                        throws SAXException {

                    System.out.println("End Element :" + qName);

                }

                public void characters(char ch[], int start, int length)
                        throws SAXException {

                    System.out.println(new String(ch, start, length));


                    if (bfname) {
                        System.out.println("First Name : "
                                + new String(ch, start, length));
                        bfname = false;
                    }

                    if (blname) {
                        System.out.println("Last Name : "
                                + new String(ch, start, length));
                        blname = false;
                    }

                    if (bnname) {
                        System.out.println("Nick Name : "
                                + new String(ch, start, length));
                        bnname = false;
                    }

                    if (bsalary) {
                        System.out.println("Salary : "
                                + new String(ch, start, length));
                        bsalary = false;
                    }

                }

            };

            File file = new File("file.xml");
            InputStream inputStream = new FileInputStream(file);
            Reader reader = new InputStreamReader(inputStream, "UTF-8");

            InputSource is = new InputSource(reader);
            is.setEncoding("UTF-8");

            saxParser.parse(is, handler);

        } catch (Exception e) {
            e.printStackTrace();
        }
    }

}