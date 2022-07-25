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

import com.naves.espaciales.modelo.NaveNoTripulada;
import com.naves.espaciales.servicio.NaveNoTripuladaServicio;

/**
 * Clase que responde a los eventos realizados para el CRUD
 */

@Controller 
public class NaveNoTripuladaControlador {

	// Autowired para inyectar el repositorio
	@Autowired
	private NaveNoTripuladaServicio naveNoTripuladaServicio;
		
	@RequestMapping("/naves-no-tripuladas")
	public String verNoTripulada(Model modelo, @Param("palabraClave") String palabraClave) {
		List<NaveNoTripulada> listaNavesNoTripuladas = naveNoTripuladaServicio.listAll(palabraClave);
		modelo.addAttribute("listaNavesNoTripuladas", listaNavesNoTripuladas);
		modelo.addAttribute("palabraClave", palabraClave);
		
		return "naves-no-tripuladas";
		/**
		 * @return renderiza el template de html que muestra las naves
		 */
	}
	
	
	
	/**
	 * Método para recibir los datos de la nueva nave, por medio de un formulario
	 * renderiza el template de html que permite ingresar los valores para crear una nave
	 */	
	@RequestMapping("/nueva-no-tripulada")
	public String mostrarFormularioNoTripulada(Model modelo) {
		NaveNoTripulada naveNoTripulada = new NaveNoTripulada();
		modelo.addAttribute("naveNoTripulada", naveNoTripulada);
		return "nueva-no-tripulada";
	}
	
	
	/**
	 * * Método para guardar los datos recibidos por el formulario
	 * realiza el método POST de los valores recibidos anteriormente
	 * 
	 */
	@RequestMapping(value = "/guardar-no-tripulada", method = RequestMethod.POST)
	public String guardarNoTripulada(@ModelAttribute("naveNoTripulada") NaveNoTripulada naveNoTripulada) {
		naveNoTripuladaServicio.save(naveNoTripulada);
		return "redirect:/naves-no-tripuladas";
	}
	
	
	/** 
	 * Método para mostrar el formulario de la edición de cualquier nave
	 */
	@RequestMapping("/editar-no-tripulada/{id}")
	public ModelAndView mostrarFormularioEditarNoTripulada(@PathVariable(name = "id") Long id) {
		ModelAndView modelo = new ModelAndView("editar_no_tripulada");
		NaveNoTripulada naveNoTripulada = naveNoTripuladaServicio.get(id);
		modelo.addObject("naveNoTripulada", naveNoTripulada);
		return modelo;
	}
	
	
	/** 
	 * Método para eliminar una nave de la tabla
	 */
	@RequestMapping ("/eliminar-no-tripulada/{id}")
	public String eliminarNaveNoTripulada(@PathVariable(name = "id") Long id) {
		naveNoTripuladaServicio.delete(id);
		return "redirect:/naves-no-tripuladas";
	}
	
	
}
