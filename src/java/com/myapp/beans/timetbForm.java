/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.beans;

import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author gdsbond
 */
public class timetbForm extends ActionForm{
    int course,semester,batch;
    FormFile timetable;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
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

    public FormFile getTimetable() {
        return timetable;
    }

    public void setTimetable(FormFile timetable) {
        this.timetable = timetable;
    }
    
    
    
}
