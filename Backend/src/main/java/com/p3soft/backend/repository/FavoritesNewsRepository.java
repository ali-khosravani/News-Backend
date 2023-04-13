package com.p3soft.backend.repository;

import com.p3soft.backend.model.FavoritesNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface FavoritesNewsRepository extends JpaRepository<FavoritesNews, Long> {
}
