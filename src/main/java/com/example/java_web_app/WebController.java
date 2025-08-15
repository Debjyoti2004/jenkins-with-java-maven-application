package com.example.java_web_app;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;

@Controller
public class WebController {

    /**
     * This method listens for requests to the home page ("/")
     * and returns the name of the HTML file to display, which is "index".
     */
    @GetMapping("/")
    public String homePage() {
        return "index"; // This corresponds to "index.html"
    }
}