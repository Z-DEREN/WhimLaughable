package com.zdr.whim_laughable;

import org.apache.logging.log4j.LogManager;
import org.apache.logging.log4j.Logger;
import org.springframework.boot.Banner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;
import org.springframework.context.annotation.PropertySource;
import org.springframework.scheduling.annotation.EnableScheduling;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

@RestController
@SpringBootApplication
@EnableScheduling

@PropertySource(value = {
        "file:F://rdzgsq//Database//ALi120//application.properties" }, ignoreResourceNotFound = false, encoding = "UTF-8", name = "application.properties")
public class WhimLaughableApplication extends SpringBootServletInitializer implements WebMvcConfigurer {

    private static final Logger logger = LogManager.getLogger(WhimLaughableApplication.class.getName());


    public static void main(String[] args) {
        SpringApplication springApplication = new SpringApplication(WhimLaughableApplication.class);
        springApplication.setBannerMode(Banner.Mode.OFF);
        springApplication.run(args);
        logger.info("项目启动成功------------------------------"); // info级别的信息
        logger.info("浏览器输入: http://127.0.0.1:8088/whim_laughable/home 进入主页");
    }

    /**
     * 打包用
     */
    protected SpringApplicationBuilder configure(SpringApplicationBuilder application) {
        return application.sources(WhimLaughableApplication.class);
    }

}
