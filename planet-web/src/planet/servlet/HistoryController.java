package planet.servlet;

import javax.servlet.annotation.WebServlet;

import planet.base.BaseHttpServlet;

@WebServlet("/History")
public class HistoryController extends BaseHttpServlet {
	
	private static final long serialVersionUID = 1L;
	
	String jspName = "History";

	@Override
	protected String httpMethodPost(){
		return this.jspName ;
	}
}
