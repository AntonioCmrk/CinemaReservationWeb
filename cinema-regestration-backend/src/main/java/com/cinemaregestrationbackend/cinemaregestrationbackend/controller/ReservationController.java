package com.cinemaregestrationbackend.cinemaregestrationbackend.controller;
import com.cinemaregestrationbackend.cinemaregestrationbackend.entity.Reservation;
import com.cinemaregestrationbackend.cinemaregestrationbackend.exception.ReservationNotFoundException;
import com.cinemaregestrationbackend.cinemaregestrationbackend.repo.ReservationRepo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.Collections;
import java.util.List;

@RestController
@CrossOrigin
@RequestMapping("api/reservation")
public class ReservationController {
    @Autowired
    private ReservationRepo reservationRepo;
    @GetMapping("/reservations")
    List<Reservation> getReservations() {
        return reservationRepo.findAll();
    }
    @GetMapping("/reservations/{id}")
    Reservation getReservationById(@PathVariable Long id) {
        return reservationRepo.findById(id)
                .orElseThrow(() -> new ReservationNotFoundException(id));
    }
    @GetMapping("/movies/{movieId}")
    List<Reservation> getReservationsByMovieId(@PathVariable Long movieId) {
        List<Reservation> reservations = reservationRepo.findByMovieId(movieId);

        if (reservations.isEmpty()) {
            Reservation newReservation = new Reservation();
            newReservation.setMovieId(movieId);
            newReservation.setR1s1("");
            newReservation.setR1s2("");
            newReservation.setR1s3("");
            newReservation.setR1s4("");
            newReservation.setR1s5("");
            newReservation.setR1s6("");
            newReservation.setR2s1("");
            newReservation.setR2s2("");
            newReservation.setR2s3("");
            newReservation.setR2s4("");
            newReservation.setR2s5("");
            newReservation.setR2s6("");
            newReservation.setR3s1("");
            newReservation.setR3s2("");
            newReservation.setR3s3("");
            newReservation.setR3s4("");
            newReservation.setR3s5("");
            newReservation.setR3s6("");
            newReservation.setR4s1("");
            newReservation.setR4s2("");
            newReservation.setR4s3("");
            newReservation.setR4s4("");
            newReservation.setR4s5("");
            newReservation.setR4s6("");
            newReservation.setR5s1("");
            newReservation.setR5s2("");
            newReservation.setR5s3("");
            newReservation.setR5s4("");
            newReservation.setR5s5("");
            newReservation.setR5s6("");

            reservationRepo.save(newReservation);
            reservations = Collections.singletonList(newReservation);
        }

        return reservations;
    }
    @PutMapping("/reservations/movies/{movieId}")
    Reservation updateReservationByMovieId(@PathVariable Long movieId, @RequestBody List<String> seats) {
        List<Reservation> reservations = reservationRepo.findByMovieId(movieId);

        if (reservations.isEmpty()) {
            throw new ReservationNotFoundException(movieId);
        }

        Reservation reservation = reservations.get(0);

        if (seats.size() != 30) {
            throw new IllegalArgumentException("Invalid number of seats provided");
        }

        reservation.setR1s1(seats.get(0));
        reservation.setR1s2(seats.get(1));
        reservation.setR1s3(seats.get(2));
        reservation.setR1s4(seats.get(3));
        reservation.setR1s5(seats.get(4));
        reservation.setR1s6(seats.get(5));
        reservation.setR2s1(seats.get(6));
        reservation.setR2s2(seats.get(7));
        reservation.setR2s3(seats.get(8));
        reservation.setR2s4(seats.get(9));
        reservation.setR2s5(seats.get(10));
        reservation.setR2s6(seats.get(11));
        reservation.setR3s1(seats.get(12));
        reservation.setR3s2(seats.get(13));
        reservation.setR3s3(seats.get(14));
        reservation.setR3s4(seats.get(15));
        reservation.setR3s5(seats.get(16));
        reservation.setR3s6(seats.get(17));
        reservation.setR4s1(seats.get(18));
        reservation.setR4s2(seats.get(19));
        reservation.setR4s3(seats.get(20));
        reservation.setR4s4(seats.get(21));
        reservation.setR4s5(seats.get(22));
        reservation.setR4s6(seats.get(23));
        reservation.setR5s1(seats.get(24));
        reservation.setR5s2(seats.get(25));
        reservation.setR5s3(seats.get(26));
        reservation.setR5s4(seats.get(27));
        reservation.setR5s5(seats.get(28));
        reservation.setR5s6(seats.get(29));

        return reservationRepo.save(reservation);
    }

}