package planet;
import java.text.SimpleDateFormat;
import java.util.Date;

import javax.servlet.annotation.WebServlet;

@WebServlet("/Ajax")
public class Ajax extends BaseAjaxServlet {

	private static final long serialVersionUID = 1L;
	
	@Override
	 protected String createResult() {
		String result = super.getParamsMap();
		Date date = new Date();
		String str = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
		result += "ajax通信成功！！！！！" + str;
		return result;
	}
	
}
