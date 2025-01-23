package com.mx.apiRestCinepolis.model;
/*CREATE TABLE PELICULAS(
ID_PELICULA NUMBER PRIMARY KEY,
NOMBRE NVARCHAR2(100) NOT NULL,
GENERO NVARCHAR2(100) NOT NULL,
PRECIO NUMBER
);
 * 
 * */

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@Entity
/*es un componente crucial de la API de persistencia de Java (JPA)
que permite a los desarrolladores definir una clase como una entidad,
 que se asigna a una tabla de base de datos
*/

@Table(name = "PELICULAS")
/*es una anotación de la especificación JPA (Java Persistence API)
 *  que se aplica a clases que también están anotadas con @Entity .
 * Se usa para definir detalles adicionales sobre cómo se mapea
 *  la entidad a una tabla de base de datos.*/

@NoArgsConstructor
@AllArgsConstructor
@Data
public class Peliculas {

	//mapeo de los campos de la tabla
	@Id
	@Column (name="ID_PELICULA", columnDefinition = "NUMBER", nullable = false)
	private Integer idPeli;
	
	@Column(name="NOMBRE", columnDefinition = "NVARCHAR2(100)", nullable = false)
	private String nombre;
	
	@Column(name="GENERO", columnDefinition ="NVARCHAR2(100)", nullable = false )
	private String genero;
	
	@Column (name = "PRECIO", columnDefinition = "NUMBER", nullable = true)
	private Float precio;
}






