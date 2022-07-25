package com.naves.espaciales.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.naves.espaciales.modelo.NaveNoTripulada;


public interface NaveNoTripuladaRepositorio extends JpaRepository <NaveNoTripulada, Long> {
	// Para filtrar por medio de una Query de MySQL
	@Query("SELECT n FROM NaveNoTripulada n WHERE"
			+ " CONCAT(n.nombre,n.toneladasEmpuje,n.toneladasPeso,n.velocidad,"
			+ "n.altura,n.paisOrigen,n.fechaActividad,n.orbitaTierra)"
			+ " LIKE %?1%")
	public List <NaveNoTripulada> findAll(String palabraClave);

}
