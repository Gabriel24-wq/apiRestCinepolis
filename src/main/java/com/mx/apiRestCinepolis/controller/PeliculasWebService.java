package com.mx.apiRestCinepolis.controller;
//Web service: Es una tecnologia que me permite comunicar 2 componentes: Servidor y Cliente

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.mx.apiRestCinepolis.model.Peliculas;
import com.mx.apiRestCinepolis.service.PeliculasServImpl;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;


//@RestController---Nos permite marcar como controlador de solicitudes y se utiliza para 
//crear servicios web --- web service de tipo rest ---trabajan con json

//@RequestMapping---se utiliza para asignar solicitudes web a entonrnos de spring
//o para forar nuestros recursos(url, endpoint)

//@CrossOrigin---es por seguridad para que nuestra aplicacion no sea bloquedao por el navegador

//Poner los estereotipod o anotaciones

@RestController
@RequestMapping(path = "PeliculasWebService")
@CrossOrigin

public class PeliculasWebService {
	@Autowired
	PeliculasServImpl peliculaImp;
	
	//Peticiones GET para listar
	//Url: http://localhost:9000/PeliculasWebService/listar
	@GetMapping(path = "listar")
	public List<Peliculas> listar() {
		return peliculaImp.listar();
	}
	
	//http://localhost:9000/PeliculasWebService/buscarXId
	@PostMapping("buscarXId")
	public Peliculas buscarXId(@RequestBody Peliculas pelicula) {
		return peliculaImp.buscarXid(pelicula.getIdPeli());
	}
	
	//http://localhost:9000/PeliculasWebService/editar
	//Se coloca Post por que vamos a mandar una peticion
	//Recordar es opcional el no poner el path=
	@PostMapping("editar")
	public void editar(@RequestBody Peliculas pelicula) {
	peliculaImp.editar(pelicula);
	}
	//http://localhost:9000/PeliculasWebService/guardar
	//Es opcional el no ponerle el path=
	@PostMapping("guardar")
	public void guardar (@RequestBody Peliculas pelicula) {
		peliculaImp.guardar(pelicula);
	}
	//http://localhost:9000/PeliculasWebService/eliminarXid
	@PostMapping("eliminarXid")
	public void eliminar(@RequestBody Peliculas pelicula) {
		peliculaImp.eliminarXid(pelicula.getIdPeli());		
	}
}
