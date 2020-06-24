package com.sun.service.makedata.shanghai;

/**
 * @ClassName SHGHUtils
 * @Description TODO
 * Author sunhong
 * Date 2020-6-20 13:23
 **/
public class SHGHUtils {


    public static String getZqlb(String zqdm){
        if (zqdm.startsWith("60")) {
            return "shangHaiMakeDataStrategyBond";
        }else if (zqdm.startsWith("001")){
            return "shangHaiMakeDataStrategyStock";
        }
        return null;
    }
}
