/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package LoginDao;

import com.myapp.beans.Profi;
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
public class LoginDao {
    public boolean login(String un,String pass,Action action){
        boolean res=false;
        
        Session ses=Hconnector.Hconnector.getHsession();
        Query q=ses.createQuery("FROM Profi as profi WHERE profi.uname=:user and profi.pass=:pss");
        q.setString("user", un);
        q.setString("pss", pass);

        ArrayList<Profi> profis=(ArrayList<Profi>)q.list();
        Iterator<Profi> itr=profis.iterator();
        if(itr.hasNext()){
            
            Profi p=itr.next();
            byte[] b=p.getPic();
            
            HttpServlet hs=action.getServlet();
            String server_path=hs.getServletContext().getRealPath("/");
            
            String upload_direct="images/";
            String file_name=un+".jpg";
            String completePath=server_path+upload_direct+file_name;
            try {
                FileOutputStream fos=new FileOutputStream(completePath);
                fos.write(b);
                fos.flush();
                
            } catch (Exception ex) {
                Logger.getLogger(LoginDao.class.getName()).log(Level.SEVERE, null, ex);
            }
            
            
   
                      res=true;
            
     }
        return res;
        
    }
    
}
