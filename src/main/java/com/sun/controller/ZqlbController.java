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


	//===========================分割线一下用于SpringMVC=========================
	//@PathVariable,@RequestParam,@RequestBody注解练习
	@Autowired
	CszqxxMapper cszqxxMapper;


	//url路径:zqlb1.do/{1}
	@RequestMapping("zqlb1.do/{id}")
	@ResponseBody
	public List<Cszqxx> getCszqxx0(@PathVariable(value = "id") String id) {
		System.out.println(id);
		id = "BJ186A";
		List<Cszqxx> cszqxxList = cszqxxMapper.selectByFzqdm(id);
		return cszqxxList;
	}


	//url路径：为/zqlb2.do?fjjdm=0033&fzqmc=苏州09
	@RequestMapping("zqlb2.do")
	@ResponseBody
	public List<Cszqxx> getCszqxx(@RequestParam (value = "fjjdm") String fjjdm, @RequestParam (value ="fzqmc" ) String fzqmc){
		System.out.println(fjjdm+fzqmc);
		List<Cszqxx> cszqxxList = cszqxxMapper.selectByFjjdmAndFzqmc(fjjdm,fzqmc);
		return cszqxxList;
	}

	//请求参数未json字符串
	@RequestMapping("jsonzqlb.do")
	@ResponseBody
	public List<Cszqxx> getCszqxx2(@RequestBody Cszqxx cszqxx){
		System.out.println(cszqxx);
		List<Cszqxx> cszqxxList = cszqxxMapper.selectByFjjdmAndFzqmc(cszqxx.getFjjdm(),cszqxx.getFzqmc());
		return cszqxxList;
	}



	//http://localhost:8080/Maven_SSM/zqlb3.do?fjjdm=  1122&cszqxx=国债,3311
	@RequestMapping("zqlb3.do")
	@ResponseBody
	public List<Cszqxx> getCszqxx3(@RequestParam (value = "fjjdm") String fjjdm, @RequestParam (value ="cszqxx" ) Cszqxx cszqxx){
		System.out.println(fjjdm+cszqxx);
		List<Cszqxx> cszqxxList = cszqxxMapper.selectByFjjdmAndFzqmc(fjjdm,"");
		return cszqxxList;
	}
}
