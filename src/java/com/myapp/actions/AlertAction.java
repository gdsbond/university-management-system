/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.Aler;
import com.myapp.beans.AlertsForm;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Date;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gdsbond
 */
public class AlertAction extends Action{
     public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
     
         AlertsForm af=(AlertsForm) form;
         String title=af.getTitle();
         String desc=af.getDetails();
         int batchid=af.getBatchid();
         int semid=af.getSemsterid();
         Date d=new Date();
         
         Session session=Hconnector.Hconnector.getHsession();
         Transaction t=session.beginTransaction();
          Aler al=new Aler();
          al.setTitle(title);
          al.setDetails(desc);
          al.setBatchid(batchid);
          al.setSemsterid(semid);
          al.setDate(d);
          
          session.save(al);
          t.commit();
          session.close();
         
         
         
         return mapping.findForward("success");
     }
    
}
