package planet.json ;

import java.util.ArrayList ;
import java.util.HashMap ;
import java.util.List ;
import java.util.Map ;

public class JsonString {
	
	private String json ;
	
	public JsonString( String json ){
		this.json = json ;
	}
	
	public JsonString(){
		this.json = "{}" ;
	}
	
	public String getString(){
		return this.json ;
	}
	
	public JsonMapList toJsonMapList(){
		List<Map<String, String>> jsonMapList = new ArrayList<>() ;
		String s = this.json.replaceAll( "[{ \"}]", "" ) ;
	
		for( String object: s.split( "," ) ){
			String[] data = object.split( ":" ) ;
			Map<String, String> map = new HashMap<>() ;
			map.put( data[0], data[1] ) ;
			jsonMapList.add( map ) ;
		}
		
		return new JsonMapList( jsonMapList ) ;
	}
}
