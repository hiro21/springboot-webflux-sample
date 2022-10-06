package com.sample.webfluxsample.handler

import org.springframework.http.MediaType
import org.springframework.stereotype.Component
import org.springframework.web.reactive.function.BodyInserters
import org.springframework.web.reactive.function.server.ServerRequest
import org.springframework.web.reactive.function.server.ServerResponse
import reactor.core.publisher.Mono

@Component
class HogeHandler {
    fun hoge(request: ServerRequest): Mono<ServerResponse> {
        return ServerResponse.ok()
            .contentType(MediaType.APPLICATION_JSON)
            .body(BodyInserters.fromValue("hoge"))
    }
}