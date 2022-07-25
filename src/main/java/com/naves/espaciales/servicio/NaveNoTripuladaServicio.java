package com.naves.espaciales.servicio;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.naves.espaciales.modelo.NaveNoTripulada;
import com.naves.espaciales.repositorio.NaveNoTripuladaRepositorio;

@Service 
public class NaveNoTripuladaServicio {
	
	// Para inyectar el repositorio de naves tripuladas
	@Autowired
	private NaveNoTripuladaRepositorio naveNoTripuladaRepositorio;
	
	// Método para listar las naves espaciales, que inicialmente muestre todo el crud, y luego si haga el filtro
	public List<NaveNoTripulada> listAll(String palabraClave){
		if(palabraClave != null) {
			return naveNoTripuladaRepositorio.findAll(palabraClave);
		}
		return naveNoTripuladaRepositorio.findAll();
	}
	
	// Método para guardar las naves de tipo lanzadera
	public void save(NaveNoTripulada naveNoTripulada) {
		naveNoTripuladaRepositorio.save(naveNoTripulada);
	}

	// Método para obtener un sólo producto
	public NaveNoTripulada get(Long id) {
		return naveNoTripuladaRepositorio.findById(id).get();
	}
	
	// Método para eliminar una nave de tipo lanzadera especifíca
	public void delete(Long id) {
		naveNoTripuladaRepositorio.deleteById(id);
	}

}
