/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.DepartmentForm;
import com.myapp.beans.department;
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
public class DepartmentAction extends Action{
    
     
     public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
         
          int hod;
    String name;
         
         DepartmentForm departmentForm= (DepartmentForm) form;
       
         
         name=departmentForm.getName();
         hod=departmentForm.getHod();
         
         
        try{ 
         Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
         Transaction t=session.beginTransaction();
         
         department dep=new department();
         dep.setName(name);
         dep.setHod(hod);
         
         session.save(dep);
         t.commit();
         session.close();
        }
        catch(Exception e){}
                  
         return mapping.findForward("success");
         
    
     }
}
