/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.ExamForm;
import com.myapp.beans.exam;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.sql.Time;
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
public class ExamAction extends Action{
    
     public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
     
     
         ExamForm ef=(ExamForm) form;
         
         int subject=ef.getSubject();
         int roomno=ef.getRoomno();
         int batch=ef.getBatch();
         int course=ef.getCourse();
         int semester=ef.getSemester();
        
         String time=ef.getTime();
         String hour=ef.getHour();
          //String date=ef.getDate();
       //  String dd[]=date.split("/");
         //String ds=dd[2]+"/"+dd[0]+"/"+dd[1];
         //Date dm=new Date("2015/06/03");
         
         
         Session ses=Hconnector.Hconnector.getHsession();
         Transaction tr=ses.beginTransaction();
         exam ex=new exam();
         
         ex.setDate(new Date());
         ex.setRoomno(roomno);
         ex.setBatch(batch);
         ex.setCourse(course);
         ex.setSemester(semester);
         ex.setSubject(subject);
         ex.setTime(time+" "+hour);
         
         ses.save(ex);
         tr.commit();
         ses.close();
                 
         
         
     return mapping.findForward("success");
     }
    
}
