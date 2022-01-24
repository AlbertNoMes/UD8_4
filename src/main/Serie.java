/*
 * AUTOR: ALBERT NOTARIO MESTRES
 * DATA: 24/01/22
 */

package main;

public class Serie {

	// CONSTANTES
	final int NUMTEMP = 3;
	final boolean ENTREGADO = false;

	// ATRIBUTOS
	private String titulo;
	private int numTemp;
	private boolean entregado;
	private String genero;
	private String creador;

	// CONSTRUCTOR POR DEFECTO
	public Serie() {

		this.titulo = "";
		this.numTemp = NUMTEMP;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = "";
	}

	// CONSTRUCTOR CON TITULO Y CREADOR
	public Serie(String titulo, String creador) {

		this.titulo = titulo;
		this.numTemp = NUMTEMP;
		this.entregado = ENTREGADO;
		this.genero = "";
		this.creador = creador;
	}

	// CONSTRUCTOR CON TODO
	public Serie(String titulo, int numTemp, String genero, String creador) {

		this.titulo = titulo;
		this.numTemp = numTemp;
		this.entregado = ENTREGADO;
		this.genero = genero;
		this.creador = creador;
	}

	// METODO TO STRING
	@Override
	public String toString() {
		return "Serie [titulo=" + titulo + ", numTemp=" + numTemp + ", entregado=" + entregado + ", genero=" + genero
				+ ", creador=" + creador + "]";
	}
}