package com.example.apigateway.configuration;

import org.springframework.cloud.gateway.route.RouteLocator;
import org.springframework.cloud.gateway.route.builder.RouteLocatorBuilder;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class GatewayConfiguration {

    @Bean
    public RouteLocator customRouteLocator(RouteLocatorBuilder builder) {
        return builder.routes()
                .route("intuit_service", r -> r.path("/intuit/**")
                        .uri("http://localhost:8080")) // Assuming our intuit exchange service runs on localhost:8080
                .route("intuit_service", r -> r.path("/intuit/user/**")
                        .uri("http://localhost:8081"))
                .route("intuit_service", r -> r.path("/intuit/post/**")
                        .uri("http://localhost:8082"))
                .build();
    }
    
}

//before exchngae the music music should be exchanged
//delete only create by user
//exchange service add auth
//exchange request deny move to history table
// add enum exchanged
//permanent exchange 
//increase bonus in case of exchange
//add rating in post
//add image and video url in instrument
//mention this point in a user can login into two devices at a same time
//upload image of a user
//kartikey to study jwt
//docker compose up
//to discuss whether rating and reward should be same or differemt microservice 
//notification service
// testing report
