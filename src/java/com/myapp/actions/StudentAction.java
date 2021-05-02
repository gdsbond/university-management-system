/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import LoginDao.StudentDao;
import com.myapp.beans.StudentForm;
import com.myapp.beans.location;
import com.myapp.bo.StudentBo;
import java.util.Date;
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
public class StudentAction extends Action{
    public ActionForward execute( ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response){
       
        StudentForm sf=(StudentForm) form;
         String first_name,last_name,username,password,gender,email,type,city,state,country,address,target;
    int pincode;
    long mobile;
    byte[] profile_pic;
    Date dob,creation_date;
    
    
    first_name=sf.getFirst_name();
    last_name=sf.getLast_name();
    username=sf.getUsername();
    password=sf.getPassword();
    gender=sf.getGender();
    email=sf.getEmail();
    type=sf.getType();
    target=type;
    mobile=sf.getMobile();
    String fg=sf.getDob();
    profile_pic=sf.getProfile_pic();
    city=sf.getCity();
    country=sf.getCountry();
    state=sf.getState();
    address=sf.getAddress();
    pincode=sf.getPincode();
    creation_date=new Date();
    String date=sf.getDob();
        String ss[]=date.split("/");
        String ds=ss[2]+"/"+ss[0]+"/"+ss[1];
        Date dr=new Date(ds);
        StudentBo.newStudent(city,state,country,address,pincode,first_name,last_name,username,password,gender,email,type,creation_date,dr,mobile,profile_pic);
        
        int ui= StudentDao.getuid(username);
        HttpSession se=request.getSession();
        se.setAttribute("userid", ui);
         return mapping.findForward(target);
         
    }
    
}
