package com.p3soft.backend.controller;

import com.p3soft.backend.model.TopNews;
import com.p3soft.backend.repository.TopNewsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
@RequestMapping("/TopNews")
public class TopNewsController {
    @Autowired
    private TopNewsRepository topNewsRepository;

    @CrossOrigin(origins = {"*"},maxAge = 4800 , allowCredentials = "false")

    @GetMapping("/TopNews")
    public List<TopNews> getAllTopNews(){
        return topNewsRepository.findAll();
    }
}
