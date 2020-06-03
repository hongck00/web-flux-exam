package com.example.webflux.demo.restcontroller

import com.example.webflux.demo.vo.Tweet
import lombok.extern.slf4j.Slf4j
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController
import java.util.*

@Slf4j
@RestController
@RequestMapping("/api/hello")
class HelloApiController {

    @GetMapping("")
    fun hello(): String {
        return "hello kt"
    }

    @GetMapping("/tweets")
    fun getAllTweets(): List<Tweet> {
        val tweets = listOf(Tweet("1", "11"),
                Tweet("2", "22"),
                Tweet("3", "33"),
                Tweet("4", "44"))
        return tweets
    }
}