package com.sun.service.gzzz;

import com.sun.mapper.gzzz.GzzzMapper;
import com.sun.pojo.gzzz.Gzzz;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.sql.Date;
import java.util.List;

/**
 * @ClassName GzzzServiceImpl
 * @Description TODO
 * Author sunhong
 * Date 2020-5-22 9:08
 **/
@Service
public class GzzzServiceImpl implements GzzzService {

    @Autowired
    GzzzMapper gzzzMapper;


    @Override
    public List<Gzzz> getGzzz(Date date) {
        return gzzzMapper.getGzzz(date);
    }
}
