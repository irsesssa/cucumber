package com.cucumber;


import java.io.FileInputStream;
import java.util.Properties;

public class PropertyReader {

    public static String getUrl(String parameter) throws Exception {
        Properties properties = new Properties();
//        InputStream fileInputStream =
//                steps.PropertyReader.class.getResourceAsStream("resources"+ File.separator +"config.properties");
        FileInputStream fileInputStream=new FileInputStream("C:\\Users\\iraci\\IdeaProjects\\cucumbertest\\src\\test\\config.properties");
        properties.load(fileInputStream);
        return properties.getProperty(parameter);
    }
}
