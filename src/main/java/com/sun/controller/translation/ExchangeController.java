package com.sun.controller.translation;

import com.sun.pojo.gzzz.Gzzz;
import com.sun.pojo.translation.Account;
import com.sun.service.gzzz.GzzzService;
import com.sun.service.translation.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.sql.Date;
import java.util.List;
import java.util.Map;

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
       List<Gzzz> gzzzList = gzzzService.getGzzz(new Date(1));
        for (Gzzz gzzz : gzzzList) {
            System.out.println(gzzz);
        }
       List<Map<String,Object>> gzzzList2 = gzzzService.getGzzz2();
        for (Map<String, Object> stringObjectMap : gzzzList2) {
            for (Map.Entry<String, Object> entry : stringObjectMap.entrySet()) {
                System.out.println(entry.getKey()+entry.getValue());
            }
        }
        return  accountService.transfer2();
    }

}
