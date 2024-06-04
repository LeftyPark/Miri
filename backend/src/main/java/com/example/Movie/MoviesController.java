package com.example.Movie;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@RestController
public class MoviesController {
    
    @GetMapping("/api/movies")
    public List<String> getMovie(){

        List<String> movies = new ArrayList<>();
        movies.add("aaa");
        movies.add("bbb");
        movies.add("ccc");

        return movies; 
    }
    
}
