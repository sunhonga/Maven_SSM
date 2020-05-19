package com.sun.service;

import com.sun.mapper.ZqlbMapper;
import com.sun.pojo.Zqlb;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
/**
 * 2019-1-12
 * 创建人 SunHong
 */
@Service
public class ZqlbServiceImpl implements ZqlbService {

	@Autowired
	ZqlbMapper zqlbMapper;

	@Override
	public List<Zqlb> selectZqlbById(Integer id) {
//		List<Zqlb> list = new ArrayList<>();
//		Zqlb zqlb = new Zqlb();
//		zqlb.setId(21);
//		list.add(zqlb);
		return zqlbMapper.selectZqlbById(id);
	}
}
