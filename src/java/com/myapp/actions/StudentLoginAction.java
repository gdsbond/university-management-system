/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.StudentForm;
import com.myapp.bo.StudentBo;
import com.myapp.bo.StudentLoginBo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author Rishu
 */
public class StudentLoginAction  extends Action{
     public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception
     {
         String target ="failure";
         StudentForm sf = (StudentForm) form;
         boolean b = StudentLoginBo.login(sf.getUsername(), sf.getPassword(), this);
         HttpSession hs = request.getSession();
         if(b)
         {
            target="success";
            hs.setAttribute("uname",sf.getUsername());
        }
        return mapping.findForward(target);
     }
}
