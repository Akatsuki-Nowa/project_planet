package planet ;

import java.util.List ;
import java.util.ArrayList ;
import java.util.Map ;

public class JsonMap {
	
	private List<Map<String, String>> mapList = new ArrayList<>() ;
	
	public JsonMap( List<Map<String, String>> mapList ){
		this.mapList = mapList ;
	}
	
	public List<Map<String, String>> getMapList(){
		return this.mapList ;
	}
	
	public String toJsonString(){
		String s = "{" ;
		
		if( this.mapList.isEmpty() ){
			return "{}" ;
		}
		for( Map<String, String> map: this.mapList ){
			for( String key: map.keySet() ){
				s += "\"" + key.replaceAll( " ", "" ) + "\":\"" + map.get( key ).replaceAll( " ", "" ) + "\"," ;
			}
		}
		
		return s.replaceAll( ",$", "" ) + "}" ;
	}
}
