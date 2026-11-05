package com.telusko;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class Main {

    public static void main(String[] args) {

        Alien a1 = new Alien();
        a1.setId(104);
        a1.setName("Vishal");
        a1.setTech("Gen-AI");

        // save(a1):
        Configuration config = new Configuration();
        config.addAnnotatedClass(com.telusko.Alien.class);
        config.configure("hibernate.cfg.xml");


        SessionFactory factory = config.buildSessionFactory();
        Session session = factory.openSession();
   Transaction transaction= session.beginTransaction();
//       Alien a1=session.find(Alien.class,102);
//        Alien a1=session.find(Alien.class,104);
// session.merge(a1);
//        System.out.println(a1);
         session.persist(a1);
        session.remove(a1);
     transaction.commit();
       session.clear();
       factory.close();
    }
}