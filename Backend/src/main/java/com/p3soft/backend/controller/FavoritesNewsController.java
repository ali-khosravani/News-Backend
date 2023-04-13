package com.p3soft.backend.controller;

import com.p3soft.backend.model.FavoritesNews;
import com.p3soft.backend.repository.FavoritesNewsRepository;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

@RestController
public class FavoritesNewsController {
    private FavoritesNewsRepository favoritesNewsRepository;

    @GetMapping("/Favorites")
    public List<FavoritesNews> getAll(){return favoritesNewsRepository.findAll();}
}
