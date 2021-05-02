/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPackage;

import com.myapp.bo.UserBo;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import javax.servlet.http.HttpSession;
import org.apache.struts.action.Action;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionForward;
import org.apache.struts.action.ActionMapping;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 *
 * @author Rishu
 */
public class PassAction extends Action{
    public  ActionForward execute (ActionMapping mapping, ActionForm form, HttpServletRequest request, HttpServletResponse response)
    { 
        String target ="failure";
        boolean res=false;
        PassBean p=(PassBean) form;
        HttpSession session=request.getSession();
        int uid =UserBo.getUserId((String)session.getAttribute("uname"));
        res =UserBo.updatePass(uid, p.getPass());
        
        res=true;  
        target="success";
        return mapping.findForward(target) ;
        
    }
}
