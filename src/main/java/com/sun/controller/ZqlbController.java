package com.sun.controller;

import com.sun.pojo.Zqlb;
import com.sun.service.ZqlbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;
import java.util.List;


/**
 * 2019-1-12
 * 创建人 SunHong
 */
@Controller
@RequestMapping()
public class ZqlbController {

	private ZqlbService zqlbService;

	@Autowired
	public ZqlbController(ZqlbService zqlbService) {
		this.zqlbService = zqlbService;
	}

	@ResponseBody
	@RequestMapping("selectZqlbById.do")
	public List<Zqlb> selectZqlbById(@RequestParam(value = "id") String id){
		List<Zqlb> zqlbs;

		zqlbs = zqlbService.selectZqlbById(Integer.valueOf(id));
		return zqlbs;
	}


}
