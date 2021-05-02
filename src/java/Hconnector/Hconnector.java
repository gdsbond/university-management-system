/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package Hconnector;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author gdsbond
 */
public class Hconnector {
    public static Session getHsession(){
        Session s=null;
        Configuration configuration=new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory factory=configuration.buildSessionFactory();
         s=factory.openSession();
         return s;
        
    }
    
}
