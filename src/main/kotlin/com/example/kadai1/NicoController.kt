package com.example.kadai1

import org.springframework.stereotype.Controller
import org.springframework.ui.Model
import org.springframework.web.bind.annotation.*

@Controller
class nicoController {

    @GetMapping("nico")
    fun index(model: Model): String {
        model.addAttribute("D", "nico")
        return "nico"
    }
}
