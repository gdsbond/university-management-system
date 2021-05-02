/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.schedule;
import com.myapp.beans.timetbForm;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.upload.FormFile;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author gdsbond
 */
public class timetbAction extends Action{
    
     
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
     
        
        timetbForm tf=(timetbForm) form;
        int semester=tf.getSemester();
        int course=tf.getCourse();
        int batch=tf.getBatch();
        FormFile timetable=tf.getTimetable();
        
        String filePath=getServlet().getServletContext().getRealPath("/")+"upload";

        File folder=new File(filePath);
        if(!folder.exists()){
            folder.mkdir();
        }
        
        String fileNm=timetable.getFileName();
        if(!("").equals(fileNm)){
            System.out.println("server path "+filePath);
            File neFile=new File(filePath,fileNm);
            
            if(!neFile.exists()){
                FileOutputStream fop=new FileOutputStream(neFile);
                fop.write(timetable.getFileData());
                fop.flush();
                fop.close();
            }
            request.setAttribute("uploadfilepath", neFile.getAbsoluteFile());
            request.setAttribute("uploadfilename", neFile.getName());
            
            String path=neFile.getAbsolutePath();
            
            Session session=Hconnector.Hconnector.getHsession();
            Transaction t=session.beginTransaction();
            schedule sc=new schedule();
            sc.setBatch(batch);
            sc.setCourse(course);
            sc.setSemester(semester);
            sc.setFilepath(path);
            
            session.save(sc);
            t.commit();
            session.close();
            
            
        }
        
        
        return mapping.findForward("success");
    }
    
}
