package cn.crm.service.proxy;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

public class ServiceProxy implements InvocationHandler {
	private Object real;
	public Object bind(Object real) {
		this.real = real;
		return Proxy.newProxyInstance(this.real.getClass().getClassLoader(), this.real.getClass().getInterfaces(), this);
	}
	@Override
	public Object invoke(Object arg0, Method arg1, Object[] arg2) throws Throwable {
		Object pro = null;
		String methodName = arg1.getName();
		if(methodName.contains("add")) {
			pro = arg1.invoke(this.real, arg2);
		} else {
			pro = arg1.invoke(this.real, arg2);
		}
		return pro;
	}

}
