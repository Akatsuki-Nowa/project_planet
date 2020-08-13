package planet.json ;

import java.util.Map ;
import java.util.HashMap ;

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
	
	public JsonMap toJsonMap(){
		Map<String, String> jsonMap= new HashMap<>() ;
		String s = this.json.replaceAll( "[{ \"}]", "" ) ;
	
		for( String object: s.split( "," ) ){
			String[] data = object.split( ":" ) ;
			jsonMap.put( data[0], data[1] ) ;
		}
		
		return new JsonMap( jsonMap ) ;
	}
}
