package com.jb.webclientasync.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class QuoteService {

    private static final String END_POINT = "https://type.fit/api/quotes";

    public void getQuote(){
        WebClient webClient = WebClient.create();
        Mono<String> client =  webClient.get()
                .uri(END_POINT)
                .retrieve()
                .bodyToMono(String.class);
    System.out.println(client.block());
        System.out.println("REST Api call got completed.");

    }
}
