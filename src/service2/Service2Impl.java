package service2;

import com.google.inject.Inject;

import service.Service;
import service.ServiceDependency;

public class Service2Impl extends Service implements Service2{

	ServiceDependency dependency;
	@Inject
	public Service2Impl(String id, ServiceDependency dependency) {
		super(id);
		this.dependency = dependency;
	}

	@Override
	public void doService2() {
		dependency.doService("Doing SERVICE2: "+ getId());
	}
}
