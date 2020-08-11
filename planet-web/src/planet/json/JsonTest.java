package planet.json ;

import java.util.List ;
import java.util.Map ;
import java.util.HashMap ;

public class JsonTest {
	
	public static void main( String[] args ){
		JsonString src = new JsonString( "{alice: \"angel\", \"beatrice\": beautiful, \"Claire\": \"Cute\"}" ) ;
		
		JsonMapList jsonMapList = src.toJsonMapList() ;
		List<Map<String, String>> mapList = jsonMapList.getMapList() ;
		for( Map<String, String> map: mapList ){
			System.out.println( map ) ;
		}
		
		mapList.remove( 1 ) ;
		Map<String, String> dorothyMap = new HashMap<>() ;
		dorothyMap.put( "Dorothy", "Delicious" ) ;
		mapList.add( dorothyMap ) ;
		Map<String, String> EmmaMap = new HashMap<>() ;
		EmmaMap.put( "Emma", "Excellent" ) ;
		mapList.set( 1, EmmaMap ) ;
		
		JsonString jsonString = jsonMapList.toJsonString() ;
		System.out.println( jsonString.getString() ) ;
	}
}
