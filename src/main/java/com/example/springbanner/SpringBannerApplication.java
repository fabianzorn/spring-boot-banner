package com.example.springbanner;

import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;

@SpringBootApplication
public class SpringBannerApplication {

  public static void main(String[] args) {

    new SpringApplicationBuilder(SpringBannerApplication.class)
            //.bannerMode(Banner.Mode.OFF)
            //.logStartupInfo(false)
            .run(args);
  }

}
