package com.sun.controller;

import com.sun.mapper.CszqxxMapper;
import com.sun.pojo.Cszqxx;
import com.sun.pojo.Zqlb;
import com.sun.service.ZqlbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.*;

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

	@RequestMapping("selectZqlbById.do")
	@ResponseBody
	public List<Zqlb> selectZqlbById(@RequestParam(value = "id") String id){
		List<Zqlb> zqlbs;

		zqlbs = zqlbService.selectZqlbById(Integer.valueOf(id));
		return zqlbs;
	}


	//url路径:getCszqxx1.do/{1}
	@RequestMapping("zqlb1.do/{id}")
	@ResponseBody
	public List<Cszqxx> getCszqxx0(@PathVariable(value = "id") String id) {
		List<Cszqxx> cszqxxList = cszqxxMapper.selectByFzqdm(id);
		return cszqxxList;
	}

	@Autowired
	CszqxxMapper cszqxxMapper;

	//url路径：为/aagetCszqxx.do?fjjdm=0033&fzqmc=苏州09
	@RequestMapping("zqlb2.do")
	@ResponseBody
	public List<Cszqxx> getCszqxx(@RequestParam (value = "fjjdm") String fjjdm, @RequestParam (value ="fzqmc" ) String fzqmc){

		List<Cszqxx> cszqxxList = cszqxxMapper.selectByFjjdmAndFzqmc(fjjdm,fzqmc);

		return cszqxxList;
	}

	//请求参数未json字符串
	@RequestMapping("jsonzqlb.do")
	@ResponseBody
	public List<Cszqxx> getCszqxx2(@RequestBody Cszqxx cszqxx){

		return (List<Cszqxx>) new Cszqxx();
	}


}
