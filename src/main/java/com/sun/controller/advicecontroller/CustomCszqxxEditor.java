package com.sun.controller.advicecontroller;

import com.sun.pojo.Cszqxx;

import java.beans.PropertyEditorSupport;

/**
 * @ClassName CustomCszqxxEditor
 * @Description TODO
 * Author sunhong
 * Date 2020-7-7 13:24
 **/
public class CustomCszqxxEditor extends PropertyEditorSupport {

    @Override
    public void setAsText(String text) throws IllegalArgumentException {

        if (text.indexOf(",")>0) {
            Cszqxx cszqxx = new Cszqxx();
            String[] arr = text.split(",");
            cszqxx.setFzqdm(arr[0]);
            cszqxx.setFscdm(arr[1]);
            setValue(cszqxx);
        }else {
            throw new IllegalArgumentException("cszqxx param is error");
        }

    }


}
