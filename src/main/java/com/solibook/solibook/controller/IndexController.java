package com.solibook.solibook.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ResponseBody;
// import com.solibook.solibook.service.IndexService;

@Controller
public class IndexController {
    
    @Autowired
    // private IndexService indexService;

    @GetMapping("/x")
    @ResponseBody
    public String getIndex() {
        // String name = indexService.to_low("Hello World"); // Method naming convention
        String name = "amine";
        return name;
    }

    @GetMapping("/")
    public String generateIndex() { // Corrected method name for consistency
        return "index.html"; // Simplified return statement
    }

    @GetMapping("/y")
    @ResponseBody
    public String display() { // Corrected method name
        return "lhwa dwa"; // Simplified return statement
    }
}
