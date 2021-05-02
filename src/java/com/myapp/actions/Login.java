/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import LoginDao.UpadateDao;
import com.myapp.beans.LoginForm;
import com.myapp.bo.LoginBo;
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
public class Login extends Action{
 @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String target = "failure";
        LoginForm login = (LoginForm) form;
        boolean b = LoginBo.mylogin(login.getUserName(), login.getPass(), this);
        HttpSession hs = request.getSession();
        if (b) {
            target = "Admin";
            hs.setAttribute("uname", login.getUserName());
        } 
        
        else {
            boolean b1 = StudentLoginBo.login(login.getUserName(), login.getPass(), this);
            if (b1) {
                String s= UpadateDao.gettype(login.getUserName());
                if(s.equals("Teacher"))
                {
                    target= "Teacher";
                    hs.setAttribute("uname", login.getUserName());
                }
                else
                {
                    target= "Student";
                    hs.setAttribute("uname", login.getUserName());
                }
            }
        }
        return mapping.findForward(target);


    }    
}
