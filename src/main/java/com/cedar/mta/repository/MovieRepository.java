package com.cedar.mta.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cedar.mta.entity.Movie;

public interface MovieRepository extends JpaRepository<Movie,Integer> {

}
 