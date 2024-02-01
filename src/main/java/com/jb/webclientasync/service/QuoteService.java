package com.jb.webclientasync.service;

import org.springframework.stereotype.Service;
import org.springframework.web.reactive.function.client.WebClient;
import reactor.core.publisher.Mono;

@Service
public class QuoteService {

    private static final String END_POINT = "https://type.fit/api/quotes";

    public void getQuoteV2(){
        System.out.println("REST V2 Api call started.");
        WebClient webClient = WebClient.create();
        webClient.get()
                .uri(END_POINT)
                .retrieve()
                .bodyToMono(String.class)
                .subscribe(QuoteService::handleResponse);
       // System.out.println(client.block());
        System.out.println("REST V2 Api call got completed.");

    }

    public static void handleResponse(String s){
        System.out.println(s);
    }
    public void getQuoteV1(){
        System.out.println("REST V1 Api call started.");
        WebClient webClient = WebClient.create();
        Mono<String> client =  webClient.get()
                .uri(END_POINT)
                .retrieve()
                .bodyToMono(String.class);
    System.out.println(client.block());
    System.out.println("REST V1 Api call got completed.");

    }
}
