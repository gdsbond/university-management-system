/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.fees;
import com.myapp.beans.feesForm;
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
public class FeesAction extends Action{
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
  
        feesForm fee=(feesForm) form;
        int batchid=fee.getBatch();
        int semesterid=fee.getSemester();
        int course=fee.getCourse();
        int amount=fee.getAmount();
        int labfee=fee.getLabfee();
        int tuitionfee=fee.getTuitionfee();
        int examfee=fee.getExamfee();
        int libraryfee=fee.getLibraryfee();
        String duedate= fee.getDuedate();
        
        Session ses=Hconnector.Hconnector.getHsession();
        Transaction tran=ses.beginTransaction();
        fees fe=new fees();
        
        fe.setAmount(amount);
        fe.setBatch(batchid);
        fe.setSemester(semesterid);
        fe.setCourse(course);
        fe.setDuedate(new Date());
        fe.setExamfee(examfee);
        fe.setLabfee(labfee);
        fe.setLibraryfee(libraryfee);
        fe.setTuitionfee(tuitionfee);
        
        ses.save(fe);
        tran.commit();
        ses.close();
        
        return mapping.findForward("success");
    }
    
}
