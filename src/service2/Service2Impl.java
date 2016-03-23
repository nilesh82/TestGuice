package service2;

import com.google.inject.Inject;
import com.google.inject.assistedinject.Assisted;

import service.Service;
import service.ServiceDependency2;

public class Service2Impl extends Service implements Service2{

	ServiceDependency2 dependency;
	@Inject
	public Service2Impl(@Assisted String id, ServiceDependency2 dependency) {
		super(id);
		this.dependency = dependency;
	}

	@Override
	public void doService2() {
		dependency.doService("Doing SERVICE2: "+ getId());
	}
}
