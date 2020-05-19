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
 * @ClassName GuPiaoController
 * @Description TODO
 * Author sunhong
 * Date 2020-3-31 16:15
 **/
@Controller
@RequestMapping()
public class GuPiaoController {


    @Autowired
    ZqlbService zqlbService;

    @ResponseBody
    @RequestMapping("guPiaoController.do")
    public List<Zqlb> selectZqlbById(String id){
        List<Zqlb> zqlbs = new ArrayList<>();

        zqlbs = zqlbService.selectZqlbById(Integer.valueOf(id));

        return zqlbs;
    }
}
