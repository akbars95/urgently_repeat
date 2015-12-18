package com.mtsmda.springCore.OXM;

import org.springframework.oxm.Marshaller;
import org.springframework.oxm.Unmarshaller;

import javax.xml.transform.stream.StreamResult;
import javax.xml.transform.stream.StreamSource;
import java.io.FileInputStream;
import java.io.FileOutputStream;

/**
 * Created by c-DMITMINZ on 18.12.2015.
 */
public class XMlConverter {

    private Marshaller marshaller;
    private Unmarshaller unmarshaller;

    public Marshaller getMarshaller() {
        return marshaller;
    }

    public void setMarshaller(Marshaller marshaller) {
        this.marshaller = marshaller;
    }

    public Unmarshaller getUnmarshaller() {
        return unmarshaller;
    }

    public void setUnmarshaller(Unmarshaller unmarshaller) {
        this.unmarshaller = unmarshaller;
    }

    public <T> void convertFromObjectToXML(T t, String filename) throws Exception {
        FileOutputStream fileOutputStream = null;
        try {
            fileOutputStream = new FileOutputStream(filename);
            getMarshaller().marshal(t, new StreamResult(fileOutputStream));
        } catch (Exception e) {
            if (fileOutputStream != null) {
                fileOutputStream.close();
                fileOutputStream = null;
            }
        }
    }

    public <T> T convertFromXMLToObject(String filename) throws Exception {
        T ob = null;
        FileInputStream fileInputStream = null;
        try {
            fileInputStream = new FileInputStream(filename);
            ob = (T) getUnmarshaller().unmarshal(new StreamSource(fileInputStream));
        } catch (Exception e) {
            if (fileInputStream != null) {
                fileInputStream.close();
                fileInputStream = null;
            }
        }
        return ob;
    }

}