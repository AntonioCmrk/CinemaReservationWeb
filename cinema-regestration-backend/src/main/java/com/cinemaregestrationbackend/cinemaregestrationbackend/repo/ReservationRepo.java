package com.cinemaregestrationbackend.cinemaregestrationbackend.repo;

import com.cinemaregestrationbackend.cinemaregestrationbackend.entity.Reservation;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;
import org.springframework.stereotype.Repository;

import java.util.List;

@EnableJpaRepositories
@Repository
public interface ReservationRepo extends JpaRepository<Reservation,Long> {
    List<Reservation> findByMovieId(Long movieId);
}
