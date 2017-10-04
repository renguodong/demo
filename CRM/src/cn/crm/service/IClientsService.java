package cn.crm.service;

import java.util.Map;

import cn.crm.vo.Clients;

public interface IClientsService {
	public boolean add(Clients vo) throws Exception;
	public Map<String, Object> list() throws Exception;
}
