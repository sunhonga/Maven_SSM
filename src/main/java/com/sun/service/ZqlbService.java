package com.sun.service;

import com.sun.pojo.Zqlb;
import org.springframework.stereotype.Component;

import java.util.List;


/**
 * 2019-1-12
 * 创建人 SunHong
 */
public interface ZqlbService {
	List<Zqlb> selectZqlbById(Integer id);
}
