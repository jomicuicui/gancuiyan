package com.example.springbootdemo;

import com.spring4all.swagger.EnableSwagger2Doc;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import springfox.documentation.swagger2.annotations.EnableSwagger2;

@RestController
@EnableSwagger2Doc
@SpringBootApplication
//@ComponentScan(basePackages = "com.example.springbootdemo")
public class SpringbootdemoApplication {


    @Autowired
    private AuthorSetting authorSetting;

    @RequestMapping("/")
    String index(){
        return "author name is： " + authorSetting.getName();
    }

    public static void main(String[] args) {
        SpringApplication.run(SpringbootdemoApplication.class, args);
    }

}
