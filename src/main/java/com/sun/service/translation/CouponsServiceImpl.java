package com.sun.service.translation;

import com.sun.mapper.translation.CouponsMapper;
import com.sun.pojo.translation.Coupons;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

/**
 * @ClassName CouponsServiceImpl
 * @Description TODO
 * Author sunhong
 * Date 2020-7-12 16:23
 **/
@Service
public class CouponsServiceImpl implements CouponsService {

    @Autowired
    CouponsMapper couponsMapper;


    @Transactional
    @Override
    public void add(String name,int jifen) {
        couponsMapper.add(new Coupons(name,jifen));
    }
}
