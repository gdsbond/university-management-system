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
public class fees implements Serializable{
int batch,semester,amount,feesid,course,labfee,libraryfee,examfee,tuitionfee;
    Date duedate;

    public int getCourse() {
        return course;
    }

    public void setCourse(int course) {
        this.course = course;
    }

    public int getLabfee() {
        return labfee;
    }

    public void setLabfee(int labfee) {
        this.labfee = labfee;
    }

    public int getLibraryfee() {
        return libraryfee;
    }

    public void setLibraryfee(int libraryfee) {
        this.libraryfee = libraryfee;
    }

    public int getExamfee() {
        return examfee;
    }

    public void setExamfee(int examfee) {
        this.examfee = examfee;
    }

    public int getTuitionfee() {
        return tuitionfee;
    }

    public void setTuitionfee(int tuitionfee) {
        this.tuitionfee = tuitionfee;
    }

    public Date getDuedate() {
        return duedate;
    }

    public void setDuedate(Date duedate) {
        this.duedate = duedate;
    }
    
    
    public int getBatch() {
        return batch;
    }

    public void setBatch(int batch) {
        this.batch = batch;
    }

    public int getSemester() {
        return semester;
    }

    public void setSemester(int semester) {
        this.semester = semester;
    }

    public int getAmount() {
        return amount;
    }

    public void setAmount(int amount) {
        this.amount = amount;
    }

    public int getFeesid() {
        return feesid;
    }

    public void setFeesid(int feesid) {
        this.feesid = feesid;
    }


}
