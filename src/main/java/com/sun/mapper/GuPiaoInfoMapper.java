package com.sun.mapper;

import com.sun.pojo.GuPiaoInfo;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface GuPiaoInfoMapper {


    List<GuPiaoInfo> getGuPiaoInfo(@Param("gpdm") String gpdm,@Param("mxbk") String mxbk,@Param("startLine") int startLine);

}
