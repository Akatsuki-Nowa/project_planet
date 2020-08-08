package planet;

import javax.servlet.annotation.WebServlet;
import dao.LoginDao;

@WebServlet("/main")
public class LoginController extends BaseHttpServlet {

    private static final long serialVersionUID = 1L;

    String jspName = "MainMenu";
    
    @Override
    protected String httpMethodPost(){
        LoginDao dao = new LoginDao() ;
        dao.executeQuery() ;
        
        return this.jspName ;
    }
}
