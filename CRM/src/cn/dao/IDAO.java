package cn.dao;

import java.util.List;
import java.util.Set;

public interface IDAO<T, V> {
	/**
	 * 数据库的增加操作
	 * @param vo 要增加的vo类对象；
	 * @return	增加成功返回true,否则返回false；
	 * @throws Exception SQL异常
	 */
	public boolean doAdd(T vo) throws Exception;
	/**
	 * 数据库修改操作
	 * @param vo 要修改的vo类对象;
	 * @return	修改成功返回true，否则返回false;
	 * @throws Exception SQL异常
	 */
	public boolean doEdit(T vo) throws Exception;
	/**
	 * 数据库删除操作
	 * @param ids 要删除V类型的编号id数据保存在Set集合中
	 * @return	删除成功返回true,否则返回false;
	 * @throws Exception SQL异常
	 */
	public boolean doRemove(Set<V> ids) throws Exception;
	/**
	 * 根据V类型进行数据库查找
	 * @param id	要查找的V类型编号id；
	 * @return	查到数据成功返回T类对象,否则返回null;
	 * @throws Exception SQL异常
	 */
	public T byId(V id) throws Exception;
	/**
	 * 统计全部数据量
	 * @return	查到数据成功返回数量,否则返回null;
	 * @throws Exception SQL异常
	 */
	public Long getCount() throws Exception;
	/**
	 * 查询全部数据
	 * @return	查到数据成功，T类对象保存在List集合中返回,否则返回null;
	 * @throws Exception SQL异常
	 */
	public List<T> getAll() throws Exception;
	/**
	 * 统计模糊查询数据量
	 * @param column 模糊查询的列
	 * @param keyWord 模糊查询的关键字
	 * @return	查到数据成功返回数量,否则返回null;
	 * @throws Exception SQL异常
	 */
	public Long getCount(String column, String keyWord) throws Exception;
	/**
	 * 查询全部模糊数据
	 * @param currentPage 当前页
	 * @param lineSize	每页行数
	 * @param column 模糊查询的列
	 * @param keyWord 模糊查询的关键字
	 * @return 查到数据成功，T类对象保存在List集合中返回,否则返回null;
	 * @throws Exception SQL异常
	 */
	public List<T> getAll(Integer currentPage, Integer lineSize, String column, String keyWord) throws Exception;
}
