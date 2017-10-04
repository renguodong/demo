package cn.rgd.db;

import java.sql.Connection;
import java.sql.DriverManager;

public class DBConnection {
	private final static String DBDRIVER = "org.gjt.mm.mysql.Driver";
	private final static String DBURL = "jdbc:mysql://localhost:3306/rgd";
	private final static String DBUSER= "root";
	private final static String DBPASSWORD = "mysqladmin";
	private static ThreadLocal<Connection> tl = new ThreadLocal<Connection>();
	private DBConnection() {}
	public static Connection getConn() {
		Connection conn = tl.get();
		if(conn == null) {
			try {
				Class.forName(DBDRIVER);
				conn = DriverManager.getConnection(DBURL, DBUSER, DBPASSWORD);
				tl.set(conn);
			} catch (Exception e) {
				e.printStackTrace();
			}
		}
		return conn;
	}
	public static void close() {
		try {
			if(tl.get() != null) {
				tl.get().close();
			}
		} catch(Exception e) {
			e.printStackTrace();
		}
	}
}
