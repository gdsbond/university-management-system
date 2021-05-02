/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package StudentPackage;

import javax.servlet.http.HttpServletRequest;
import org.apache.struts.action.ActionErrors;
import org.apache.struts.action.ActionForm;
import org.apache.struts.action.ActionMapping;
import org.apache.struts.action.ActionMessage;

/**
 *
 * @author Rishu
 */
public class PassBean extends  ActionForm{
  String  pass,conPass;
 
     public ActionErrors validate(ActionMapping mapping, HttpServletRequest request) {
      ActionErrors a = new ActionErrors();
      if(pass.equals("")||pass==null)
      {
          a.add("newpass",new ActionMessage("abc"));
      }
      if(!pass.equals(conPass))
      {
          a.add("wrong" , new ActionMessage("mno") );
      }
      return a;
      
    }
   
    public String getPass() {
        return pass;
    }

    public void setPass(String pass) {
        this.pass = pass;
    }

    public String getConPass() {
        return conPass;
    }

    public void setConPass(String conPass) {
        this.conPass = conPass;
    }

   
    
}
