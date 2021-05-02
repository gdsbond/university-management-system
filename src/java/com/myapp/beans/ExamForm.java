/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.beans;

import java.sql.Time;
import java.util.Date;
import org.apache.struts.action.ActionForm;

/**
 *
 * @author gdsbond
 */
public class ExamForm extends ActionForm{

    int roomno,subject,course,semester,batch;
    String date;
    String time;
    String hour;

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

   
    

    public int getRoomno() {
        return roomno;
    }

    public void setRoomno(int roomno) {
        this.roomno = roomno;
    }

    public int getSubject() {
        return subject;
    }

    public void setSubject(int subject) {
        this.subject = subject;
    }

    public String getDate() {
        return date;
    }

    public void setDate(String date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getHour() {
        return hour;
    }

    public void setHour(String hour) {
        this.hour = hour;
    }
 
    
    
}
