/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.LoginForm;
import com.myapp.bo.LoginBo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;

/**
 *
 * @author gdsbond
 */
public class LoginAction extends Action{

    @Override
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws Exception {
        String target="failure";
        LoginForm login=(LoginForm) form;
        boolean b=LoginBo.mylogin(login.getUserName(), login.getPass(),this);
        HttpSession  hs=request.getSession();
        if(b){
            target="success";
            hs.setAttribute("uname",login.getUserName());
        }
        return mapping.findForward(target);
        
        
    }
    
}
