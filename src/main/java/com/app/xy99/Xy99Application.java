package com.app.xy99;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
@MapperScan("com.app.xy99.mapper")
@SpringBootApplication
public class Xy99Application {

    public static void main(String[] args) {
        SpringApplication.run(Xy99Application.class, args);
    }

}
