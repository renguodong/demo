package cn.crm.factory;

public class DAOFactory {
	private DAOFactory() {}
	public static <T> T getInstance(Class<T> clas) {
		try {
			return (T) clas.newInstance();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;
	}
}
