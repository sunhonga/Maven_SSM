package com.sun.controller;

import com.sun.mapper.CszqxxMapper;
import com.sun.pojo.Cszqxx;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.List;

/**
 * @ClassName CszqxxController
 * @Description TODO
 * Author sunhong
 * Date 2020-5-2 15:32
 **/

@Controller
@RequestMapping()
public class CszqxxController {

    @Autowired
    CszqxxMapper cszqxxMapper;


    @RequestMapping("getCszqxx.do")
    @ResponseBody
    public List<Cszqxx> getCszqxx(@RequestParam (value = "fjjdm") String fjjdm,@RequestParam (value ="fzqmc" ) String fzqmc){

        List<Cszqxx> cszqxxList = cszqxxMapper.selectByFjjdmAndFzqmc(fjjdm,fzqmc);


        return cszqxxList;
    }

    @RequestMapping("getCszqxx1.do/{id}")
    @ResponseBody
    public List<Cszqxx> getCszqxx1(@PathVariable(value = "id") String id){
        List<Cszqxx> cszqxxList = cszqxxMapper.selectByFzqdm(id);
        return cszqxxList;
    }





}
