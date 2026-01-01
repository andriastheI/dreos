package com.dreos.web.controller

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller()
class AuthController {

    @GetMapping("/")
    fun login(): String = "index"
}