/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginDao;

import Hconnector.Hconnector;
import com.myapp.beans.location;
import com.myapp.beans.student;
import java.util.ArrayList;
import java.util.Date;
import java.util.Iterator;
import javax.servlet.http.HttpSession;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gdsbond
 */
public class StudentDao {
    public boolean Student(String first_name,String last_name,String username,String password,String gender,String email,String type,Date creation_date,Date dob,long mobile,byte[] profile_pic){
        boolean stu=false;
        
        student st=new student();
        Session s=Hconnector.getHsession();
        Transaction t=s.beginTransaction();
        st.setDob(dob);
        st.setCreation_date(creation_date);
        st.setEmail(email);
        st.setFirst_name(first_name);
        st.setGender(gender);
        st.setLast_name(last_name);
        st.setMobile(mobile);
        st.setPassword(password);
        st.setProfile_pic(profile_pic);
        st.setType(type);
        st.setUsername(username);
        s.save(st);
        t.commit();
        stu=true;
        
        
        return stu;
        
    }
    
    public boolean location(String city,String state,String country,String address,int pincode,int uid){
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
        ses.save(loc);
        transaction.commit();
        
        
        return loca;
    }
    
    public static int getuid(String username){
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
