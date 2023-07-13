package com.cinemaregestrationbackend.cinemaregestrationbackend.entity;

import jakarta.persistence.*;
@Entity
@Table(name="movie")
public class Movie {
    @Id
    @Column(name="movie_id", length = 45)
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;
    @Column(name="movie_name", length = 255)
    private String name;
    @Column(name="start_time", length = 255)
    private String time;
    @Column(name="day", length = 255)
    private String day;
    @Column(name="price")
    private Long price;
    @Column(name="image_path", length = 255)
    private String imagePath;

    public Movie() {
    }

    public Movie(String name, String time, String day, Long price, String imagePath) {
        this.name = name;
        this.time = time;
        this.day = day;
        this.price = price;
        this.imagePath = imagePath;
    }

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getTime() {
        return time;
    }

    public void setTime(String time) {
        this.time = time;
    }

    public String getDay() {
        return day;
    }

    public void setDay(String day) {
        this.day = day;
    }

    public Long getPrice() {
        return price;
    }

    public void setPrice(Long price) {
        this.price = price;
    }

    public String getImagePath() {
        return imagePath;
    }

    public void setImagePath(String imagePath) {
        this.imagePath = imagePath;
    }
}
