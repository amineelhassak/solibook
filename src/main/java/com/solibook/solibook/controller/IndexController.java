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

    @GetMapping("/")
    @ResponseBody
    public String getIndex() {
        return "amine";
    }

    @GetMapping("/admin")
    public String generateIndex() 
    {
        return "index.html";
    }
}
