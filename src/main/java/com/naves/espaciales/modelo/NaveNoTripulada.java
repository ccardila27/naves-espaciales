/**
 * @author Cristian Ardila Saavedra
 * version 24.07.2022
 *
 */

package com.naves.espaciales.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

import com.naves.espaciales.interfaces.energia;

/**
 * @author Cristian
 *
 */


/**
 * Clase Hija, hereda los atributos y métodos de la clase padre, y además tiene atributros propios
 * que la diferencian de las otras clases hijas, como si orbita la tierra
 */
@Entity 
@Table (name="NaveNoTripulada") 
public class NaveNoTripulada extends Nave implements energia {


	// Se adicionan los atributos que hacen la nave tripulada una clase diferente a las demás
	
	@Column(nullable = false, length = 10)
	private String orbitaTierra;


	
	
	//generación de constructores
	
	public NaveNoTripulada() {
		super();
	}
	
	public NaveNoTripulada(Long id, String nombre, float toneladasEmpuje, float toneladasPeso, float velocidad,
			float altura, String paisOrigen, String fechaActividad, String tipo, String orbitaTierra) {
		super(id, nombre, toneladasEmpuje, toneladasPeso, velocidad, altura, paisOrigen, fechaActividad, tipo);
		this.orbitaTierra = orbitaTierra;
	}
	
	/**
	 * @param orbitaTierra Indica si la nave cumple funciones orbitando la tierra o 
	 * desplazándose hacia el espacio exterior
	 */

	//Definición de los Setters and getters
	public String getOrbitaTierra() {
		return orbitaTierra;
	}


	/**
	 * @param orbitaTierra the orbitaTierra to set
	 */
	public void setOrbitaTierra(String orbitaTierra) {
		this.orbitaTierra = orbitaTierra;
	}
	

	/**
	 * Sobrescritura de los métodos abstractos de la clase super
	 * Para establecer la función de la nave y su tipo
	 */
	@Override
	public void funcionNave() {
		System.out.println("La función de la nave no tripulada consiste en enviar robots a descubrir el espacio exterior.");
	}

	
	@Override
	public void tipoNave() {
		System.out.println("La nave es no tripulada.");
	}

	
	/**
	 * Implementación del método de la interface energia
	 * que retorna un String dependiendo si la nave orbita o no
	 * la tierra
	 */
	@Override
	public void sistemaEnergia(String orbitaTierra) {
		orbitaTierra = this.orbitaTierra;
		if (orbitaTierra.equalsIgnoreCase("Si")) {
			System.out.println("La nave espacial tripulada no requiere combustible");			
		} else {
			System.out.println("La nave espacial tripulada requiere combustible");
		};
		
	}
}
