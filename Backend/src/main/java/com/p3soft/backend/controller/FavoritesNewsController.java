package com.p3soft.backend.controller;

import com.p3soft.backend.model.FavoritesNews;
import com.p3soft.backend.repository.FavoritesNewsRepository;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FavoritesNewsController {
    private FavoritesNewsRepository favoritesNewsRepository;

    @CrossOrigin(origins = {"*"},maxAge = 4800 , allowCredentials = "false")
    @GetMapping("/Favorites")
    public List<FavoritesNews> getAllFavorites(){return favoritesNewsRepository.findAll();}

    FavoritesNewsController(FavoritesNewsRepository favoritesNewsRepository){
        this.favoritesNewsRepository = favoritesNewsRepository;
    }
}
