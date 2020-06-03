package com.example.webflux.demo

import com.example.webflux.demo.handler.HelloHandler
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.reactive.config.EnableWebFlux
import org.springframework.web.reactive.function.server.*

@SpringBootApplication
@EnableWebFlux
class Application {

    @Bean
    fun helloHandler(): HelloHandler {
        return HelloHandler()
    }

    @Bean
    fun helloRouterFunction(helloHandler: HelloHandler): RouterFunction<ServerResponse> {
        return RouterFunctions.route(RequestPredicates.path("/"), helloHandler::handleRequest)
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}