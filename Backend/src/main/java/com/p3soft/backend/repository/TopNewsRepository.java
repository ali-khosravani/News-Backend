package com.p3soft.backend.repository;

import com.p3soft.backend.model.TopNews;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface TopNewsRepository extends JpaRepository<TopNews , Long> {
}
