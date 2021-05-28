package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
/*
* @SpringBootApplication 标明这是一个springboot配置类--》configuration-->标明这是一个配置类
* @EnableAutoConfiguration: 开启自动配置功能
*       @AutoConfigurationPackage：自动配置包
*           @Import({Registrar.class})：把自动类所在的包进行默认扫描，该包下的所有类被扫描到spring容器中进行管理
*       @Import({AutoConfigurationImportSelector.class})
*           AutoConfigurationImportSelector 自动配置导入选择器
*           根据项目判断你的项目需要哪些信息，然后把默认的配置内容导入到spring容器中进行管理
* @ComponentScan  组件扫描和自动装配，用来制定扫描器的范围
* */
@SpringBootApplication/*标明这是一个springboot配置类--》configuration-->标明这是一个配置类*/
public class DemoApplication {

    public static void main(String[] args) {
        SpringApplication.run(DemoApplication.class, args);
    }

}
