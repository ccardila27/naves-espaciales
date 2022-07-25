package com.naves.espaciales.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naves.espaciales.modelo.NaveTripulada;
import com.naves.espaciales.repositorio.NaveTripuladaRepositorio;

@Service 
public class NaveTripuladaServicio {
	
	// Para inyectar el repositorio de naves tripuladas
	@Autowired
	private NaveTripuladaRepositorio naveTripuladaRepositorio;
	
	// Método para listar las naves espaciales, que inicialmente muestre todo el crud, y luego si haga el filtro
	public List<NaveTripulada> listAll(String palabraClave){
		if(palabraClave != null) {
			return naveTripuladaRepositorio.findAll(palabraClave);
		}
		return naveTripuladaRepositorio.findAll();
	}
	
	// Método para guardar las naves de tipo lanzadera
	public void save(NaveTripulada naveTripulada) {
		naveTripuladaRepositorio.save(naveTripulada);
	}

	// Método para obtener un sólo producto
	public NaveTripulada get(Long id) {
		return naveTripuladaRepositorio.findById(id).get();
	}
	
	// Método para eliminar una nave de tipo lanzadera especifíca
	public void delete(Long id) {
		naveTripuladaRepositorio.deleteById(id);
	}

}
