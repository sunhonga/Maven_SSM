package com.sun.service.makedata.shanghai;

/**
 * @ClassName SHGHVo
 * @Description TODO
 * Author sunhong
 * Date 2020-6-20 12:53
 **/
public class SHGHVo {

    private String zqdm;
    private double yhs;
    private double zqje;

    public String getZqdm() {
        return zqdm;
    }

    public void setZqdm(String zqdm) {
        this.zqdm = zqdm;
    }

    public double getYhs() {
        return yhs;
    }

    public void setYhs(double yhs) {
        this.yhs = yhs;
    }

    public double getZqje() {
        return zqje;
    }

    public void setZqje(double zqje) {
        this.zqje = zqje;
    }

    public SHGHVo(String zqdm, double yhs, double zqje) {
        this.zqdm = zqdm;
        this.yhs = yhs;
        this.zqje = zqje;
    }
}
