/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.beans;

import java.io.Serializable;

/**
 *
 * @author gdsbond
 */
public class notes implements Serializable{
    
      String path,notes_name;
    int semsterid,batchid,course,id,subjectid;

    public String getNotes_name() {
        return notes_name;
    }

    public void setNotes_name(String notes_name) {
        this.notes_name = notes_name;
    }

    public int getSubjectid() {
        return subjectid;
    }

    public void setSubjectid(int subjectid) {
        this.subjectid = subjectid;
    }

    
    
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

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



    
}
