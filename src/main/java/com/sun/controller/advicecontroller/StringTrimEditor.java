package com.sun.controller.advicecontroller;

import java.beans.PropertyEditorSupport;

/**
 * @ClassName StringTrimEditor
 * @Description TODO
 * Author sunhong
 * Date 2020-7-7 15:35
 **/
public class StringTrimEditor extends PropertyEditorSupport {

    /**
     * 对输入参数进行trim操作
     * @param text
     * @throws IllegalArgumentException
     */
    @Override
    public void setAsText(String text) throws IllegalArgumentException{
        text = text == null ? text :text.trim();
        setValue(text);
    }

}
