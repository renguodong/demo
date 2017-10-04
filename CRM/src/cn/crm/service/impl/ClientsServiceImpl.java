package cn.crm.service.impl;

import java.util.HashMap;
import java.util.Map;

import cn.crm.dao.impl.ClientsDAOImpl;
import cn.crm.factory.DAOFactory;
import cn.crm.service.IClientsService;
import cn.crm.vo.Clients;

public class ClientsServiceImpl implements IClientsService{

	@Override
	public boolean add(Clients vo) throws Exception {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public Map<String, Object> list() throws Exception {
		Map<String, Object> map = new HashMap<>();
		map.put("allCilents", DAOFactory.getInstance(ClientsDAOImpl.class).getAll());
		map.put("allCount", DAOFactory.getInstance(ClientsDAOImpl.class).getCount());
		return map;
	}


}
