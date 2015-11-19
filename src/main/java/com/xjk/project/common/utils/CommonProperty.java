package com.xjk.project.common.utils;

import com.xjk.project.common.constant.FileConstant;
import org.springframework.core.io.support.PropertiesLoaderUtils;

import java.io.IOException;
import java.util.Properties;

/**
 * @Verfion:
 * @author: jinkai.xu
 * @Date: 15/11/19 下午2:27
 */
public class CommonProperty {


    private static CommonProperty instance;


    private Properties adminTemplate;

    private Properties indexTemplate;


    public static CommonProperty getIntance(){

        if( instance == null  ) instance = new CommonProperty();

        return instance;
    }


    public CommonProperty() {

        try {

            adminTemplate = PropertiesLoaderUtils.loadAllProperties(FileConstant.ADMIN_FILE_PATH);

            indexTemplate = PropertiesLoaderUtils.loadAllProperties(FileConstant.INDEX_FILE_PATH);

        } catch (IOException e) {

            e.printStackTrace();
        }

    }


    public Properties getAdminTemplate() {
        return adminTemplate;
    }


    public Properties getIndexTemplate() {
        return indexTemplate;
    }




}
