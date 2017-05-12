package com.cedar.mta.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;

import com.cedar.mta.entity.Genre;

public interface GenreRepository extends JpaRepository<Genre, Integer>{

}
