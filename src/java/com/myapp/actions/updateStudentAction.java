/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import LoginDao.UpadateDao;
import com.myapp.beans.updateStudentForm;
import java.io.FileNotFoundException;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author gdsbond
 */
public class updateStudentAction extends Action{
   public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
    
       
       updateStudentForm studentForm=(updateStudentForm) form;
       boolean res= UpadateDao.upadetUserInfo(studentForm.getUid(), studentForm.getFirst_name(), studentForm.getLast_name(), studentForm.getMobile(), studentForm.getEmail());
       boolean res1=UpadateDao.updateLoction(studentForm.getUid(), studentForm.getCity(), studentForm.getState(), studentForm.getCountry(), studentForm.getPincode(), studentForm.getAddress());
       //boolean res2=UpadateDao.updateStudent(studentForm.getUid(), 1, studentForm.getCourse(), studentForm.getSection());
       
     
       return mapping.findForward("success");
    }
    
}
