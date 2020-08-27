package com.example.kadai1

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class youtubeController {

    @GetMapping("youtube")
    fun index(model: Model): String {
        model.addAttribute("A", "youtube")
        return "youtube"
    }
}

