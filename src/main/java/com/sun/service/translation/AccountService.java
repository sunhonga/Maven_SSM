package com.sun.service.translation;

import com.sun.pojo.translation.Account;
import org.springframework.stereotype.Component;
import org.springframework.stereotype.Repository;

import javax.persistence.criteria.CriteriaBuilder;
import java.io.FileNotFoundException;
import java.util.List;

/**
 * @ClassName AccountService
 * @Description TODO
 * Author sunhong
 * Date 2020-4-5 15:04
 **/
@Repository
public interface AccountService {

    List<Account> transfer() ;
    List<Account> transfer0() ;
    List<Account> transfer1() ;
    List<Account> transfer2() ;



}
