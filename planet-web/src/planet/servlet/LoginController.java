package planet.servlet ;

import javax.servlet.annotation.WebServlet ;
import java.util.List;

import planet.base.BaseHttpServlet;
import planet.dao.LoginDao;
import planet.dto.LoginDto;

@WebServlet( "/main" )
public class LoginController extends BaseHttpServlet {

    private static final long serialVersionUID = 1L ;

    String jspName = "MainMenu" ;
    
    @Override
    protected String httpMethodPost(){
    	LoginDao dao = new LoginDao() ;
        List<LoginDto> dto = dao.getAccountData() ;
        
        return this.jspName ;
    }
}
