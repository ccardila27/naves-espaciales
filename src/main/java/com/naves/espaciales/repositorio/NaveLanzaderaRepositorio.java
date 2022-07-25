package com.naves.espaciales.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.naves.espaciales.modelo.NaveLanzadera;


public interface NaveLanzaderaRepositorio extends JpaRepository<NaveLanzadera, Long> {
	
	// Para filtrar por medio de una Query de MySQL
	@Query("SELECT n FROM NaveLanzadera n WHERE"
			+ " CONCAT(n.nombre,n.toneladasEmpuje,n.toneladasPeso,n.velocidad,"
			+ "n.altura,n.paisOrigen,n.fechaActividad,n.tipoCombustible,n.toneladasCarga)"
			+ " LIKE %?1%")
	public List <NaveLanzadera> findAll(String palabraClave);
	

}
