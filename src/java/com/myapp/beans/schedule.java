/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.beans;

import java.io.Serializable;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author gdsbond
 */
public class schedule implements Serializable{
    
     int semester,batch,course,timetableid;
  String filepath;

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

    public int getTimetableid() {
        return timetableid;
    }

    public void setTimetableid(int timetableid) {
        this.timetableid = timetableid;
    }

    public String getFilepath() {
        return filepath;
    }

    public void setFilepath(String filepath) {
        this.filepath = filepath;
    }
  
  
    
    
}
