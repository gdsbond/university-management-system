/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.schedule;
import com.myapp.beans.scheduleForm;
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
public class scheduleAction extends Action{
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
    
        scheduleForm sf=(scheduleForm) form;
        
        String filePath="";
        String fileName="";
        
        //try{
       FormFile f=sf.getFff();
         filePath=getServlet().getServletContext().getRealPath("/")+"upload";
        System.out.println(f +"ffffffffffffffffffffffffffffffffffff");
        
        //}catch(Exception e){System.out.print(e);}
        int semester=sf.getSemester();
        int batch=sf.getBatch();
        int course=sf.getCourse();
        
       
        
        File folder=new File(filePath);
         if(!folder.exists())
         {
             folder.mkdir();
         }
         
        // try{
        fileName =f.getFileName();
        // }catch(Exception e){
         //    System.out.print(e);}
         
         if(!("").equals(fileName)){
             System.out.print("server path" +filePath);
             File newFile=new File(filePath, fileName);
             
             if(!newFile.exists()){
                 FileOutputStream fos=new FileOutputStream(newFile);
                 fos.write(f.getFileData());
                 fos.flush();
                 fos.close();
             }
          request.setAttribute("uploadedFilePath", newFile.getAbsoluteFile());
          request.setAttribute("uploadedFileName", newFile.getName());
         String path=newFile.getAbsolutePath()+newFile.getName();
        
        Session ses=Hconnector.Hconnector.getHsession();
        Transaction trans=ses.beginTransaction();
        schedule sc=new schedule();
        
        sc.setBatch(batch);
        sc.setCourse(course);
        sc.setSemester(semester);
        sc.setFilepath(path);
        
        ses.save(sc);
        trans.commit();
        ses.close();
        
        
         }
        return mapping.findForward("success");
    }
}
