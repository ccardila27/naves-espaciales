/**
 * @author: Cristian Ardila Saavedra
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

import com.naves.espaciales.modelo.NaveTripulada;
import com.naves.espaciales.servicio.NaveTripuladaServicio;

/**
 * Clase que responde a los eventos realizados para el CRUD
 */

@Controller 
public class NaveTripuladaControlador {

	// Autowired para inyectar el repositorio
	@Autowired
	private NaveTripuladaServicio naveTripuladaServicio;
		
	@RequestMapping("/naves-tripuladas")
	public String verTripulada(Model modelo, @Param("palabraClave") String palabraClave) {
		List<NaveTripulada> listaNavesTripuladas = naveTripuladaServicio.listAll(palabraClave);
		modelo.addAttribute("listaNavesTripuladas", listaNavesTripuladas);
		modelo.addAttribute("palabraClave", palabraClave);
		
		return "naves-tripuladas";
		/**
		 * @return renderiza el template de html que muestra las naves
		 */
	}
	
	
	/**
	 * Método para recibir los datos de la nueva nave, por medio de un formulario
	 * renderiza el template de html que permite ingresar los valores para crear una nave
	 */	
	@RequestMapping("/nueva-tripulada")
	public String mostrarFormularioTripulada(Model modelo) {
		NaveTripulada naveTripulada = new NaveTripulada();
		modelo.addAttribute("naveTripulada", naveTripulada);
		return "nueva-tripulada";
	}
	
	
	/**
	 * * Método para guardar los datos recibidos por el formulario
	 * realiza el método POST de los valores recibidos anteriormente
	 * 
	 */
	@RequestMapping(value = "/guardar-tripulada", method = RequestMethod.POST)
	public String guardarTripulada(@ModelAttribute("naveTripulada") NaveTripulada naveTripulada) {
		naveTripuladaServicio.save(naveTripulada);
		return "redirect:/naves-tripuladas";
	}
	
	
	/** 
	 * Método para mostrar el formulario de la edición de cualquier nave
	 */
	@RequestMapping("/editar-tripulada/{id}")
	public ModelAndView mostrarFormularioEditarTripulada(@PathVariable(name = "id") Long id) {
		ModelAndView modelo = new ModelAndView("editar_tripulada");
		NaveTripulada naveTripulada = naveTripuladaServicio.get(id);
		modelo.addObject("naveTripulada", naveTripulada);
		return modelo;
	}
	
	
	/** 
	 * Método para eliminar una nave de la tabla
	 */
	@RequestMapping ("/eliminar-tripulada/{id}")
	public String eliminarNaveTripulada(@PathVariable(name = "id") Long id) {
		naveTripuladaServicio.delete(id);
		return "redirect:/naves-tripuladas";
	}
	
}
