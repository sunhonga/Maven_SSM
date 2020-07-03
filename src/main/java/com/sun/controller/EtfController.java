package com.sun.controller;

import com.sun.pojo.Zqlb;
import com.sun.service.ZqlbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.util.ArrayList;
import java.util.List;

/**
 * @ClassName EtfController
 * @Description TODO
 * Author sunhong
 * Date 2020-3-31 16:16
 **/
@Controller
@RequestMapping("/etf")
public class EtfController {


    @Autowired
    ZqlbService zqlbService;

    @ResponseBody
    @RequestMapping("etfController.do")
    public List<Zqlb> selectZqlbById(String id){
        List<Zqlb> zqlbs = new ArrayList<>();

        zqlbs = zqlbService.selectZqlbById(Integer.valueOf(id));

        return zqlbs;
    }
}
