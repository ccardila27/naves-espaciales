
/**
 * @author Cristian Ardila Saavedra
 * version 24.07.2022
 *
 */

package com.naves.espaciales.modelo;

import javax.persistence.Column;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.MappedSuperclass;

/**
 * Clase Padre, abstracta, encargada de la mayoría de atributos en comun entre todos los tipos de naves,
 * con dos métodos abstractos que se sobrescriben en cada clase hija
 */
@MappedSuperclass
public abstract class Nave {

	/**
	 * Se establece nulleable = false, ya que la nave debe tener todos los atributos
	 * para que sea creada
	 */

	@Id 
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Long id;
	
	@Column(nullable = false, length = 60)
	private String nombre;

	@Column(nullable = false)
	private float toneladasEmpuje;

	@Column(nullable = false)
	private float toneladasPeso;

	@Column(nullable = false)
	private float velocidad;

	@Column(nullable = false)
	private float altura;

	@Column(nullable = false, length = 100)
	private String paisOrigen;

	@Column(nullable = false, length = 80)
	private String fechaActividad;
	
	@Column(nullable = false, length = 50)
	private String tipo;

	
	//Generación del constructor
	
	public Nave() {
		super();
	}
	
	public Nave(Long id, String nombre, float toneladasEmpuje, float toneladasPeso, float velocidad, float altura,
			String paisOrigen, String fechaActividad, String tipo) {
		super();
		this.id = id;
		this.nombre = nombre;
		this.toneladasEmpuje = toneladasEmpuje;
		this.toneladasPeso = toneladasPeso;
		this.velocidad = velocidad;
		this.altura = altura;
		this.paisOrigen = paisOrigen;
		this.fechaActividad = fechaActividad;
		this.tipo = tipo;
	}
	
	/**
	 * Constructor
	 * @param nombre nombre de la nave
	 * @param toneladasEmpuje capacidad de empuje que tiene la nave
	 * @param toneladasPeso peso propio de la nave
	 * @param velocidad velocidad que alcanza la nave en funcionamiento
	 * @param altura de la nave
	 * @param paisOrigen lugar donde fue construida
	 * @param fechaActividad años entre los que la nave estuvo activa
	 * @param tipo indica si es lanzadera, tripulada o no tripulada
	 */


	// Se generan los getters and setters

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getNombre() {
		return nombre;
	}

	public void setNombre(String nombre) {
		this.nombre = nombre;
	}

	public float getToneladasEmpuje() {
		return toneladasEmpuje;
	}

	public void setToneladasEmpuje(float toneladasEmpuje) {
		this.toneladasEmpuje = toneladasEmpuje;
	}

	public float getToneladasPeso() {
		return toneladasPeso;
	}

	public void setToneladasPeso(float toneladasPeso) {
		this.toneladasPeso = toneladasPeso;
	}

	public float getVelocidad() {
		return velocidad;
	}

	public void setVelocidad(float velocidad) {
		this.velocidad = velocidad;
	}

	public float getAltura() {
		return altura;
	}

	public void setAltura(float altura) {
		this.altura = altura;
	}

	public String getPaisOrigen() {
		return paisOrigen;
	}

	public void setPaisOrigen(String paisOrigen) {
		this.paisOrigen = paisOrigen;
	}

	public String getFechaActividad() {
		return fechaActividad;
	}

	public void setFechaActividad(String fechaActividad) {
		this.fechaActividad = fechaActividad;
	}
	
	public String getTipo() {
		return tipo;
	}

	public void setTipo(String tipo) {
		this.tipo = tipo;
	}

	// Métodos abstractos de la superclase Nave
	
	public abstract void funcionNave();
	
	public abstract void tipoNave();
	

}
