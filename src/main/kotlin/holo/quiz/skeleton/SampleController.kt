package holo.quiz.skeleton

import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RestController

@RestController
class SampleController {

    @GetMapping("/sample")
    fun get():String {
        return "HelloWorld"
    }
}