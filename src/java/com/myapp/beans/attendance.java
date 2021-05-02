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
public class attendance implements Serializable{
      int id,scheduleid,stid;
      Date date;

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

      
      
    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(int scheduleid) {
        this.scheduleid = scheduleid;
    }

    public Date getDate() {
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }
    String status;
}
