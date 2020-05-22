package com.sun.service.gzzz;


import com.sun.pojo.gzzz.Gzzz;

import java.sql.Date;
import java.util.List;

/**
 * 获取持仓证券当天的行情数据
 */
public interface GzzzService {

    List<Gzzz> getGzzz(Date date);

}
