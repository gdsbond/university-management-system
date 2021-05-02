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
public class NotesForm extends ActionForm{
     
    int semsterid,batchid,course,subjectid;
    String notes_name;

    public int getSemsterid() {
        return semsterid;
    }

    public void setSemsterid(int semsterid) {
        this.semsterid = semsterid;
    }

    public int getBatchid() {
        return batchid;
    }

    public void setBatchid(int batchid) {
        this.batchid = batchid;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }

    public String getNotes_name() {
        return notes_name;
    }

    public void setNotes_name(String notes_name) {
        this.notes_name = notes_name;
    }

   
    
    FormFile file;

    public FormFile getFile() {
        return file;
    }

    public void setFile(FormFile file) {
        this.file = file;
    }
    
}
