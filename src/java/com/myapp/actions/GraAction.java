/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.GraForm;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;

/**
 *
 * @author gdsbond
 */
public class GraAction extends Action{
     public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
     
         GraForm gf=(GraForm) form; 
        int batchid=gf.getBatch();
        int courseid=gf.getCourse();
        int semesterid=gf.getSemester();
        int subid=gf.getSubject();
        
        Session ses1=Hconnector.Hconnector.getHsession();
                                                                                    
                                                                                     request.setAttribute("btcid", batchid);
                                                                                     request.setAttribute("courseid", courseid);
                                                                                     request.setAttribute("semesterid", semesterid);
                                                                                     request.setAttribute("subid", subid);
        return mapping.findForward("success");
     }
    
}
