/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.FileUploadForm;
import com.myapp.beans.assignment;
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
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

/**
 *
 * @author gdsbond
 */
public class FileUploadAction extends Action {
    
    
    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) throws FileNotFoundException, IOException{
       
        FileUploadForm fileUploadForm=(FileUploadForm) form;
         FormFile file=fileUploadForm.getFile();
         String details=fileUploadForm.getDetails();
        String assigname=fileUploadForm.getAssignment_name();
        int semsterid=fileUploadForm.getSemsterid();
        int batchid=fileUploadForm.getBatchid();
              
         
         String filePath=getServlet().getServletContext().getRealPath("/")+"upload";
         
         File folder=new File(filePath);
         if(!folder.exists()){
             folder.mkdir();
         }
        
         String fileName=file.getFileName();
         if(!("").equals(fileName)){
             System.out.print("server path" +filePath);
             File newFile=new File(filePath, fileName);
             
             if(!newFile.exists()){
                 FileOutputStream fos=new FileOutputStream(newFile);
                 fos.write(file.getFileData());
                 fos.flush();
                 fos.close();
             }
             request.setAttribute("uploadedFilePath", newFile.getAbsoluteFile());
             request.setAttribute("uploadedFileName", newFile.getName());
             
             
             String path=newFile.getAbsolutePath();
        
         
         
         try{
        
         Configuration configuration = new Configuration();
        configuration.configure("hibernate.cfg.xml");
        SessionFactory sessionFactory = configuration.buildSessionFactory();
        Session session = sessionFactory.openSession();
        
        Transaction t=session.beginTransaction();
        assignment assig=new assignment();
        assig.setAssignment_name(assigname);
        assig.setDetails(details);
        assig.setBatchid(batchid);
        assig.setSemsterid(semsterid);
        assig.setPath(path);
       // assig.setId(4);
        session.save(assig);
        t.commit();
        
        }catch(Exception E){System.out.print("errorr is :"+E);}
         }
        return mapping.findForward("success");
        
    }
    
    }
