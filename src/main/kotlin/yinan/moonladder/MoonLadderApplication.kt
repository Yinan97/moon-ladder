package yinan.moonladder

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@SpringBootApplication
class MoonLadderApplication

fun main(args: Array<String>) {
    runApplication<MoonLadderApplication>(*args)
}

@RestController
class HelloController {

    @GetMapping("/hello-kotlin")
    fun getHello() = "Hello World!"

    @GetMapping("/echo")
    fun getEcho() = "echo"
}