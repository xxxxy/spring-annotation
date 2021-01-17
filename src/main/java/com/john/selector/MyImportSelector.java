package com.john.selector;

import org.springframework.context.annotation.ImportSelector;
import org.springframework.core.type.AnnotationMetadata;

public class MyImportSelector implements ImportSelector {
    /**
     * @param importingClassMetadata 当前类的注解信息
     * @return 组件的全类名数组
     */
    @Override
    public String[] selectImports(AnnotationMetadata importingClassMetadata) {
        return new String[]{"com.john.beans.Child", "com.john.beans.Older"};
    }
}
