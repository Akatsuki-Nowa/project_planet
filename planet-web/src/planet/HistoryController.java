package planet;
import java.io.IOException;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/History")
public class HistoryController extends BaseHttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	String jspName = "History";
	
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
