package com.qf.springboot_booksystem;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages = "com.qf")
@MapperScan("com.qf.dao")
public class SpringbootBooksystemApplication {

    public static void main(String[] args) {
        SpringApplication.run(SpringbootBooksystemApplication.class, args);
    }

}
