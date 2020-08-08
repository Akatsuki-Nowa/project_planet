package planet ;

import javax.servlet.annotation.WebServlet ;

@WebServlet( "/AjaxGenerator" )
public class AjaxGenerator extends BaseAjaxGenerator {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected String makeAjaxResult() throws Exception{
		return AjaxConstants.TEST ;
	}
}
