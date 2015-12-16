package com.mtsmda.javaXML.xPath;

import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;
import javax.xml.xpath.XPath;
import javax.xml.xpath.XPathConstants;
import javax.xml.xpath.XPathExpression;
import javax.xml.xpath.XPathFactory;
import java.io.File;

/**
 * Created by c-DMITMINZ on 16.12.2015.
 */
public class RunMain {

    public static void main(String[] args) {
        xPathRead(null);

        xPathRead("/class/student[@rollno='493']");

        xPathRead("/class/student[last()]");
        xPathRead("/class/student[last() - 1]");
    }

    private static void xPathRead(String expression) {
        try {
            DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
            DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
            Document document = documentBuilder.parse(new File("xPath.xml"));

            document.getDocumentElement().normalize();

            XPath xPath = XPathFactory.newInstance().newXPath();
            if(expression == null){
                expression = "/class/student";
            }


            XPathExpression compile = xPath.compile(expression);
            Object evaluate = compile.evaluate(document, XPathConstants.NODESET);
            if (evaluate instanceof NodeList) {
                NodeList nodeList = (NodeList) evaluate;

                for (int i = 0; i < nodeList.getLength(); i++) {
                    Node item = nodeList.item(i);
                    System.out.println("__________________" + i + "___________________");
                    System.out.println("current element: " + item.getNodeName());

                    if(item.getNodeType() == Node.ELEMENT_NODE){
                        Element element = (Element)item;
                        System.out.println(element.getTagName() + " #" + element.getAttribute("rollno"));
                        System.out.println("Name is - " + element.getElementsByTagName("firstname").item(0).getTextContent() + " " +
                        element.getElementsByTagName("lastname").item(0).getTextContent());
                        System.out.println("Nick name is - " + element.getElementsByTagName("nickname").item(0).getTextContent());
                        System.out.println("Marks = " + element.getElementsByTagName("marks").item(0).getTextContent());

                    }
                }

            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        System.out.println("******************************");
    }

}