package planet;

import java.io.IOException;
import java.lang.RuntimeException;

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

public class BaseAjaxServlet extends HttpServlet {

    private static final long serialVersionUID = 1L;

    private String paramsMap;

    @Override
    public void doPost(HttpServletRequest req, HttpServletResponse res)
            throws ServletException, IOException {

        try {
            String params = req.getParameter("params");
            paramsMap = params;

            //ヘッダ設定
            //JSON形式, UTF-8
            res.setContentType("application/json;charset=UTF-8");

            //pwオブジェクト
            PrintWriter pw = res.getWriter();

            String result = createResult();

            //出力
            pw.print(result);

            //クローズ
            pw.close();
        } catch(Exception e) {
            e.printStackTrace();
        }
    }

    // アプリケーション側で中身を作成。＝protected
    protected String createResult() {
        throw new RuntimeException("This method need override by extended class.");
    }

    protected String getParamsMap() {
        return this.paramsMap;
    }
}
