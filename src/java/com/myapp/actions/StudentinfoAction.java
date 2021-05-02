/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.StudentinfoForm;
import com.myapp.beans.studentinfo;
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
public class StudentinfoAction extends Action{
    public ActionForward execute(ActionMapping mapping,ActionForm form, HttpServletRequest request, HttpServletResponse response){
        
        StudentinfoForm sif=(StudentinfoForm) form;
       
       String session=sif.getSession();
    int semester=sif.getSemester();
           int batch=sif.getBatch();
           int usrid=sif.getUsrid();
           int course=sif.getCourse();
           int section=sif.getSection();
           int rollno=course+section+usrid;
        
        Session ses=Hconnector.Hconnector.getHsession();
        Transaction t=ses.beginTransaction();
        studentinfo st=new studentinfo();
        st.setBatchid(batch);
        st.setCourseid(course);
        st.setRollno(rollno);
        st.setSection(section);
        st.setSemester(semester);
        st.setSession(new Date().toString());
        st.setUid(usrid);
        ses.save(st);
        t.commit();
        ses.close();
        
        return mapping.findForward("success");
    }
    
}
