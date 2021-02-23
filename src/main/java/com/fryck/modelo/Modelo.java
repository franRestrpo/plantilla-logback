package com.fryck.modelo;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fryck.principal.App;

/**
 * @author fryck
 *
 */
public class Modelo {
	private int numeroUno;
	private int numeroDos;
	private long resultado;

	private final static Logger logger = LoggerFactory.getLogger(Modelo.class);
	
	public int getNumeroUno() {
		return numeroUno;
	}
	public void setNumeroUno(int numeroUno) {
		this.numeroUno = numeroUno;
	}
	public int getNumeroDos() {
		return numeroDos;
	}
	public void setNumeroDos(int numeroDos) {
		this.numeroDos = numeroDos;
	}
	public long getResultado() {
		return resultado;
	}
	public void setResultado(long resultado) {
		this.resultado = resultado;
	}
	public  void multiplicar() {
		resultado= this.numeroUno* this.numeroDos;		
		logger.info("las variables son: "+numeroUno + " y "+numeroDos);
	}
	

}
