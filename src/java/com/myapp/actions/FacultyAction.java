/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import Hconnector.Hconnector;
import com.myapp.beans.FacultyForm;
import com.myapp.beans.faculty;
import com.sun.org.apache.bcel.internal.generic.ACONST_NULL;
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
public class FacultyAction extends Action{
     public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
         
         FacultyForm facultyForm=(FacultyForm) form;
         String qualification,exper;
      int departmentid,sallary,uid;
      
      qualification=facultyForm.getQualification();
      exper=facultyForm.getExper();
      departmentid=facultyForm.getDepartmentid();
      sallary=facultyForm.getSallary();
      uid=facultyForm.getUsrid();
      
         
        Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
         Transaction t=session.beginTransaction();
         
         faculty fac=new faculty();
         fac.setDepartmentid(departmentid);
         fac.setExper(exper);
         fac.setQualification(qualification);
         fac.setSallary(sallary);
         fac.setUsrid(uid);
          session.save(fac);
         t.commit();
         session.close();
         return mapping.findForward("success");
      
     }    
}
