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
public class GradeForm extends ActionForm{
 int subid,stid[];
    double scored[],total,internal[];

    public int getSubid() {
        return subid;
    }

    public void setSubid(int subid) {
        this.subid = subid;
    }

    public int[] getStid() {
        return stid;
    }

    public void setStid(int[] stid) {
        this.stid = stid;
    }

    public double[] getScored() {
        return scored;
    }

    public void setScored(double[] scored) {
        this.scored = scored;
    }

    public double getTotal() {
        return total;
    }

    public void setTotal(double total) {
        this.total = total;
    }

    public double[] getInternal() {
        return internal;
    }

    public void setInternal(double[] internal) {
        this.internal = internal;
    }

   
    
}
