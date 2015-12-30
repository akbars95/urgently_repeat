package com.mtsmda.jpa.eclipseLink;

import com.mtsmda.jpa.eclipseLink.model.Departament;
import com.mtsmda.jpa.eclipseLink.model.Employee;
import com.mtsmda.jpa.eclipseLink.model.javacodegeeks.IdCard;
import com.mtsmda.jpa.eclipseLink.model.javacodegeeks.Person;
import com.mtsmda.jpa.eclipseLink.model.javacodegeeks.Phone;

import javax.persistence.*;
import javax.persistence.criteria.CriteriaBuilder;
import javax.persistence.criteria.CriteriaQuery;
import javax.persistence.criteria.Predicate;
import javax.persistence.criteria.Root;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Date;
import java.util.List;

/**
 * Created by c-DMITMINZ on 30.12.2015.

 http://www.javacodegeeks.com/2015/02/jpa-tutorial.html
 http://www.vogella.com/tutorials/JavaPersistenceAPI/article.html
 */
public class RunMainJPA {

    public static void main(String[] args) {

        EntityManagerFactory entityManagerFactory = Persistence.createEntityManagerFactory("Eclipselink_JPA");
        EntityManager entityManager = entityManagerFactory.createEntityManager();

//        insertAll(entityManager);
       /* insertDepartaments(entityManager);
        insert(entityManager);*/
//        update(entityManager);
//        delete(entityManager);
//        search(entityManager);
//        selectCriteriaAPI(entityManager);

//javacodegeeks
        javacodegeeks(entityManager);

        entityManager.close();
        System.exit(0);
    }

    private static void javacodegeeks(EntityManager entityManager) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        IdCard idCard = new IdCard("1526-9531-2", new Date());
        Person person = new Person(idCard, "Ivanov");
        idCard.setPerson(person);
        Phone phone = new Phone("069-852-369", person);
        Phone phone1 = new Phone("079-852-369", person);
        person.getPhones().add(phone);
        person.getPhones().add(phone1);

        IdCard idCard1 = new IdCard("7561-24-42-2", new Date());
        Person person1 = new Person(idCard1, "Petrov");
        idCard1.setPerson(person1);
        Phone phone2 = new Phone("061-125-375", person1);
        person1.getPhones().add(phone2);

        entityManager.persist(person);
        entityManager.persist(person1);

        List resultList = entityManager.createQuery("from Person p").getResultList();
        for(Object o : resultList){
            Person person2 = (Person) o;
            System.out.println(person2 + " with id card - " + person2.getIdCard());
        }

        transaction.commit();
    }

    private static void selectCriteriaAPI(EntityManager entityManager) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();

        CriteriaBuilder criteriaBuilder = entityManager.getCriteriaBuilder();
        CriteriaQuery<Employee> query = criteriaBuilder.createQuery(Employee.class);
        Root<Employee> from = query.from(Employee.class);
        query.orderBy(criteriaBuilder.asc(from.get("departament")));

        List<Employee> resultList = entityManager.createQuery(query.select(from)).getResultList();
        for (Employee employee : resultList) {
            System.out.println(employee + " departament is " + employee.getDepartament().getdName());
        }


        transaction.commit();
    }

    private static void insertAll(EntityManager entityManager) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        List<Departament> departaments = Arrays.asList(new Departament("Java"), new Departament(".NET"), new Departament("PHP"));

        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Ivan", 125200.25, "1"));
        employees.add(new Employee("Vasya", 17500.25, "2"));
        employees.add(new Employee("Ion", 1960.25, "1"));
        employees.add(new Employee("Mishka", 152.05, "6"));
        employees.add(new Employee("Kostya", 19000.25, "1"));
        employees.add(new Employee("Iasha", 199620.25, "7"));
        employees.add(new Employee("Fedya", 195., "2"));
        employees.add(new Employee("Grigorii", 190.25, "2"));

        int counter = 0;

        for (Employee employee : employees) {
            if (++counter >= departaments.size()) {
                counter = 0;
            }
            employee.setDepartament(departaments.get(counter));
            entityManager.persist(employee);
        }


        transaction.commit();
    }

    private static void insertDepartaments(EntityManager entityManager) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        List<Departament> departaments = Arrays.asList(new Departament("Java"), new Departament(".NET"), new Departament("PHP"));
        for (Departament departament : departaments) {
            entityManager.persist(departament);
        }
        transaction.commit();
    }

    private static void insert(EntityManager entityManager) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        List<Employee> employees = new ArrayList<Employee>();
        employees.add(new Employee("Ivan", 125200.25, "1"));
        employees.add(new Employee("Vasya", 17500.25, "2"));
        employees.add(new Employee("Ion", 1960.25, "1"));
        employees.add(new Employee("Mishka", 152.05, "6"));
        employees.add(new Employee("Kostya", 19000.25, "1"));
        employees.add(new Employee("Iasha", 199620.25, "7"));
        employees.add(new Employee("Fedya", 195., "2"));
        employees.add(new Employee("Grigorii", 190.25, "2"));

        List departaments = entityManager.createQuery("select d from Departament d").getResultList();

        int c = 0;
        for (Employee employee : employees) {
            if (++c >= departaments.size()) {
                c = 0;
            }
            employee.setDepartament((Departament) departaments.get(c));
            entityManager.persist(employee);
        }
        transaction.commit();
    }

    private static void update(EntityManager entityManager) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Employee employee = entityManager.find(Employee.class, 1);
        System.out.println(employee);
        employee.setSalary(employee.getSalary() * 1.095);
        transaction.commit();
    }

    private static void delete(EntityManager entityManager) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Employee employee = entityManager.find(Employee.class, 56);
        if (employee != null) {
            System.out.println(employee);
            entityManager.remove(employee);
        }
        transaction.commit();
    }

    private static void search(EntityManager entityManager) {
        EntityTransaction transaction = entityManager.getTransaction();
        transaction.begin();
        Query query = entityManager.createQuery("select e from Employee e");
        List resultList = query.getResultList();

        System.out.println("===============================1");
        Object singleResult = entityManager.createQuery("Select max(e.salary) from Employee e").getSingleResult();
        System.out.println("Max salary - " + singleResult);

        System.out.println("==============================Named query");
        List select_all_with_salary_greatThan2500 = entityManager.createNamedQuery("select_all_with_salary_greatThan2500").getResultList();
        it(select_all_with_salary_greatThan2500);

        System.out.println("==============================All departaments");
        List resultList1 = entityManager.createQuery("select d from Departament d where d.dName = :dName").setParameter("dName", "Java").getResultList();
        for (Object o : resultList1) {
            if (o instanceof Departament) {
                Departament departament = (Departament) o;
                System.out.println(departament.getdName() + " = " + departament.getEmployees());
            }
        }

        transaction.commit();
    }

    private static void it(List list) {
        for (Object o : list) {
            System.out.println(o);
        }
    }
}