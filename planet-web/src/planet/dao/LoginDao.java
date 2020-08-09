package planet.dao ;

import java.sql.SQLException ;

import java.util.List ;
import java.util.ArrayList ;
import java.util.Map ;
import planet.SQLConstants ;
import planet.dto.LoginDto;
import planet.DataBaseAccessor ;

public class LoginDao {
	
	private DataBaseAccessor accessor = new DataBaseAccessor() ;
	
	public List<LoginDto> getAccountData(){
		List<LoginDto> result = new ArrayList<>() ;
		List<Map<String, String>> dataList ;
		String[] keys = { "id", "password" } ;
		
		try{
			accessor.connect() ;
			dataList = this.accessor.select( SQLConstants.LOGIN_INFO, keys ) ;
			accessor.disconnect() ;
			if( dataList.isEmpty() ){
				return result ;
			}
			LoginDto dto = new LoginDto() ;
			for( Map<String, String> map: dataList ){
				dto.setId( map.get( "id" ) ) ;
				dto.setPassword( map.get( "password" ) ) ;
			}
			result.add( dto ) ;
		}catch( SQLException e ) {
			e.printStackTrace() ;
		}
		
		return result ;
	}
}
