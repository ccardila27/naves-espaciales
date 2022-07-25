package com.naves.espaciales.interfaces;


/**
 * @author Cristian Ardila Saavedra
 * version 24.07.2022
 *
 */

/**
 * interface a implementar en las clases navetripulada y NaveNotripulada, con el
 * fin de determinar si estas usan combustible o no de acuerdo a la variable
 * booleana de orbtaTierra. Si la nave orbita la tierra, se considerará que la
 * nave NO usa combustible. De lo contrario, si la nave no orbita la tierra,
 * necesariamente usará combustible
 */
public interface energia {

	public void sistemaEnergia(String dato);
	
}
