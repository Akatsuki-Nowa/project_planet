package planet.dto ;

public class LoginDto{
	
	private String id = null ;
	private String password = null ;
	
	public String getId(){
		return this.id ;
	}
	
	public void setId( String id ){
		this.id = id ;
	}
	
	public String getPassword(){
		return this.password ;
	}
	
	public void setPassword( String password ){
		this.password = password ;
	}
}
