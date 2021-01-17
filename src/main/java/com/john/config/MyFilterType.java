package com.john.config;

import org.springframework.core.io.Resource;
import org.springframework.core.type.AnnotationMetadata;
import org.springframework.core.type.ClassMetadata;
import org.springframework.core.type.classreading.MetadataReader;
import org.springframework.core.type.classreading.MetadataReaderFactory;
import org.springframework.core.type.filter.TypeFilter;

import java.io.IOException;
import java.util.Set;

public class MyFilterType implements TypeFilter {
    /**
     * @param metadataReader        读取到当前正在扫描的类的信息
     * @param metadataReaderFactory 可以获取到其他任何类的信息
     * @return true 匹配成功， false 匹配失败
     * @throws IOException
     */
    public boolean match(MetadataReader metadataReader, MetadataReaderFactory metadataReaderFactory) throws IOException {
        //获取到当前类注解的信息
        AnnotationMetadata annotationMetadata = metadataReader.getAnnotationMetadata();
        //获取到当前正在扫描类的信息
        ClassMetadata classMetadata = metadataReader.getClassMetadata();
        //获取到当前类资源（类的路径）
        Resource resource = metadataReader.getResource();
        return classMetadata.getClassName().contains("dao");
    }
}
