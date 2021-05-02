/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.beans;

import org.apache.struts.action.ActionForm;

/**
 *
 * @author gdsbond
 */
public class SubjectForm extends ActionForm{

    String subject_name,subname;
    int batchid,semsterid,course;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }
    
    
    public String getSubject_name() {
        return subject_name;
    }

    public void setSubject_name(String subject_name) {
        this.subject_name = subject_name;
    }

    public String getSubname() {
        return subname;
    }

    public void setSubname(String subname) {
        this.subname = subname;
    }
    
    

    public int getBatchid() {
        return batchid;
    }

    public void setBatchid(int batchid) {
        this.batchid = batchid;
    }

    public int getSemsterid() {
        return semsterid;
    }

    public void setSemsterid(int semsterid) {
        this.semsterid = semsterid;
    }
    
    
}
