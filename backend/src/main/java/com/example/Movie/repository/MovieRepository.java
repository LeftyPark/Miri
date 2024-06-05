package com.example.Movie.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.example.Movie.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie, Integer>{
    
}
