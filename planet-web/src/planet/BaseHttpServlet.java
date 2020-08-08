package planet ;

import java.io.IOException ;

import javax.servlet.RequestDispatcher ;
import javax.servlet.ServletException ;
import javax.servlet.http.HttpServlet ;
import javax.servlet.http.HttpServletRequest ;
import javax.servlet.http.HttpServletResponse ;

public class BaseHttpServlet extends HttpServlet {

    private static final long serialVersionUID = 1L ;

    @Override
    protected void doPost( HttpServletRequest req, HttpServletResponse resp )
            throws ServletException, IOException {

    	String jspName = this.httpMethodPost() ;
    	
        RequestDispatcher dispatcher = req.getRequestDispatcher( "/" + jspName + ".jsp" ) ;
        dispatcher.forward( req, resp ) ;
    }
    
    protected String httpMethodPost(){
    	throw new RuntimeException( "This method need override by extended class." ) ;
    }

    @Override
    protected void doGet( HttpServletRequest req, HttpServletResponse resp )
            throws ServletException, IOException {

        String key = "value" ;
        String vals = req.getParameter( key ) ;

        req.setAttribute( key, vals ) ;

    	String jspName = this.httpMethodGet() ;
    	
        RequestDispatcher dispatcher = req.getRequestDispatcher( "/" + jspName + ".jsp" ) ;
        dispatcher.forward( req, resp ) ;
    }
    
    protected String httpMethodGet(){
    	throw new RuntimeException( "This method need override by extended class." ) ;
    }
}
