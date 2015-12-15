package com.mtsmda.javaXML.dom;

import org.w3c.dom.*;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.transform.OutputKeys;
import javax.xml.transform.Transformer;
import javax.xml.transform.TransformerFactory;
import javax.xml.transform.dom.DOMSource;
import javax.xml.transform.stream.StreamResult;
import java.io.File;
import java.util.Arrays;
import java.util.List;

/**
 * Created by c-DMITMINZ on 15.12.2015.
 */
public class DomMain {

    public static void main(String[] args) throws Exception {
        readXMLDOM();
        List<Car> cars = Arrays.asList(new Car(1009, "audi", "Q7", 2009, 45000.0), new Car(10459, "BMW", "X6", 2015, 100000.0));
        createXMLDOM(cars);
    }

    private static void readXMLDOM() throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.parse(new File("domRead.xml"));
        document.getDocumentElement().normalize();

        System.out.println("Root element: " + document.getDocumentElement().getNodeName() + " _ " + document.getDocumentElement().getNodeValue());

        NodeList book = document.getElementsByTagName("book");
        for (int i = 0; i < book.getLength(); i++) {
            Node item = book.item(i);
            StringBuilder stringBuilder = new StringBuilder("_______________________\n");
            stringBuilder.append(item.getNodeName()).append(" # ").append(item.getAttributes().getNamedItem("id").getNodeValue());

            if (item.getNodeType() == Node.ELEMENT_NODE) {
                Element element = (Element) item;
                stringBuilder.append("\n\t").append("Book name is ").append(element.getElementsByTagName("bookname").item(0).getTextContent());
                stringBuilder.append(" author is ").append(element.getElementsByTagName("bookauthor").item(0).getTextContent());
                stringBuilder.append(" book ISBN = ").append(element.getElementsByTagName("bookprice").item(0).getTextContent())
                        .append(" ").append(element.getElementsByTagName("bookprice").item(0).getAttributes().getNamedItem("currency").getNodeValue());
                stringBuilder.append("\t short description - ").append(element.getElementsByTagName("bookdescription").item(0).getTextContent());
            }

            System.out.println(stringBuilder.append("\n_______________________"));
        }


    }

    private static void createXMLDOM(List<Car> cars) throws Exception {
        DocumentBuilderFactory documentBuilderFactory = DocumentBuilderFactory.newInstance();
        DocumentBuilder documentBuilder = documentBuilderFactory.newDocumentBuilder();
        Document document = documentBuilder.newDocument();

        //root
        Element elementRoot = document.createElement("garage");
        document.appendChild(elementRoot);

        Element elementCars = document.createElement("cars");
        elementRoot.appendChild(elementCars);

        for (Car car : cars) {
            Element elementCar = document.createElement("car");
            Attr number = document.createAttribute("number");
            number.setValue(car.getNumber().toString());
            elementCar.setAttributeNode(number);
            elementCars.appendChild(elementCar);

            Element elementMarka = document.createElement("marka");
            elementMarka.appendChild(document.createTextNode(car.getMarka()));
            elementCar.appendChild(elementMarka);

            Element elementModel = document.createElement("model");
            elementModel.appendChild(document.createTextNode(car.getModel()));
            elementCar.appendChild(elementModel);

            Element elementYear = document.createElement("year");
            elementYear.appendChild(document.createTextNode(car.getYear().toString()));
            elementCar.appendChild(elementYear);

            Element elementPrice = document.createElement("price");
            elementPrice.appendChild(document.createTextNode(car.getPrice() + ""));
            elementCar.appendChild(elementPrice);
        }
        TransformerFactory transformerFactory = TransformerFactory.newInstance();
        Transformer transformer = transformerFactory.newTransformer();
        transformer.setOutputProperty(OutputKeys.INDENT, "yes");
        transformer.setOutputProperty(OutputKeys.ENCODING, "UTF-8");
        DOMSource domSource = new DOMSource(document);
        File file = new File("car.xml");
        if (!file.exists()) {
            file.createNewFile();
        }
        StreamResult streamResult = new StreamResult(file);
        transformer.transform(domSource, streamResult);
        System.out.println("OK");


    }

}

class Car {
    private Integer number;
    private String marka;
    private String model;
    private Integer year;
    private double price;

    public Car() {

    }

    public Car(Integer number, String marka, String model, Integer year, double price) {
        this.number = number;
        this.marka = marka;
        this.model = model;
        this.year = year;
        this.price = price;
    }

    public Integer getNumber() {
        return number;
    }

    public void setNumber(Integer number) {
        this.number = number;
    }

    public String getMarka() {
        return marka;
    }

    public void setMarka(String marka) {
        this.marka = marka;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public Integer getYear() {
        return year;
    }

    public void setYear(Integer year) {
        this.year = year;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }
}