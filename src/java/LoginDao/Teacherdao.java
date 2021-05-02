/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginDao;

import Hconnector.Hconnector;
import com.myapp.beans.faculty;
import com.myapp.beans.location;
import com.myapp.beans.student;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rishu
 */
public class Teacherdao {
   
  public static boolean teacherinfo(int uid,int dpt,String exper,String qual,int sal){
        boolean stu=false;
        
        faculty ft=new faculty();
        Session s=Hconnector.getHsession();
        Transaction t=s.beginTransaction();
        ft.setUsrid(uid);
        ft.setDepartmentid(dpt);
        ft.setExper(exper);
        ft.setQualification(qual);
        ft.setSallary(sal);
        s.update(ft);
        t.commit();
        stu=true;
        return stu;
        
    }
    
    public static boolean location(String city,String state,String country,String address,int pincode,int uid){
        boolean loca=false;
        
        location loc=new location();
        Session ses=Hconnector.getHsession();
        Transaction transaction=ses.beginTransaction();
        loc.setAddress(address);
        loc.setCity(city);
        loc.setCountry(country);
        loc.setPincode(pincode);
        loc.setState(state);
        loc.setUid(uid);
        ses.update(loc);
        transaction.commit();
       
        return loca;
    }
    
    public static int getid(String username){
        Session ses=Hconnector.getHsession();
        int uid=0;
        Query q=ses.createQuery("FROM student as st WHERE st.username=:user");
        q.setString("user", username);
        
        ArrayList<student> profis=(ArrayList<student>)q.list();
        Iterator<student> itr=profis.iterator();
        if(itr.hasNext()){
        
        student st=itr.next();
        uid=st.getId();
    }
    return uid;
    }
}

