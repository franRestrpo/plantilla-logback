package com.fryck.vista;

import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import com.fryck.modelo.Modelo;

import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.ComponentOrientation;

public class Vista extends JFrame {

	private JPanel contentPane;
	public JTextField txtNumeroDos;
	public JTextField txtResultado;
	public JTextField txtNumeroUno;
	public JButton btnMultiplicar;
	
	private final static Logger logger = LoggerFactory.getLogger(Vista.class);

	public Vista() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		txtNumeroUno = new JTextField();
		txtNumeroUno.setText("0");
		txtNumeroUno.setComponentOrientation(ComponentOrientation.RIGHT_TO_LEFT);
		txtNumeroUno.setBounds(44, 40, 114, 19);
		contentPane.add(txtNumeroUno);
		txtNumeroUno.setColumns(10);
		
		txtNumeroDos = new JTextField();
		txtNumeroDos.setText("0");
		txtNumeroDos.setBounds(223, 40, 114, 19);
		contentPane.add(txtNumeroDos);
		txtNumeroDos.setColumns(10);
		
		txtResultado = new JTextField();
		txtResultado.setBounds(138, 115, 114, 19);
		contentPane.add(txtResultado);
		txtResultado.setColumns(10);
		
		btnMultiplicar = new JButton("multiplicar");
		btnMultiplicar.setBounds(138, 78, 117, 25);
		contentPane.add(btnMultiplicar);
		
		JLabel lblX = new JLabel("X");
		lblX.setBounds(181, 42, 24, 15);
		contentPane.add(lblX);
	}
}
