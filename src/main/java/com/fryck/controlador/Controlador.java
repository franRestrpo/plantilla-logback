package com.fryck.controlador;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fryck.modelo.Modelo;
import com.fryck.vista.Vista;

public class Controlador implements ActionListener{
	private Vista view;
	private Modelo model;
	
	private final static Logger logger = LoggerFactory.getLogger(Controlador.class);
	
	public Controlador(Vista view, Modelo model) {
		super();
		this.view = view;
		this.model = model;
		this.view.btnMultiplicar.addActionListener(this);
	}
	
	public void iniciarVista() {
		view.setTitle("Hola mundo mvc");
		view.setLocationRelativeTo(null);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		model.setNumeroUno(Integer.parseInt(view.txtNumeroUno.getText()));
		model.setNumeroDos(Integer.parseInt(view.txtNumeroDos.getText()));
		model.multiplicar();
		view.txtResultado.setText(String.valueOf(model.getResultado()));	
	}

}
