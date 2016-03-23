package service;

public abstract class Service {
	
	String id;
	
	public Service(String id){
		this.id = id;
	}
	
	public String getId(){
		return id;
	}
}
