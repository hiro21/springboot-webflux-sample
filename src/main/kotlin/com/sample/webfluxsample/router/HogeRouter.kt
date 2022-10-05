package com.sample.webfluxsample.router

import com.sample.webfluxsample.handler.HogeHandler
import org.springframework.context.annotation.Configuration
import org.springframework.web.reactive.function.server.RequestPredicates.GET
import org.springframework.web.reactive.function.server.RouterFunction
import org.springframework.web.reactive.function.server.RouterFunctions
import org.springframework.web.reactive.function.server.ServerResponse

@Configuration
class HogeRouter(val handler: HogeHandler) {
    fun route(): RouterFunction<ServerResponse> {
        return RouterFunctions
            .route(GET("/hoge"), handler::hoge)
    }
}