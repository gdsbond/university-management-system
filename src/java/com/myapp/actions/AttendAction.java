/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.AttendForm;
import com.myapp.beans.studentinfo;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author gdsbond
 */
public class AttendAction extends Action{
    
     
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
     
        AttendForm af=(AttendForm) form;
        int batchid=af.getBatch();
        int courseid=af.getCourse();
        int semesterid=af.getSemester();
        int subid=af.getSubject();
        
//        request.setAttribute("batchid", batchid);
//        request.setAttribute("courseid", courseid);
//        request.setAttribute("semesterid", semesterid);
        
        
        Session ses1=Hconnector.Hconnector.getHsession();
                                                                                    
                                                                                     request.setAttribute("btcid", batchid);
                                                                                     request.setAttribute("courseid", courseid);
                                                                                     request.setAttribute("semesterid", semesterid);
                                                                                     request.setAttribute("subid", subid);
        return mapping.findForward("success");
    }
}
