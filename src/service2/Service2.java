package service2;

public interface Service2 {

	public void doService2(); 
	
	public interface Service2Factory {
		Service2 create(String id);
	}
	

}
