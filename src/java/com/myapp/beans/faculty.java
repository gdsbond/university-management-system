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
public class faculty implements Serializable{
     String qualification,exper;
      int facultyid,departmentid,sallary,usrid;

    public String getQualification() {
        return qualification;
    }

    public void setQualification(String qualification) {
        this.qualification = qualification;
    }

    public String getExper() {
        return exper;
    }

    public void setExper(String exper) {
        this.exper = exper;
    }

    public int getFacultyid() {
        return facultyid;
    }

    public void setFacultyid(int facultyid) {
        this.facultyid = facultyid;
    }

    public int getDepartmentid() {
        return departmentid;
    }

    public void setDepartmentid(int departmentid) {
        this.departmentid = departmentid;
    }

    public int getSallary() {
        return sallary;
    }

    public void setSallary(int sallary) {
        this.sallary = sallary;
    }

    public int getUsrid() {
        return usrid;
    }

    public void setUsrid(int usrid) {
        this.usrid = usrid;
    }
      
      
}
