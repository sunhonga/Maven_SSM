package com.sun.controller.translation;

import com.sun.pojo.translation.Account;
import com.sun.service.gzzz.GzzzService;
import com.sun.service.translation.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.List;

/**
 * @ClassName ExchangeController
 * @Description TODO
 * Author sunhong
 * Date 2020-4-5 14:48
 **/

@Controller
@RequestMapping()
public class ExchangeController {

    @Autowired
    AccountService accountService;

    @Autowired
    GzzzService gzzzService;


    @ResponseBody
    @RequestMapping("tx_test.do")
    public List<Account> transfer() {
       gzzzService.getGzzz(new Date(1));
       return  accountService.transfer();
    }

}
