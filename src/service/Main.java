package service;

import com.google.inject.Guice;
import com.google.inject.Inject;
import com.google.inject.Injector;

import service.TestGuiceAnnotations.Service1Instance1;
import service.TestGuiceAnnotations.Service1Instance2;
import service.TestGuiceAnnotations.Service2Instance1;
import service1.Service1;
import service1.Service1Factory;
import service2.Service2;
import service2.Service2.Service2Factory;

public class Main {

	private Service1 service1instance1;
	private Service1 service1instance2;
	
	private Service2 service2instance1;
	
	@Inject
	public Main(Service1Factory factory){
		this.service1instance1 = factory.createService1(Service1Instance1.class.getSimpleName());
		this.service1instance2 = factory.createService1(Service1Instance2.class.getSimpleName());
		this.service2instance1 = factory.createService2(Service2Instance1.class.getSimpleName());
	}
	public void doSomething(){
		service1instance1.doService1();
		service1instance2.doService1();
		service2instance1.doService2();
	}
	
	public static void main(String[] args){
		Injector injector = Guice.createInjector(new TestGuiceModule());
		Main main = injector.getInstance(Main.class);
		main.doSomething();
		
	}
}
