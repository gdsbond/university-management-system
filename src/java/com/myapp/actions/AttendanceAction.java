/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.AttendanceForm;
import com.myapp.beans.attendance;
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
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author gdsbond
 */
public class AttendanceAction extends Action{
    
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
        
        AttendanceForm attendanceForm=(AttendanceForm) form;
        String status[]=attendanceForm.getStatus();
        int stid[]=attendanceForm.getStid();
        int scheduleid=attendanceForm.getScheduleid();
       Date date=new Date();
        
        for(int i=0;i<stid.length;i++){
       
        Session session=Hconnector.Hconnector.getHsession();
        Transaction t=session.beginTransaction();
        attendance atten=new attendance();
        atten.setDate(date);
        atten.setStid(stid[i]);
        atten.setScheduleid(scheduleid);
        atten.setStatus(status[i]);
        session.save(atten);
        t.commit();
        }
   return mapping.findForward("success");
    }
    
}
