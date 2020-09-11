package planet.ajax ;

import javax.servlet.annotation.WebServlet ;

import planet.base.BaseAjaxGenerator;
import planet.constant.AjaxConstants;

@WebServlet( "/AjaxGenerator" )
public class AjaxGenerator extends BaseAjaxGenerator {

	private static final long serialVersionUID = 1L;
	
	@Override
	protected String makeAjaxResult() throws Exception{
		return AjaxConstants.TEST ;
	}
}
