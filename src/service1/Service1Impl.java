package service1;
import com.google.inject.Inject;

import service.Service;
import service.ServiceDependency;

public class Service1Impl extends Service implements Service1 {

	ServiceDependency dependency;
	@Inject
	public Service1Impl(String id, ServiceDependency dependency) {
		super(id);
		this.dependency = dependency;
	}

	@Override
	public void doService1() {
		dependency.doService("Doing SERVICE1: "+ getId());
	}

	
	
}
