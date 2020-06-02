package com.sun.pojo;

/**
 * @ClassName GuPiaoInfo
 * @Description TODO
 * Author sunhong
 * Date 2020-5-24 17:01
 **/
public class GuPiaoInfo {

    private String gpdm;
    private String gpmc;
    private String mxbk;

    public String getGpdm() {
        return gpdm;
    }

    public void setGpdm(String gpdm) {
        this.gpdm = gpdm;
    }

    public String getGpmc() {
        return gpmc;
    }

    public void setGpmc(String gpmc) {
        this.gpmc = gpmc;
    }

    public String getMxbk() {
        return mxbk;
    }

    public void setMxbk(String mxbk) {
        this.mxbk = mxbk;
    }

    @Override
    public String toString() {
        return "GuPiaoInfo{" +
                "gpdm='" + gpdm + '\'' +
                ", gpmc='" + gpmc + '\'' +
                ", mxbk='" + mxbk + '\'' +
                '}';
    }
}
