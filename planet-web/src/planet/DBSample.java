package planet;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;



public class DBSample {

  public static List<Map<String,String>> dbConnect(String query,String[] keys) {
    Connection con = null;
    PreparedStatement pstmt = null;
    ResultSet rs = null;
    List<Map<String,String>> entryMapList = new ArrayList<>();

    try {

      con = DriverManager.getConnection(
        "jdbc:mysql://localhost/planet?useSSL=false",
        "root",
        ""
      );// "password"の部分は，各自の環境に合わせて変更してください。

      pstmt = con.prepareStatement(query);

      rs = pstmt.executeQuery();
      try {
    	  
		  while (rs.next()) {
			  Map<String,String> entryMap = new HashMap<>();
			  for(String key:keys) {
				  entryMap.put(key, rs.getString(key));
			  }
			  entryMapList.add(entryMap);
		  }
		}catch (SQLException e) {
            e.printStackTrace();
		}

    } catch (SQLException e) {
      e.printStackTrace();
    } finally{
    	try{
    	    if (con != null){
    	      con.close();
    	      pstmt.close();
    	      rs.close();
    	    }
    	  }catch (SQLException e){
    	    // 例外処理
    		  e.printStackTrace();
    	  }
    }
  	return entryMapList;
  }
}