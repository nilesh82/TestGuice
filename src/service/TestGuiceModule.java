package service;
import com.google.inject.AbstractModule;
import com.google.inject.assistedinject.FactoryModuleBuilder;

import service.TestGuiceAnnotations.ServiceInstance1;
import service.TestGuiceAnnotations.ServiceInstance2;
import service1.Service1;
import service1.Service1Factory;
import service1.Service1Impl;
import service2.Service2;
import service2.Service2.Service2Factory;
import service2.Service2Impl;

public class TestGuiceModule extends AbstractModule{

	@Override
	protected void configure() {
		bind(ServiceDependency.class).to(ServiceDependencyImpl.class);
		
		bind(Service1.class).annotatedWith(ServiceInstance1.class).to(Service1Impl.class);
		bind(Service2.class).annotatedWith(ServiceInstance2.class).to(Service2Impl.class);
	}
	
	
	protected void notused(){
		bind(ServiceDependency.class).to(ServiceDependencyImpl.class);
		install(new FactoryModuleBuilder()
				.implement(Service1.class, Service1Impl.class)
				.build(Service1Factory.class));
		
		install(new FactoryModuleBuilder()
				.implement(Service2.class, Service2Impl.class)
				.build(Service2Factory.class));
	}

	
}
