package cn.crm.factory;

import cn.crm.service.proxy.ServiceProxy;

public class ServiceFactory {
	private ServiceFactory() {}
	@SuppressWarnings("unchecked")
	public static <T> T getInstance(Class<T> clas) {
		try {
			return (T) new ServiceProxy().bind(clas.newInstance());
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
