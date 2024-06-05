package com.example.Movie.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.example.Movie.entity.Movie;
import com.example.Movie.repository.MovieRepository;

// import java.util.ArrayList;
import java.util.List;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class MovieController {
    
    @Autowired
    MovieRepository movieRepository;

    @GetMapping("/api/movies")
    public List<Movie> getMovie(){

        // List<String> movies = new ArrayList<>();
        // movies.add("aaa");
        // movies.add("bbb");
        // movies.add("ccc");
        System.out.println("welcome HOME PAGE");

        List<Movie> movies = movieRepository.findAll();


        return movies; 
    }

    // 리뷰 작성 페이지
    @GetMapping("/api/write")
    public String write(){
        System.out.println("welcome Write PAGE");
        return null;
    }
    
    // 리뷰 작성 추가
    @PostMapping("/api/add")
    public Movie writePost(@RequestParam String title, @RequestParam String content) {
        
        Movie movie = new Movie();
        movie.setTitle(title);
        movie.setContent(content);
        
        System.out.println("-------------------------------");
        System.out.println(movie.getTitle());
        System.out.println(movie.getContent());
        
        return movie;
    }
    
    
}
