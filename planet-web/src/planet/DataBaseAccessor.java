package planet;

import java.sql.Connection ;
import java.sql.DriverManager ;
import java.sql.PreparedStatement ;
import java.sql.ResultSet ;
import java.sql.SQLException ;
import java.util.List ;
import java.util.ArrayList ;
import java.util.Map ;
import java.util.HashMap ;

public class DataBaseAccessor {
	
	private Connection connection ;
	
	public void connect() throws SQLException {
		this.connection = DriverManager.getConnection(
				"jdbc:mysql://localhost/planet?useSSL=false",
				"root",
				""
			) ;
	}
	
	public List<Map<String, String>> select( String query, String[] keys ) throws SQLException {
		List<Map<String, String>> resultList = new ArrayList<>() ;
		Map<String, String> resultMap = new HashMap<>() ;
		
		PreparedStatement statement = this.connection.prepareStatement( query ) ;
		ResultSet result = statement.executeQuery() ;
		
		while( result.next() ){
			for( String key: keys ){
				resultMap.put( key, result.getString( key ) ) ;
			}
			resultList.add( resultMap ) ;
		}
		
		statement.close() ;
		result.close() ;
		
		return resultList ;
	}
	
	public void disconnect() throws SQLException {
		this.connection.close() ;
	}
}
