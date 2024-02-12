package com.example.course_project;

import com.example.course_project.models.Person;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {
    public static void main(String[] args) {
        Configuration configuration = new Configuration().addAnnotatedClass(Person.class);

        try(SessionFactory sessionFactory = configuration.buildSessionFactory()){
            Session session = sessionFactory.getCurrentSession();
            session.beginTransaction();
            Person person1 = new Person(1, "Ivan", 25, "ivan.koval.andr@gmail.com");
            Person person2 = new Person(2, "Arseni", 18, "null");

            session.persist(person1);
            session.persist(person2);

            session.getTransaction().commit();
            session.close();
        }
    }
}
