/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginDao;

import com.myapp.beans.Profi;
import com.myapp.beans.student;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.servlet.http.HttpServlet;
import org.apache.struts.action.Action;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author gdsbond
 */
public class studentlogindao {
    public boolean studentLogin(String un,String pass,Action action){
        boolean res=false;
        
        Session ses=Hconnector.Hconnector.getHsession();
        Query q=ses.createQuery("FROM student as s WHERE s.username=:user and s.password=:pss");
        q.setString("user", un);
        q.setString("pss", pass);

        ArrayList<student> arr=(ArrayList<student>)q.list();
        Iterator<student> itr=arr.iterator();
        if(itr.hasNext()){
            
            student s=itr.next();
            byte[] b=s.getProfile_pic();
            
            HttpServlet hs=action.getServlet();
            String server_path=hs.getServletContext().getRealPath("/");
            
            String upload_direct="images/";
            String file_name= un+".jpg";
            String completePath=server_path+upload_direct+file_name;
            try {
                FileOutputStream fos=new FileOutputStream(completePath);
                fos.write(b);
                fos.flush();
                
            } catch (Exception ex) {
                Logger.getLogger(studentlogindao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
   
                      res=true;
            
     }
        return res;
        
    }
    
}
