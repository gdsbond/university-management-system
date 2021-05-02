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
public class CourseForm extends ActionForm{
    String course_name;

    public String getCourse_name() {
        return course_name;
    }

    public void setCourse_name(String course_name) {
        this.course_name = course_name;
    }

   

    
}
