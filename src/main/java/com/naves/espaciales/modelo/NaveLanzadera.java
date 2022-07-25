/**
 * @author Cristian Ardila Saavedra
 * version 24.07.2022
 *
 */

package com.naves.espaciales.modelo;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Table;

/**
 * Clase Hija, hereda los atributos y métodos de la clase padre, y además tiene atributros propios
 * que la diferencian de las otras clases hijas, como el tipo de combustible
 */
@Entity
@Table (name = "lanzadera")
public class NaveLanzadera extends Nave {
	
	
	@Column(nullable = false, length = 65)
	private String tipoCombustible;

	@Column(nullable = false)
	private float toneladasCarga;
	
	/**
	 * @param tipoCombustible debido que la nave debe propulsarse, necesita combustible
	 * @param toneladasCarga peso que es capaz de llevar 
	 * 
	 */

	// Generación de los constructores
	public NaveLanzadera() {
		super();
	}	

	public NaveLanzadera(Long id, String nombre, float toneladasEmpuje, float toneladasPeso, float velocidad,
			float altura, String paisOrigen, String fechaActividad, String tipo) {
		super(id, nombre, toneladasEmpuje, toneladasPeso, velocidad, altura, paisOrigen, fechaActividad, tipo);
		// TODO Auto-generated constructor stub
	}

	public String getTipoCombustible() {
		return tipoCombustible;
	}

	public void setTipoCombustible(String tipoCombustible) {
		this.tipoCombustible = tipoCombustible;
	}

	public float getToneladasCarga() {
		return toneladasCarga;
	}

	public void setToneladasCarga(float toneladasCarga) {
		this.toneladasCarga = toneladasCarga;
	}
	

	/**
	 * Sobrescritura de los métodos abstractos de la clase super
	 * Para establecer la función de la nave y su tipo
	 */
	@Override
	public void funcionNave() {
		System.out.println("La función de la nave lanzadora consiste en enviar otras naves al espacio.");
	}

	@Override
	public void tipoNave() {
		System.out.println("La nave es de tipo lanzadera.");
	}
	
	
}
