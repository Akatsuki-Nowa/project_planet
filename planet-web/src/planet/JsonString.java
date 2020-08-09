package planet ;

import java.util.ArrayList ;
import java.util.HashMap ;
import java.util.List ;
import java.util.Map ;

public class JsonString {
	
	private String json = "{}" ;
	
	public JsonString( String json ){
		this.json = json ;
	}
	
	public String getString(){
		return this.json ;
	}
	
	public List<Map<String, String>> toJsonMap(){
		List<Map<String, String>> mapList = new ArrayList<>() ;
		Map<String, String> map = new HashMap<>() ;
	
		for( String objects: this.json.replaceAll( "}$", "" ).split( "}," ) ){
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
