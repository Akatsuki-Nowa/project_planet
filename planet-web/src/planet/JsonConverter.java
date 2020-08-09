package planet ;

import java.util.Map ;
import java.util.HashMap ;
import java.util.List ;
import java.util.ArrayList ;

public class JsonConverter {
	
	public String toJsonString( List<Map<String, String>> mapList ){
		String s = "{" ;
		
		if( mapList.isEmpty() ){
			return "{}" ;
		}
		for( Map<String, String> map: mapList ){
			for( String key: map.keySet() ){
				s += "\"" + key.replaceAll( " ", "" ) + "\":\"" + map.get( key ).replaceAll( " ", "" ) + "\"," ;
			}
		}
		
		return s.replaceAll( ",$", "" ) + "}" ;
	}
	
	public List<Map<String, String>> toJsonMap( String json ){
		List<Map<String, String>> mapList = new ArrayList<>() ;
		Map<String, String> map = new HashMap<>() ;

		for( String objects: json.replaceAll( "}$", "" ).split( "}," ) ){
			String[] object = objects.replace( "{", "" ).split( "," ) ;
			for( String datas: object ){
				String[] data = datas.split( ":" ) ;
				map.put( data[0], data[1] ) ;
			}
			mapList.add( map ) ;
		}
		
		return mapList ;
	}
}
