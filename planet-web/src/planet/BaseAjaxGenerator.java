package planet;

import java.io.IOException;
import java.lang.RuntimeException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

public class BaseAjaxGenerator extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private String paramsMap;

    @Override
    public void doPost( HttpServletRequest req, HttpServletResponse res )
            throws ServletException, IOException {

        try {
            String params = req.getParameter( "params" ) ;
            paramsMap = params ;

            res.setContentType( "application/json;charset=UTF-8" ) ;
            
            res.getWriter().print( this.makeAjaxResult() ) ;

        } catch(Exception e) {
            e.printStackTrace() ;
        }
    }

    protected String makeAjaxResult() throws Exception {
        throw new RuntimeException( "This method need override by extended class." ) ;
    }

    protected String getParamsMap(){
        return this.paramsMap ;
    }
}
