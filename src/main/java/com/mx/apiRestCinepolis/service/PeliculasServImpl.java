package com.mx.apiRestCinepolis.service;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import com.mx.apiClienteBancomer.model.Empleados;
import com.mx.apiRestCinepolis.dao.PeliculaDao;
import com.mx.apiRestCinepolis.model.Peliculas;



@Service
public class PeliculasServImpl implements PeliculasServicio{
	@Autowired
	PeliculaDao dao;
	
	//Se agrega para realizar cambios en la BD
	//Hay que invocar la libreria de
	//Si se agrega (readOnly=true) no lo va a guardar en BD
	//se eejcuta correctamente pero no hace elmovimiento en la BD
	@Transactional
	@Override
	public void guardar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		dao.save(pelicula);
	}
	
	@Transactional(readOnly=true)
	@Override
	public List<Peliculas> listar() {
		// TODO Auto-generated method stub
		return (List<Peliculas>)dao.findAll();
	}

	@Override
	public Peliculas buscarXid(int idPeli) {
		// TODO Auto-generated method stub
		Peliculas peliculaEncontrada=dao.findById(idPeli).orElse(null);
		return peliculaEncontrada;
	}

	
	@Override
	public void editar(Peliculas pelicula) {
		// TODO Auto-generated method stub
		dao.save(pelicula);
	}

	@Override
	public void eliminarXid(int idPeli) {
		// TODO Auto-generated method stub
		dao.deleteById(idPeli);
	}

}
