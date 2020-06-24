package com.sun.service.makedata;


import java.util.Date;

public interface MakeDataProcessor {

    /**
     * 获取落地表的交易数据
     * @param fsetcode
     * @param date
     * @param <T>
     * @return
     */
    public <T> T getOrginalData(String fsetcode, Date date);


    public void doMake(String fsetcode, Date date);
}
