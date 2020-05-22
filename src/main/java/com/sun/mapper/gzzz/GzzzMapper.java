package com.sun.mapper.gzzz;

import com.sun.pojo.gzzz.Gzzz;
import org.apache.ibatis.annotations.Param;

import java.sql.Date;
import java.util.List;
import java.util.Map;

/**
 * @ClassName GzzzMapper
 * @Description TODO
 * Author sunhong
 * Date 2020-5-3 8:34
 **/
public interface GzzzMapper {

    List<Gzzz> getGzzz(@Param("date") Date date);
    List<Map<String,Object>> getGzzz2();


}
