package planet;

import java.io.IOException;
import java.io.PrintWriter;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Map;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

@WebServlet("/AjaxServlet")
public class BaseAjaxServlet2 extends HttpServlet {

    private static final long serialVersionUID = 1L;

    @Override
    public void doPost (HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

    try {

        //処理（DB呼び出し等）
        String response1 = "";
        String response2 = "";

        //出力(レスポンスをmapに格納してJSON化)

        //JSONマップ
        Map<String, String> mapMsg = new HashMap<String, String>();

        //追加
        mapMsg.put("response1", response1);
        mapMsg.put("response2", response2);

        //ヘッダ設定
        res.setContentType("application/json;charset=UTF-8");   //JSON形式, UTF-8

        //pwオブジェクト
        PrintWriter pw = res.getWriter();

        String result = "";
		Date date = new Date();
		String str = new SimpleDateFormat("yyyy-MM-dd hh:mm:ss").format(date);
		result = "ajax通信成功！！！！！" + str + response1+response2;
		
        //出力
        pw.print(result);

        //クローズ
        pw.close();

    } catch(Exception e) {
        e.printStackTrace();
    }

    }

}


