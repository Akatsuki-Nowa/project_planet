package planet.json ;

import java.util.List ;
import java.util.ArrayList ;
import java.util.Map ;

public class JsonMapList {
	
	private List<Map<String, String>> mapList = new ArrayList<>() ;
	
	public JsonMapList( List<Map<String, String>> mapList ){
		this.mapList = mapList ;
	}
	
	public List<Map<String, String>> getMapList(){
		return this.mapList ;
	}
	
	public JsonString toJsonString(){
		String s = "{" ;
		
		if( this.mapList.isEmpty() ){
			return new JsonString() ;
		}
		for( Map<String, String> map: this.mapList ){
			for( String key: map.keySet() ){
				s += "\"" + key.replaceAll( " ", "" ) + "\":\"" + map.get( key ).replaceAll( " ", "" ) + "\"," ;
			}
		}
		
		return new JsonString( s.replaceAll( ",$", "" ) + "}" ) ;
	}
}
