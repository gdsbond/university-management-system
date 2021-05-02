/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.beans;

import java.io.Serializable;
import java.util.Date;

/**
 *
 * @author gdsbond
 */
public class exam implements Serializable{
    
    
    int roomno,subject,examid,semester,course,batch;
    Date date;
    String time;

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
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

    public int getExamid() {
        return examid;
    }

    public void setExamid(int examid) {
        this.examid = examid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

  

    
    
    
}
