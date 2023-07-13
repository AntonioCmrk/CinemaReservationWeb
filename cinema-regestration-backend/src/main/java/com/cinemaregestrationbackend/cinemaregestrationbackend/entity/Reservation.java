package com.cinemaregestrationbackend.cinemaregestrationbackend.entity;

import jakarta.persistence.*;

@Entity
public class Reservation {
    @Id
    @Column(name="reservation_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="movie_id", length = 45)
    private Long movieId;
    private String r1s1;
    private String r1s2;
    private String r1s3;
    private String r1s4;
    private String r1s5;
    private String r1s6;
    private String r2s1;
    private String r2s2;
    private String r2s3;
    private String r2s4;
    private String r2s5;
    private String r2s6;
    private String r3s1;
    private String r3s2;
    private String r3s3;
    private String r3s4;
    private String r3s5;
    private String r3s6;
    private String r4s1;
    private String r4s2;
    private String r4s3;
    private String r4s4;
    private String r4s5;
    private String r4s6;
    private String r5s1;
    private String r5s2;
    private String r5s3;
    private String r5s4;
    private String r5s5;
    private String r5s6;

    public Reservation() {
    }

    public Reservation(Long id, Long movieId, String r1s1, String r1s2, String r1s3, String r1s4, String r1s5, String r1s6, String r2s1, String r2s2, String r2s3, String r2s4, String r2s5, String r2s6, String r3s1, String r3s2, String r3s3, String r3s4, String r3s5, String r3s6, String r4s1, String r4s2, String r4s3, String r4s4, String r4s5, String r4s6, String r5s1, String r5s2, String r5s3, String r5s4, String r5s5, String r5s6) {
        this.id = id;
        this.movieId = movieId;
        this.r1s1 = r1s1;
        this.r1s2 = r1s2;
        this.r1s3 = r1s3;
        this.r1s4 = r1s4;
        this.r1s5 = r1s5;
        this.r1s6 = r1s6;
        this.r2s1 = r2s1;
        this.r2s2 = r2s2;
        this.r2s3 = r2s3;
        this.r2s4 = r2s4;
        this.r2s5 = r2s5;
        this.r2s6 = r2s6;
        this.r3s1 = r3s1;
        this.r3s2 = r3s2;
        this.r3s3 = r3s3;
        this.r3s4 = r3s4;
        this.r3s5 = r3s5;
        this.r3s6 = r3s6;
        this.r4s1 = r4s1;
        this.r4s2 = r4s2;
        this.r4s3 = r4s3;
        this.r4s4 = r4s4;
        this.r4s5 = r4s5;
        this.r4s6 = r4s6;
        this.r5s1 = r5s1;
        this.r5s2 = r5s2;
        this.r5s3 = r5s3;
        this.r5s4 = r5s4;
        this.r5s5 = r5s5;
        this.r5s6 = r5s6;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public Long getMovieId() {
        return movieId;
    }

    public void setMovieId(Long movieId) {
        this.movieId = movieId;
    }

    public String getR1s1() {
        return r1s1;
    }

    public void setR1s1(String r1s1) {
        this.r1s1 = r1s1;
    }

    public String getR1s2() {
        return r1s2;
    }

    public void setR1s2(String r1s2) {
        this.r1s2 = r1s2;
    }

    public String getR1s3() {
        return r1s3;
    }

    public void setR1s3(String r1s3) {
        this.r1s3 = r1s3;
    }

    public String getR1s4() {
        return r1s4;
    }

    public void setR1s4(String r1s4) {
        this.r1s4 = r1s4;
    }

    public String getR1s5() {
        return r1s5;
    }

    public void setR1s5(String r1s5) {
        this.r1s5 = r1s5;
    }

    public String getR1s6() {
        return r1s6;
    }

    public void setR1s6(String r1s6) {
        this.r1s6 = r1s6;
    }

    public String getR2s1() {
        return r2s1;
    }

    public void setR2s1(String r2s1) {
        this.r2s1 = r2s1;
    }

    public String getR2s2() {
        return r2s2;
    }

    public void setR2s2(String r2s2) {
        this.r2s2 = r2s2;
    }

    public String getR2s3() {
        return r2s3;
    }

    public void setR2s3(String r2s3) {
        this.r2s3 = r2s3;
    }

    public String getR2s4() {
        return r2s4;
    }

    public void setR2s4(String r2s4) {
        this.r2s4 = r2s4;
    }

    public String getR2s5() {
        return r2s5;
    }

    public void setR2s5(String r2s5) {
        this.r2s5 = r2s5;
    }

    public String getR2s6() {
        return r2s6;
    }

    public void setR2s6(String r2s6) {
        this.r2s6 = r2s6;
    }

    public String getR3s1() {
        return r3s1;
    }

    public void setR3s1(String r3s1) {
        this.r3s1 = r3s1;
    }

    public String getR3s2() {
        return r3s2;
    }

    public void setR3s2(String r3s2) {
        this.r3s2 = r3s2;
    }

    public String getR3s3() {
        return r3s3;
    }

    public void setR3s3(String r3s3) {
        this.r3s3 = r3s3;
    }

    public String getR3s4() {
        return r3s4;
    }

    public void setR3s4(String r3s4) {
        this.r3s4 = r3s4;
    }

    public String getR3s5() {
        return r3s5;
    }

    public void setR3s5(String r3s5) {
        this.r3s5 = r3s5;
    }

    public String getR3s6() {
        return r3s6;
    }

    public void setR3s6(String r3s6) {
        this.r3s6 = r3s6;
    }

    public String getR4s1() {
        return r4s1;
    }

    public void setR4s1(String r4s1) {
        this.r4s1 = r4s1;
    }

    public String getR4s2() {
        return r4s2;
    }

    public void setR4s2(String r4s2) {
        this.r4s2 = r4s2;
    }

    public String getR4s3() {
        return r4s3;
    }

    public void setR4s3(String r4s3) {
        this.r4s3 = r4s3;
    }

    public String getR4s4() {
        return r4s4;
    }

    public void setR4s4(String r4s4) {
        this.r4s4 = r4s4;
    }

    public String getR4s5() {
        return r4s5;
    }

    public void setR4s5(String r4s5) {
        this.r4s5 = r4s5;
    }

    public String getR4s6() {
        return r4s6;
    }

    public void setR4s6(String r4s6) {
        this.r4s6 = r4s6;
    }

    public String getR5s1() {
        return r5s1;
    }

    public void setR5s1(String r5s1) {
        this.r5s1 = r5s1;
    }

    public String getR5s2() {
        return r5s2;
    }

    public void setR5s2(String r5s2) {
        this.r5s2 = r5s2;
    }

    public String getR5s3() {
        return r5s3;
    }

    public void setR5s3(String r5s3) {
        this.r5s3 = r5s3;
    }

    public String getR5s4() {
        return r5s4;
    }

    public void setR5s4(String r5s4) {
        this.r5s4 = r5s4;
    }

    public String getR5s5() {
        return r5s5;
    }

    public void setR5s5(String r5s5) {
        this.r5s5 = r5s5;
    }

    public String getR5s6() {
        return r5s6;
    }

    public void setR5s6(String r5s6) {
        this.r5s6 = r5s6;
    }
}
