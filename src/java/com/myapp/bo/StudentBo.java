/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.bo;

import LoginDao.StudentDao;
import java.util.Date;

/**
 *
 * @author gdsbond
 */
public class StudentBo {
    public static boolean newStudent(String city,String state,String country,String address,int pincode,String first_name,String last_name,String username,String password,String gender,String email,String type,Date creation_date,Date dob,long mobile,byte[] profile_pic){
        StudentDao studao=new StudentDao();
        boolean res=false;
        boolean res1=studao.Student(first_name, last_name, username, password, gender, email, type, creation_date, dob, mobile, profile_pic);
        boolean res2=studao.location(city, state, country, address, pincode, StudentDao.getuid(username));
        if(res1&res2)
        {
            res=true;
        }
        return res;
        
    }
   
}
