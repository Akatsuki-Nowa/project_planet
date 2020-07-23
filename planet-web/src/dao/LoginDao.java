package dao;

import java.util.List;
import java.util.Map;

import planet.DBSample;
import planet.SQLConst;

public class LoginDao{
	private String id = null;
	private String password = null;
	
	
	public String getId() {
		return this.id;
	}
	
	public String getPassword() {
		return this.password;
	}
	
	
	public void executeQuery() {
		String[] keys = {"id","password"};
		List<Map<String,String>> entryMapList = DBSample.dbConnect(SQLConst.loginInfo,keys);
		
		entryMapList.forEach(entryMap ->{
			for(Map.Entry<String, String> entry : entryMap.entrySet()) {
			    System.out.println(entry.getKey());
			    System.out.println(entry.getValue());
			}
		});
		System.out.print("mapListの件数は");
		System.out.print(entryMapList.size());
	}
	
}
