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

    @Autowired
    CouponsService couponsService;


    @Transactional
    @Override
    public List<Account> transfer()  {
        accountMapper.add(new Account("张三", 1000));


        //FileInputStream fileInputStream = new FileInputStream("路径不存在");
/*        if (1<2) {
            throw new RuntimeException("test");
        }*/
        accountMapper.sub(new Account("李四", 1000));

        return accountMapper.getAccount();

    }

    /**
     * 自调用事务失效
     * 默认只有在外部调用事务才会生效
     * 调用自身的方法不会走代理类
     * @return
     */
    @Transactional      //无论是否注释这一行transfer()方法的事务都是失效的.
    @Override
    public List<Account> transfer0() {
        transfer();
        if (1<2) {
            throw new RuntimeException();
        }
        return null;
    }


    /**
     * 常见方式:会共用transfer1开启的一个事务
     * @return
     */
    @Transactional
    @Override
    public List<Account> transfer1() {
        accountMapper.add(new Account("张三", 1000));     //  给张三加钱
        couponsService.add("张三",100);                    //  给张三加积分
        return null;
    }


    /**
     * 嵌套事务:couponsService.sub 传播行为用的嵌套事务,
     * 调用couponsService.sub的时候,transfer2所在的事务就会挂起,couponsService.sub会起一个新的子事务并设置savepoint.
     * 如果couponsService.sub已经提交，那么transfer2失败回滚,couponsService.sub也将回滚.
     * 如果couponsService.sub失败回滚,如果他抛出的异常被transfer2的try..catch捕获并处理,transfer2事务仍然可能提交;如果他抛出的异常未被transfer2捕获处理,transfer2事务将回滚。
     * @return
     */
    @Transactional
    @Override
    public List<Account> transfer2() {

        accountMapper.sub(new Account("李四", 1000)); //减钱
        try{
            couponsService.sub("李四",100);       // 减积分
        }catch (Exception e){
            e.printStackTrace();
        }

        return null;
    }
}
