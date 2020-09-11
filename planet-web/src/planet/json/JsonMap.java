package planet.json ;

import java.util.Map ;
import java.util.HashMap ;

public class JsonMap {
	
	private Map<String, String> map = new HashMap<>() ;
	
	public JsonMap( Map<String, String> map ){
		this.map = map ;
	}
	
	public Map<String, String> getMap(){
		return this.map ;
	}
	
	public JsonString toJsonString(){
		StringBuilder sb = new StringBuilder() ;
		
		sb.append( "{" ) ;
		
		if( this.map.isEmpty() ){
			return new JsonString() ;
		}
		for( String key: map.keySet() ){
			sb.append( "\"" )
				.append( key.replaceAll( " ", "" ) )
				.append( "\":\"" )
				.append( map.get( key ).replaceAll( " ", "" ) )
				.append( "\"," ) ;
		}
		
		return new JsonString( sb.toString().replaceAll( ",$", "" ) + "}" ) ;
	}
}
