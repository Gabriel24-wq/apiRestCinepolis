package com.mx.apiRestCinepolis.dao;

import org.springframework.data.repository.CrudRepository;

import com.mx.apiRestCinepolis.model.Peliculas;

public interface PeliculaDao extends CrudRepository<Peliculas, Integer>{

}
