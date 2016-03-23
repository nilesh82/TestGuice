package service;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import service.TestGuiceAnnotations.ServiceInstance1;
import service.TestGuiceAnnotations.ServiceInstance2;
import service1.Service1;
import service1.Service1Factory;
import service2.Service2;
import service2.Service2.Service2Factory;

public class Main {

	private Service1 service1;
	private Service2 service2;
	
	
	public Main(Service1Factory facotry1, Service2Factory factory2){
		service1 = facotry1.create("test1");
		service2 = factory2.create("test2");	
	}
	
	@Inject
	public Main(@ServiceInstance1 Service1 service1, @ServiceInstance2 Service2 service2){
		this.service1 = service1;
		this.service2 = service2;
	}
	
	public void doSomething(){
		service1.doService1();
		service2.doService2();
	}
	
	public static void main(String[] args){
		Injector injector = Guice.createInjector(new TestGuiceModule());
		Main main = injector.getInstance(Main.class);
		main.doSomething();
		
	}
}
