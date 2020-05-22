package com.sun.service.gzzz;


import com.sun.pojo.gzzz.Gzzz;

import java.sql.Date;
import java.util.List;
import java.util.Map;

/**
 * 获取持仓证券当天的行情数据
 */
public interface GzzzService {

    List<Gzzz> getGzzz(Date date);
    List<Map<String,Object>> getGzzz2();

}
