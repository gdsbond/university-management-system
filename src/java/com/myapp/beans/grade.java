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
public class grade implements Serializable{
 int subid,stid,gradeid;
    double scored,total,internal;

    public int getSubid() {
        return subid;
    }

    public void setSubid(int subid) {
        this.subid = subid;
    }

    public int getStid() {
        return stid;
    }

    public void setStid(int stid) {
        this.stid = stid;
    }

    public int getGradeid() {
        return gradeid;
    }

    public void setGradeid(int gradeid) {
        this.gradeid = gradeid;
    }

    public double getScored() {
        return scored;
    }

    public void setScored(double scored) {
        this.scored = scored;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double getInternal() {
        return internal;
    }

    public void setInternal(double internal) {
        this.internal = internal;
    }

       
    
}
