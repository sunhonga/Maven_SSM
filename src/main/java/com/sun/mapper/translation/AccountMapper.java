package com.sun.mapper.translation;


import com.sun.pojo.translation.Account;
import org.springframework.stereotype.Component;

import java.util.List;

public interface AccountMapper {

    List<Account> getAccount();

    void add(Account account);

    void sub(Account account);
}
