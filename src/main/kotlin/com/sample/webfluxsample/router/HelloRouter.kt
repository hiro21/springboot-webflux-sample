package com.sample.webfluxsample.router

import com.sample.webfluxsample.handler.HelloHandler
import org.springframework.context.annotation.Bean
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse

@Configuration(proxyBeanMethods = false)
class HelloRouter(val handler: HelloHandler) {
    @Bean
    fun route(): RouterFunction<ServerResponse> {
        return RouterFunctions
            .route(GET("/hello"), handler::hello)
    }
}