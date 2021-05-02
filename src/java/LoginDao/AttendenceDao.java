/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginDao;

import Hconnector.Connector;
import com.myapp.beans.attendance;
import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author gdsbond
 */
public class AttendenceDao {
    
     
    public static void main (String args[])
    { int z=(Integer)getpresent(25, 7);
        System.out.print(z);
    }
    
//    public static int gettotal(int sid , int sub)
//    {int b=0;
//         Session s = Hconnector.Hconnector.getHsession();
//        Query q= s.createQuery("From attendance as a where a.stid=:sid and a.scheduleid=:sub");
//        q.setInteger("sid", sid);
//        q.setInteger("sub", sub);
//         ArrayList<attendance> array = (ArrayList<attendance>) q.list();
//        Iterator<attendance> iitr = array.iterator();
//        
//        while(iitr.hasNext())
//        {
//            b++;
//        }   
//        s.close();
//         return b;
//    }
    
    
    
    public  static int getpresent(int sid, int sub)
    { 
        int a=0;
        int b=0;
        int c=0;
        Connector con=new Connector();
        ResultSet rs=con.executeq("select * from attendance where stid="+sid+" and subjectid="+sub+" and status='present'");
        try {
            while(rs.next())
            {
                a++;
            }
   
        } catch (SQLException ex) {
            Logger.getLogger(AttendenceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        ResultSet res=con.executeq("select * from attendance where stid="+sid+" and subjectid="+sub+" ");
        try {
            while(res.next()){
                b++;
            }
        } catch (SQLException ex) {
            Logger.getLogger(AttendenceDao.class.getName()).log(Level.SEVERE, null, ex);
        }
        
        c=(a/b)*100;
        
        
         return c;
    }
}
