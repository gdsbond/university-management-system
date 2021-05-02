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
public class assignment implements Serializable{
    String assignment_name,details,path;
    int semsterid,batchid,id;

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getAssignment_name() {
        return assignment_name;
    }

    public void setAssignment_name(String assignment_name) {
        this.assignment_name = assignment_name;
    }

    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
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



    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    
}
