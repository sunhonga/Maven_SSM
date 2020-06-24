package com.sun.service.makedata.shanghai;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;

/**
 * @ClassName CustomTypeFilter
 * @Description TODO
 * Author sunhong
 * Date 2020-6-22 13:50
 **/
public class CustomTypeFilter implements TypeFilter {

    public static final String TYPE_NAME = "com.sun.service.makedata.shanghai.ZqlbShanghai";

    @Override
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {

        // 获取当前扫描到的类的注解元数据
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        // 获取当前扫描到的类的元数据
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        // 获取当前扫描到的类的资源信息
        Resource resource = metadataReader.getResource();

        if (annotationMetadata.isAnnotated(TYPE_NAME)) {
            return true;
        }
        return false;
    }
}
