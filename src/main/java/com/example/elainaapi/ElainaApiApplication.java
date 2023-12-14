package com.example.elainaapi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan("com.example.elainaapi.mapper")
public class ElainaApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(ElainaApiApplication.class, args);
        System.out.println("项目启动");
    }

}
