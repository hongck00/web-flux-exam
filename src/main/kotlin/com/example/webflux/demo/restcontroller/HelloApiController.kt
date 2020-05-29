package com.example.webflux.demo.restcontroller

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/hello")
class HelloApiController {

    @GetMapping("")
    fun hello(): String {
        return "hello kt"
    }
}