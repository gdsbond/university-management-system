/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.GradeForm;
import com.myapp.beans.grade;
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
public class GradeAction extends Action{
     public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
         GradeForm gradeForm=(GradeForm) form;
         int subid=gradeForm.getSubid();
         int stid[]=gradeForm.getStid();
         double scored[]=gradeForm.getScored();
         double total=gradeForm.getTotal();
         double internal[]=gradeForm.getInternal();
         
         
         for(int i=0;i<stid.length;i++){
         
        Session session=Hconnector.Hconnector.getHsession();
        Transaction t=session.beginTransaction();
        grade gr=new grade();
        gr.setInternal(internal[i]);
        gr.setScored(scored[i]);
        gr.setStid(stid[i]);
        gr.setSubid(subid);
        gr.setTotal(total);
        
       session.save(gr);
        t.commit();
        session.close();
         }
        
   return mapping.findForward("success");
     }
    
}
