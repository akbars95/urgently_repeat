package com.mtsmda.javaQuestions.ObjectList;

import java.util.ArrayList;
import java.util.List;

/**
 * Created by MTSMDA on 19.12.2015.
 */
public class ObjectList {

    public static void main(String[] args) {
        List<DatabaseServer> databaseServers = new ArrayList<>();

        DatabaseServer databaseServer = new DatabaseServer("SQLServer", "2008");
        databaseServers.add(databaseServer);
        databaseServer = new DatabaseServer("MySQL", "5.31");
        databaseServers.add(databaseServer);
        databaseServer = new DatabaseServer("SQLite", "2.1.3");
        databaseServers.add(databaseServer);
        databaseServer = new DatabaseServer("Oracle", "10g");
        databaseServers.add(databaseServer);
        databaseServer = new DatabaseServer("PostgreSQL", "1.5");
        databaseServers.add(databaseServer);

        for(DatabaseServer databaseServerCurrent : databaseServers){
            System.out.println(databaseServerCurrent);
        }

    }

}

class DatabaseServer {
    private String name;
    private String version;

    public DatabaseServer(String name, String version) {
        this.name = name;
        this.version = version;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    @Override
    public String toString() {
        return "DatabaseServer{" +
                "name='" + name + '\'' +
                ", version='" + version + '\'' +
                '}';
    }
}