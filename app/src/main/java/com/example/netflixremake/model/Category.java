package com.example.netflixremake.model;

import java.util.List;

public class Category {

   private String name;
   private List<String> movies;

   public String getName() {
      return name;
   }

   public void setName(String name) {
      this.name = name;
   }

   public List<String> getMovies() {
      return movies;
   }

   public void setMovies(List<String> movies) {
      this.movies = movies;
   }
}
