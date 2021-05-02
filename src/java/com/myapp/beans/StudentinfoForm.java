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
public class StudentinfoForm extends ActionForm{
    String session;
    int semester,batch,usrid,course,section;

    public String getSession() {
        return session;
    }

    public void setSession(String session) {
        this.session = session;
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

    public int getUsrid() {
        return usrid;
    }

    public void setUsrid(int usrid) {
        this.usrid = usrid;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getSection() {
        return section;
    }

    public void setSection(int section) {
        this.section = section;
    }
    
    
}
