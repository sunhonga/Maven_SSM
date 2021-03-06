package com.sun.mapper;

import com.sun.pojo.Cszqxx;
import org.apache.ibatis.annotations.Param;

import java.util.List;

/**
 * @ClassName CszqxxMapper
 * @Description TODO
 * Author sunhong
 * Date 2020-5-2 15:30
 **/
public interface CszqxxMapper {
    int insert(Cszqxx record);

    int insertSelective(Cszqxx record);


    /**
     * 查询证券：通过基金代码和证券名称
     * @param fjjdm
     * @param fzqmc
     * @return
     */
    List<Cszqxx> selectByFjjdmAndFzqmc(@Param("fjjdm") String fjjdm,@Param("fzqmc") String fzqmc);


    List<Cszqxx> selectByFzqdm(@Param("fzqdm") String fzqdm);
}