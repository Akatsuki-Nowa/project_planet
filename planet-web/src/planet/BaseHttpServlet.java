package planet;

import java.io.IOException;
import java.io.PrintWriter;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseHttpServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private String jspName = null;

    protected void setJspName(String jspName){
        this.jspName = "/" + jspName + ".jsp";
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String view = this.jspName;
        RequestDispatcher dispatcher = req.getRequestDispatcher(view);
        dispatcher.forward(req, resp);
    }

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp)
            throws ServletException, IOException {

        String view = this.jspName;
        String key = "value";
        String vals = req.getParameter(key);

        //リクエストスコープにセット
        req.setAttribute(key, vals);

        RequestDispatcher dispatcher = req.getRequestDispatcher(view);
        dispatcher.forward(req, resp);
    }
}
