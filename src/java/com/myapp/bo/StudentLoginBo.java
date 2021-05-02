/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.bo;

import LoginDao.studentlogindao;
import org.apache.struts.action.Action;

/**
 *
 * @author Rishu
 */
public class StudentLoginBo {
    public static boolean login(String u, String p , Action a)
    {
        studentlogindao ld = new studentlogindao();
        return ld.studentLogin(u, p, a);
        
    }
}
