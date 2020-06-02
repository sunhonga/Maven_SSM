package com.sun.controller;

import com.sun.mapper.GuPiaoInfoMapper;
import com.sun.pojo.GuPiaoInfo;
import com.sun.pojo.Zqlb;
import com.sun.service.ZqlbService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.servlet.ModelAndView;

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

    private GuPiaoInfoMapper guPiaoInfoMapper;

    @Autowired
    public GuPiaoController(GuPiaoInfoMapper guPiaoInfoMapper) {
        this.guPiaoInfoMapper = guPiaoInfoMapper;
    }

    @ResponseBody
    @RequestMapping("guPiao.do")
    public ModelAndView selectZqlbById(){
        List<GuPiaoInfo> guPiaoInfoList=guPiaoInfoMapper.getGuPiaoInfo("","",0);
        ModelAndView mav = new ModelAndView();
        mav.addObject("msg","欢迎来到股票页面");
        mav.addObject("guPiaoInfoList",guPiaoInfoList);
        mav.setViewName("guPiao");
        return mav;
    }
}
