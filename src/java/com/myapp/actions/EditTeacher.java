/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package com.myapp.actions;

import com.myapp.beans.EditStudentForm;
import com.myapp.beans.faculty;
import com.myapp.beans.location;
import com.myapp.beans.student;
import com.myapp.beans.studentinfo;
import java.util.ArrayList;
import java.util.Iterator;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Query;
import org.hibernate.Session;

/**
 *
 * @author gdsbond
 */
public class EditTeacher extends Action {

    public ActionForward execute(ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response) {
        EditStudentForm editStudentForm = (EditStudentForm) form;
        int uid = editStudentForm.getLnk();
        Session ses1 = Hconnector.Hconnector.getHsession();
        Query gd = ses1.createQuery("FROM student as stud where stud.id=:idd");
        gd.setInteger("idd", uid);
        ArrayList<student> student = (ArrayList<student>) gd.list();
        Iterator<student> studeitr = student.iterator();

        while (studeitr.hasNext()) {

            student sem = studeitr.next();

            request.setAttribute("fname", sem.getFirst_name());
            request.setAttribute("lname", sem.getLast_name());

            request.setAttribute("mobile", sem.getMobile());
            request.setAttribute("email", sem.getEmail());

            Query q = ses1.createQuery("From  location as l where l.uid =:uidd");
            q.setInteger("uidd", uid);
            ArrayList<location> loc = (ArrayList<location>) q.list();
            Iterator<location> loc1 = loc.iterator();
            if (loc1.hasNext()) {
                location locc = loc1.next();
                request.setAttribute("city", locc.getCity());
                request.setAttribute("state", locc.getState());
                request.setAttribute("address", locc.getAddress());
                request.setAttribute("country", locc.getCountry());
                request.setAttribute("pincode", locc.getPincode());

                Query qd = ses1.createQuery("From  faculty as f where f.usrid =:uidd");
                qd.setInteger("uidd", uid);
                ArrayList<faculty> st = (ArrayList<faculty>) qd.list();
                Iterator<faculty> stitr = st.iterator();
                if (stitr.hasNext()) {
                    faculty fac = stitr.next();
                    request.setAttribute("exper", fac.getExper());
                    request.setAttribute("department", fac.getDepartmentid());
                    request.setAttribute("sallary", fac.getSallary());
                    request.setAttribute("qualification", fac.getQualification());
                }
            }
        }
        return mapping.findForward("success");
    }
}
