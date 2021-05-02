/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.beans;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author gdsbond
 */
public class scheduleForm extends ActionForm{
 int semester,batch,course;
    FormFile fff;

    public FormFile getFff() {
        return fff;
    }

    public void setFff(FormFile fff) {
        this.fff = fff;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

  
    
    
}
