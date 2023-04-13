package com.p3soft.backend.model;

import jakarta.persistence.*;

@Entity
@Table(name = "Favorites_News")
public class FavoritesNews {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    private String title;

    public FavoritesNews(){}
    @Override
    public String toString() {
        return "FavoritesNews{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
