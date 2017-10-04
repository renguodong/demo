package cn.crm.util;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.util.Iterator;
import java.util.Set;

import cn.rgd.db.DBConnection;

public abstract class DAOSupport {
	protected Connection conn = DBConnection.getConn();
	protected PreparedStatement ps;
	protected String removeBatch(Set<Integer> ids, String tableName, String column) throws Exception {
		StringBuffer sb = new StringBuffer();
		sb.append(" DELETE FROM ").append(tableName).append(" WHERE ").append(column).append(" IN (");
		Iterator<Integer> ite = ids.iterator();
		while(ite.hasNext()) {
			sb.append(ite.next()).append(",");
		}
		return sb.delete(sb.length()-2, sb.length()-1).append(")").toString();
	}
}
