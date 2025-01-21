package com.mx.apiRestCinepolis.service;

import java.util.List;

import com.mx.apiRestCinepolis.model.Peliculas;

public interface PeliculasServicio {
	
	public void guardar(Peliculas pelicula);
	
	public List<Peliculas> listar();
	
	public Peliculas buscarXid(int idPeli);
	
	public void editar(Peliculas pelicula);
	
	public void eliminarXid (int idPeli);
}
