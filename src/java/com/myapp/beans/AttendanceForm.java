/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.beans;

import java.util.Date;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;

/**
 *
 * @author gdsbond
 */
public class AttendanceForm extends ActionForm{
  
    String status[];

    public String[] getStatus() {
        return status;
    }

    public void setStatus(String[] status) {
        this.status = status;
    }

  
    

    public int[] getStid() {
        return stid;
    }

    public void setStid(int[] stid) {
        this.stid = stid;
    }

    
    public int getScheduleid() {
        return scheduleid;
    }

    public void setScheduleid(int scheduleid) {
        this.scheduleid = scheduleid;
    }
    int stid[],scheduleid;
    
}
