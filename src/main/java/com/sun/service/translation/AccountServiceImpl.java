package com.sun.service.translation;

import com.sun.mapper.translation.AccountMapper;
import com.sun.pojo.translation.Account;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * @ClassName AccountServiceImpl
 * @Description TODO
 * Author sunhong
 * Date 2020-4-5 15:04
 **/
@Service
public class AccountServiceImpl implements AccountService {


    @Autowired
    AccountMapper accountMapper;

    @Transactional()
    @Override
    public List<Account> transfer()  {
        accountMapper.add(new Account("张三", 1000));


        //FileInputStream fileInputStream = new FileInputStream("路径不存在");
        if (1<2) {
            throw new RuntimeException("test");
        }
        accountMapper.sub(new Account("李四", 1000));

        return accountMapper.getAccount();

    }
}
