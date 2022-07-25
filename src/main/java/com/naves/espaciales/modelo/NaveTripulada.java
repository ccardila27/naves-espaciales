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
 * Clase Hija, hereda los atributos y métodos de la clase padre. También implementa
 * una interface, y además tiene atributros propios que la diferencian de las
 * otras clases hijas, como si orbita la tierra y la cantidad de tripulantes
 */
@Entity 
@Table (name="NaveTripulada")
public class NaveTripulada extends Nave implements energia {
	
	@Column(nullable = false, length = 10)
	private String orbitaTierra;
	
	@Column(nullable = false)
	private int tripulacion;

	
	//generación de constructores
	public NaveTripulada() {
		super();
	}

	public NaveTripulada(Long id, String nombre, float toneladasEmpuje, float toneladasPeso, float velocidad,
			float altura, String paisOrigen, String fechaActividad, String tipo) {
		super(id, nombre, toneladasEmpuje, toneladasPeso, velocidad, altura, paisOrigen, fechaActividad, tipo);
	}

	/**
	 * @param orbitaTierra Indica si la nave cumple funciones orbitando la tierra o 
	 * desplazándose hacia el espacio exterior
	 * @param tripulantes indica la cantidad de personas que se encuentran en la nave
	 */

	
	//Definición de Setters and getters
	public String getOrbitaTierra() {
		return orbitaTierra;
	}

	public void setOrbitaTierra(String orbitaTierra) {
		this.orbitaTierra = orbitaTierra;
	}

	public int getTripulacion() {
		return tripulacion;
	}

	public void setTripulacion(int tripulacion) {
		this.tripulacion = tripulacion;
	}

	/**
	 * Sobrescritura de los métodos abstractos de la clase super
	 * Para establecer la función de la nave y su tipo
	 */
	@Override
	public void funcionNave() {
		System.out.println("La función de la nave tripulada consiste en enviar seres humanos al espacio exterior.");
	}


	@Override
	public void tipoNave() {
		System.out.println("La nave es de tipo tripulada.");
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
