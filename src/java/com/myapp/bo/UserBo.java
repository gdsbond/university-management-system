package com.myapp.bo;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */


import com.myapp.beans.student;
import java.util.ArrayList;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rishu
 */
public class UserBo {
   // private static student student;
     public static String info(String username)
    {
       String ss="";
        Session ses= Hconnector.Hconnector.getHsession();
        Query qq=ses.createQuery("from student as u where u.username=:uun");
        qq.setString("uun", username);
        ArrayList<student> info = (ArrayList<student>) qq.list();
        Iterator<student> iitr = info.iterator();
        if(iitr.hasNext())
        {
            student un = iitr.next();
            ss=un.getFirst_name();
            String s1=ss.substring(0, 1).toUpperCase();
            String s2=ss.substring(1);
            ss=s1+s2;
        }
       return ss;
    }
     
     public static void main(String gh[])
     {
         updatePass(7, "rrrr");
     }
      public static boolean updatePass(int id, String pass)
    {
        boolean res=false;
        Session ses=Hconnector.Hconnector.getHsession();
        Transaction trss=ses.beginTransaction();
        student at=(student)ses.get(student.class,new Integer(id)); 
        at.setPassword(pass);
        ses.update(at);
        trss.commit();
        ses.close();
        res=true;
        return res;
    }
       
      
      public static int getUserId(String username)
    {
       int ss=0;
        Session ses= Hconnector.Hconnector.getHsession();
        Query qq=ses.createQuery("from student as u where u.username=:uun");
        qq.setString("uun", username);
        ArrayList<student> info = (ArrayList<student>) qq.list();
        Iterator<student> iitr = info.iterator();
        if(iitr.hasNext())
        {
            student un = iitr.next();
            //ss=un.getFname();
            //String s1=ss.substring(0, 1).toUpperCase();
            //String s2=ss.substring(1);
            ss=un.getId();
        }
       return ss;
    }

}
