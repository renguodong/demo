package cn.crm.dao.impl;

import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;

import cn.crm.dao.IClieantDAO;
import cn.crm.util.DAOSupport;
import cn.crm.vo.Clients;

public class ClientsDAOImpl extends DAOSupport implements IClieantDAO {

	@Override
	public boolean doAdd(Clients vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doEdit(Clients vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean doRemove(Set<Integer> ids) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Clients byId(Integer id) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public Long getCount() throws Exception {
		String sql = "SELECT COUNT(cid) FROM clients";
		super.ps = super.conn.prepareStatement(sql);
		ResultSet rs = super.ps.executeQuery();
		if(rs.next()) {
			return rs.getLong(1);
		}
		return null;
	}

	@Override
	public List<Clients> getAll() throws Exception {
		String sql = "SELECT cid, name, photo, sex, birthday, lasttime, explains FROM clients";
		super.ps = super.conn.prepareStatement(sql);
		ResultSet rs = super.ps.executeQuery();
		List<Clients> list = new ArrayList<>();
		while(rs.next()) {
			Clients vo = new Clients();
			vo.setCid(rs.getInt(1));
			vo.setName(rs.getString(2));
			vo.setPhoto(rs.getString(3));
			vo.setSex(rs.getString(4));
			vo.setBirthday(rs.getDate(5));
			vo.setLasttime(rs.getDate(6));
			vo.setExplains(rs.getString(7));
			list.add(vo);
		}
		return list;
	}

	@Override
	public Long getCount(String column, String keyWord) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public List<Clients> getAll(Integer currentPage, Integer lineSize, String column, String keyWord) throws Exception {
		// TODO Auto-generated method stub
		return null;
	}

}
