/*
 * @author Cristian Ardila Saavedra
 * @version 24.07.2022
 */

package com.naves.espaciales.controlador;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.naves.espaciales.modelo.NaveLanzadera;
import com.naves.espaciales.servicio.NaveLanzaderaServicio;

/**
 * Clase que responde a los eventos realizados para el CRUD
 */

@Controller 
public class NaveLanzaderaControlador {
	
	// Autowired para inyectar el repositorio
	@Autowired
	private NaveLanzaderaServicio naveLanzaderaServicio;
		
	@RequestMapping("/naves-lanzaderas")
	public String verLanzadera(Model modelo, @Param("palabraClave") String palabraClave) {
		List<NaveLanzadera> listaNavesLanzaderas = naveLanzaderaServicio.listAll(palabraClave);
		modelo.addAttribute("listaNavesLanzaderas", listaNavesLanzaderas);
		modelo.addAttribute("palabraClave", palabraClave);
		
		return "naves-lanzaderas";
		/**
		 * @return renderiza el template de html que muestra las naves
		 */
	}
	
	
	/**
	 * Método para recibir los datos de la nueva nave, por medio de un formulario
	 * renderiza el template de html que permite ingresar los valores para crear una nave
	 */	
	@RequestMapping("/nueva-lanzadera")
	public String mostrarFormularioLanzadera(Model modelo) {
		NaveLanzadera naveLanzadera = new NaveLanzadera();
		modelo.addAttribute("naveLanzadera", naveLanzadera);
		return "nueva-lanzadera";

	}
	
	/**
	 * * Método para guardar los datos recibidos por el formulario
	 * realiza el método POST de los valores recibidos anteriormente
	 * 
	 */
	@RequestMapping(value = "/guardar-lanzadera", method = RequestMethod.POST)
	public String guardarLanzadera(@ModelAttribute("naveLanzadera") NaveLanzadera naveLanzadera) {
		naveLanzaderaServicio.save(naveLanzadera);
		return "redirect:/naves-lanzaderas";

	}
	
	/**
	 * Método para mostrar el formulario de la edición de cualquier nave
	 */
	@RequestMapping("/editar-lanzadera/{id}")
	public ModelAndView mostrarFormularioEditarLanzadera(@PathVariable(name = "id") Long id) {
		ModelAndView modelo = new ModelAndView("editar_lanzadera");
		NaveLanzadera naveLanzadera = naveLanzaderaServicio.get(id);
		modelo.addObject("naveLanzadera", naveLanzadera);
		return modelo;
	}
	
	/**
	 * Método para eliminar una nave de la tabla
	 */
	@RequestMapping ("/eliminar-lanzadera/{id}")
	public String eliminarNaveLanzadera(@PathVariable(name = "id") Long id) {
		naveLanzaderaServicio.delete(id);
		return "redirect:/naves-lanzaderas";
	}
	
	
	

}
