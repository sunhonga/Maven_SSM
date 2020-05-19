package com.sun.mapper;

import com.sun.pojo.Zqlb;

import java.util.List;

/**
 * 2019-1-13
 * 创建人 SunHong
 */
public interface ZqlbMapper {

	List<Zqlb> selectZqlbById(Integer id);

	void insertZqlb(Zqlb zqlb);
}
