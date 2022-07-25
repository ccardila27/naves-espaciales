package com.naves.espaciales.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naves.espaciales.modelo.NaveLanzadera;
import com.naves.espaciales.repositorio.NaveLanzaderaRepositorio;

@Service
public class NaveLanzaderaServicio {

	// Para inyectar el repositorio de naves de tipo lanzadera
	@Autowired
	private NaveLanzaderaRepositorio naveLanzaderaRepositorio;
	
	// Método para listar las naves espaciales, que inicialmente muestre todo el crud, y luego si haga el filtro
	public List<NaveLanzadera> listAll(String palabraClave){
		if(palabraClave != null) {
			return naveLanzaderaRepositorio.findAll(palabraClave);
		}
		return naveLanzaderaRepositorio.findAll();
	}
	
	// Método para guardar las naves de tipo lanzadera
	public void save(NaveLanzadera naveLanzadera) {
		naveLanzaderaRepositorio.save(naveLanzadera);
	}

	// Método para obtener un sólo producto
	public NaveLanzadera get(Long id) {
		return naveLanzaderaRepositorio.findById(id).get();
	}
	
	// Método para eliminar una nave de tipo lanzadera especifíca
	public void delete(Long id) {
		naveLanzaderaRepositorio.deleteById(id);
	}
		
}
