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

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    @Override
    public String toString() {
        return "FavoritesNews{" +
                "id=" + id +
                ", title='" + title + '\'' +
                '}';
    }
}
