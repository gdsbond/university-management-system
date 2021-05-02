/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import LoginDao.Teacherdao;
import com.myapp.beans.updateTeacher;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;

/**
 *
 * @author Rishu
 */
public class UpdateTeacher extends Action{
     public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
     {
         updateTeacher ut = (updateTeacher) form;
        
         boolean r = Teacherdao.location(ut.getCity(),ut.getCity(),ut.getCountry(),ut.getAddress(),ut.getPincode(),ut.getUid());
         boolean r1= Teacherdao.teacherinfo(ut.getUid(),ut.getDepartmentid(), ut.getExper(),ut.getQualification(),ut.getSallary());
         return null;
     }
}
