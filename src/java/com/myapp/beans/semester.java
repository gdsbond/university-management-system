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
public class semester implements Serializable{
    int semesterid,schoolid;
    String name;

    public int getSemesterid() {
        return semesterid;
    }

    public void setSemesterid(int semesterid) {
        this.semesterid = semesterid;
    }

    public int getSchoolid() {
        return schoolid;
    }

    public void setSchoolid(int schoolid) {
        this.schoolid = schoolid;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

  


    public Date getBegindate() {
        return begindate;
    }

    public void setBegindate(Date begindate) {
        this.begindate = begindate;
    }

    public Date getEnddate() {
        return enddate;
    }

    public void setEnddate(Date enddate) {
        this.enddate = enddate;
    }
    Date begindate,enddate;
    
}
