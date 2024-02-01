package com.jb.webclientasync;

import com.jb.webclientasync.service.QuoteService;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

@SpringBootApplication
public class WebClientAsyncApplication {

    public static void main(String[] args) {

        ConfigurableApplicationContext run = SpringApplication.run(WebClientAsyncApplication.class, args);
        QuoteService bean = run.getBean(QuoteService.class);
        bean.getQuoteV2();
    }

}
