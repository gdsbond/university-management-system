/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.beans;

import org.apache.struts.action.ActionForm;
import org.apache.struts.upload.FormFile;

/**
 *
 * @author gdsbond
 */
public class FileUploadForm extends ActionForm{
    String assignment_name,details;
    int semsterid,batchid;

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

    public String getAssignment_name() {
        return assignment_name;
    }

    public void setAssignment_name(String assignment_name) {
        this.assignment_name = assignment_name;
    }


    public String getDetails() {
        return details;
    }

    public void setDetails(String details) {
        this.details = details;
    }
    FormFile file;

    public FormFile getFile() {
        return file;
    }

    public void setFile(FormFile file) {
        this.file = file;
    }
    
}
