package com.sun.configuration;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

/**
 * @ClassName MyImportSelector
 * @Description TODO
 * Author sunhong
 * Date 2020-6-24 13:45
 **/
public class MyImportSelector implements ImportSelector {
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.sun.service.makedata.yinhangjian.YinHangJianConfig"};
    }
}
