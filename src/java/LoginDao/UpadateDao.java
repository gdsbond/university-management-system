/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginDao;

import com.myapp.beans.location;
import com.myapp.beans.student;
import com.myapp.beans.studentinfo;
import java.util.ArrayList;
import java.util.Iterator;
import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gdsbond
 */
public class UpadateDao {
    public static int getLocid(int uid)
    {
        int id=0;
        Session ses=Hconnector.Hconnector.getHsession();
        Query ql=ses.createQuery("from location as l where l.uid=:uid");
        ql.setInteger("uid", uid);
        ArrayList<location> loc=(ArrayList<location>) ql.list();
        Iterator<location> iitrl=loc.iterator();
        if(iitrl.hasNext())
        {
            location lc=iitrl.next();
            id=lc.getLocid();
        }
        return id;
    }
    
    public static String gettype(String uname)
    {
        String ss="";
        Session ses=Hconnector.Hconnector.getHsession();
        Query ql=ses.createQuery("from student as s where s.username=:unm");
        ql.setString("unm", uname);
        ArrayList<student> loc=(ArrayList<student>) ql.list();
        Iterator<student> iitrl=loc.iterator();
        if(iitrl.hasNext())
        {
          student s = iitrl.next();
          ss=s.getType();
        }
        return ss;
    }
    
    public static boolean updateLoction(int uid,String city,String state,String country,int pincode,String address)
    {
        boolean res=false;
         Session ses=Hconnector.Hconnector.getHsession();
        Transaction trss=ses.beginTransaction();
        location lk=(location)ses.get(location.class,new Integer(getLocid(uid)));
        ses.update(lk);
        trss.commit();
        ses.close();
        res=true;
        return res;
    }
    public static boolean upadetUserInfo(int uid,String fnm,String lnm,long phone,String email)
    {
        boolean res=false;
        Session ses=Hconnector.Hconnector.getHsession();
        Transaction trss=ses.beginTransaction();
        student st=(student)ses.get(student.class, new Integer(uid));
        st.setFirst_name("abc");
        st.setLast_name(lnm);
        st.setMobile(phone);
        st.setEmail(email);
        ses.update(st);
        trss.commit();
        ses.close();
        res=true;
        return res;
    }
    public static int getStuid(int uid)
    {
        int id=0;
        Session ses=Hconnector.Hconnector.getHsession();
        Query ql=ses.createQuery("from studentinfo as l where l.uid=:uid");
        ql.setInteger("uid", uid);
        ArrayList<studentinfo> loc=(ArrayList<studentinfo>) ql.list();
        Iterator<studentinfo> iitrl=loc.iterator();
        if(iitrl.hasNext())
        {
            studentinfo lc=iitrl.next();
            id=lc.getStid();
        }
        return id;
    }
    public static boolean updateStudent(int uid,int batch,int ocurse,int sesc)
    {
        Session ses=Hconnector.Hconnector.getHsession();
        boolean res=false;
        Transaction trss=ses.beginTransaction();
        studentinfo si=(studentinfo)ses.get(studentinfo.class, new Integer(getStuid(uid)));
        //si.setBatchid(1);
       // si.setCourseid(ocurse);
        //si.setSection(sesc);
        ses.update(si);
        trss.commit();
        res=true;
        return res;
    }
}
