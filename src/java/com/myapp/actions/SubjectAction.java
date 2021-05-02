/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import Hconnector.Hconnector;
import com.myapp.beans.SubjectForm;
import com.myapp.beans.subject;
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
public class SubjectAction extends Action{
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
        
        SubjectForm subf=(SubjectForm) form;
        String subject_name=subf.getSubject_name();
        String subname=subf.getSubname();
        int semsterid=subf.getSemsterid();
        int batcid=subf.getBatchid();
        int course=subf.getCourse();
        
        Session s= Hconnector.getHsession();
        Transaction t=s.beginTransaction();
        
        subject sub=new subject();
        
        sub.setBatchid(batcid);
        sub.setSemsterid(semsterid);
        sub.setSubject_name(subject_name);
        sub.setSubname(subname);
        sub.setCourse(course);
        s.save(sub);
        t.commit();
        s.close();
        
            return mapping.findForward("success");
    }
    
}
