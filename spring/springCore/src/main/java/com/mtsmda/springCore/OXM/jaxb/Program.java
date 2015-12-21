package com.mtsmda.springCore.OXM.jaxb;

import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;

/**
 * Created by MTSMDA on 18.12.2015.
 */
@XmlRootElement(name = "program")
public class Program {

    private Integer id;
    private String name;
    private String processName;

    public Program() {

    }

    @XmlAttribute(name = "programId")
    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }

    @XmlElement(name = "program-name")
    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    @XmlElement(name = "process-name")
    public String getProcessName() {
        return processName;
    }

    public void setProcessName(String processName) {
        this.processName = processName;
    }

    @Override
    public String toString() {
        return "Program{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", processName='" + processName + '\'' +
                '}';
    }
}