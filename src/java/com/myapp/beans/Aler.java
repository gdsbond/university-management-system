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
public class Aler implements Serializable{
    
    
     String title,details;
    int semsterid,batchid,alertid;
    Date date;

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
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

    public int getAlertid() {
        return alertid;
    }

    public void setAlertid(int alertid) {
        this.alertid = alertid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }
    
    
    
}
