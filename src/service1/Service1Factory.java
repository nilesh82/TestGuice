package service1;

import service2.Service2;

public interface Service1Factory{
	Service1 createService1(String id);
	Service2 createService2(String id);
}

