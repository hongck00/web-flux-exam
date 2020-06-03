package com.example.webflux.demo

import com.example.webflux.demo.handler.HelloHandler
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.context.annotation.Bean
import org.springframework.web.reactive.config.EnableWebFlux

@SpringBootApplication
@EnableWebFlux
class Application {
    /**
     * 참고 사이트
     * https://m.blog.naver.com/PostView.nhn?blogId=dg110&logNo=221347127351&proxyReferer=https:%2F%2Fwww.google.com%2F
     */
    @Bean
    fun helloHandler(): HelloHandler {
        return HelloHandler()
    }
}

fun main(args: Array<String>) {
    runApplication<Application>(*args)
}