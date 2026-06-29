package com.Jin.playground;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import java.time.LocalDateTime;

@Controller
public class BasicController {
    @GetMapping("/")
    String test(){
        return "index.html";
    }

    @GetMapping("/date")
    String date() {
        return LocalDateTime.now().toString() ;
    }

}
