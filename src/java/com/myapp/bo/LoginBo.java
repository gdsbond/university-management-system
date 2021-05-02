/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.bo;

import LoginDao.LoginDao;
import org.apache.struts.action.Action;

/**
 *
 * @author gdsbond
 */
public class LoginBo {
    public static boolean mylogin(String u,String pass, Action action){
        
        LoginDao dao=new LoginDao();
        return dao.login(u, pass,action);
        
    
}
}
