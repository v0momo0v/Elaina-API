package com.example.elainaapi;

import org.apache.dubbo.config.spring.context.annotation.EnableDubbo;
import org.mybatis.spring.annotation.MapperScan;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.core.env.Environment;

@SpringBootApplication
@MapperScan("com.example.elainaapi.mapper")
@EnableDubbo
public class ElainaApiApplication {
    public static void main(String[] args) {
        SpringApplication.run(ElainaApiApplication.class, args);
        System.out.println("项目启动");
    }

}
