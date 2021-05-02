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
public class DepartmentForm extends ActionForm{
    String name;
    int hod;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getHod() {
        return hod;
    }

    public void setHod(int hod) {
        this.hod = hod;
    }
    

    
    
}
