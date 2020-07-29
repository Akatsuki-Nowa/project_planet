package planet;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/NewFile")
public class CreateNewFileMenuController extends BaseHttpServlet {

    private static final long serialVersionUID = 1L;

    String jspName = "CreateNewFileMenu";

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        super.setJspName(jspName);
        super.doPost(req,resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        super.setJspName(jspName);
        super.doGet(req, resp);
    }
}
