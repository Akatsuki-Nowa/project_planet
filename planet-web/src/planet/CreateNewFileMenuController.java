package planet;

import javax.servlet.annotation.WebServlet;

@WebServlet("/NewFile")
public class CreateNewFileMenuController extends BaseHttpServlet {

    private static final long serialVersionUID = 1L;

    String jspName = "CreateNewFileMenu";

    @Override
    protected String httpMethodPost(){
    	return this.jspName ;
    }
}
