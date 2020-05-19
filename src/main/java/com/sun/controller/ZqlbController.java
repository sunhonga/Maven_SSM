package com.sun.controller;

import com.sun.pojo.Zqlb;
import com.sun.service.ZqlbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.ApplicationContext;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.ArrayList;
import java.util.List;


/**
 * 2019-1-12
 * 创建人 SunHong
 */
@Controller
@RequestMapping()
public class ZqlbController {

	@Autowired
	ZqlbService zqlbService;


	@Autowired
	ApplicationContext applicationContext;

	@ResponseBody
	@RequestMapping("selectZqlbById.do")
	public List<Zqlb> selectZqlbById(String id){
		List<Zqlb> zqlbs = new ArrayList<>();

		zqlbs = zqlbService.selectZqlbById(Integer.valueOf(id));

		return zqlbs;
	}


}
