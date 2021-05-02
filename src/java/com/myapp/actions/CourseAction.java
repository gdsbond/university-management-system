/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.CourseForm;
import com.myapp.beans.course;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author gdsbond
 */
public class CourseAction extends Action{
     public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
        
         CourseForm cf=(CourseForm) form;
       
               String course_name=cf.getCourse_name();
                 
                 Configuration configuration=new Configuration();
                 configuration.configure("hibernate.cfg.xml");
                 SessionFactory factory=configuration.buildSessionFactory();
                 Session s=factory.openSession();
                 Transaction t=s.beginTransaction();
                 course course=new course();
                 course.setCourse_name(course_name);
                
                 s.save(course);
                 t.commit();
                 
                 
         
         
         
         return mapping.findForward("success");
     
     }
    
}
