package com.sun.pojo.translation;

/**
 * @ClassName Coupons
 * @Description TODO
 * Author sunhong
 * Date 2020-7-12 16:27
 **/
public class Coupons {

    private String name;
    private int coupons;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getCoupons() {
        return coupons;
    }

    public void setCoupons(int coupons) {
        this.coupons = coupons;
    }

    public Coupons(String name, int coupons) {
        this.name = name;
        this.coupons = coupons;
    }

    @Override
    public String toString() {
        return "Coupons{" +
                "name='" + name + '\'' +
                ", coupons=" + coupons +
                '}';
    }
}
