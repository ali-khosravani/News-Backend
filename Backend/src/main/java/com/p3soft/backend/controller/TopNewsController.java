package com.p3soft.backend.controller;

import com.p3soft.backend.model.TopNews;
import com.p3soft.backend.repository.TopNewsRepository;
import org.springframework.web.bind.annotation.*;


import java.util.List;

@RestController
public class TopNewsController {

    private TopNewsRepository topNewsRepository;

    TopNewsController(TopNewsRepository topNewsRepository){
        this.topNewsRepository= topNewsRepository;
    }

    @CrossOrigin(origins = {"*"},maxAge = 4800 , allowCredentials = "false")



    @GetMapping("/TopNews")
    public List<TopNews> getAllTopNews(){
        return topNewsRepository.findAll();
    }

    @CrossOrigin(origins = {"*"},maxAge = 4800 , allowCredentials = "false")
    @GetMapping("/TopNews/{id}")
    public  TopNews one(@PathVariable Long id){
        return  topNewsRepository.findById(id)
                .orElseThrow();
    }
}
