package com.cinemaregestrationbackend.cinemaregestrationbackend.repo;

import com.cinemaregestrationbackend.cinemaregestrationbackend.entity.Movie;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

@EnableJpaRepositories
@Repository
public interface MovieRepo extends JpaRepository<Movie,Long> {
}
