package com.example.kadai1

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class bingController {

    @GetMapping("bing")
    fun index(model: Model): String {
        model.addAttribute("C", "bing")
        return "bing"
    }
}


