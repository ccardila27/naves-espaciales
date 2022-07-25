package com.naves.espaciales.repositorio;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

import com.naves.espaciales.modelo.NaveTripulada;

public interface NaveTripuladaRepositorio extends JpaRepository <NaveTripulada, Long> {
		// Para filtrar por medio de una Query de MySQL
		@Query("SELECT n FROM NaveTripulada n WHERE"
				+ " CONCAT(n.nombre,n.toneladasEmpuje,n.toneladasPeso,n.velocidad,"
				+ "n.altura,n.paisOrigen,n.fechaActividad,n.tripulacion,n.orbitaTierra)"
				+ " LIKE %?1%")
		public List <NaveTripulada> findAll(String palabraClave);

}
