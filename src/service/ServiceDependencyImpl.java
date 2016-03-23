package service;

public class ServiceDependencyImpl implements ServiceDependency {

	@Override
	public void doService(String str) {
		System.out.println(str);
	}

}
