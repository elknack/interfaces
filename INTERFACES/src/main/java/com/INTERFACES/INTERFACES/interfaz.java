package com.INTERFACES.INTERFACES;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.ButtonGroup;
import javax.swing.JButton;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Color;
import javax.swing.SwingConstants;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JTextArea;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.BorderLayout;
import javax.swing.JTextField;

public class interfaz extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz frame = new interfaz();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public interfaz() {
	    contentPane = new JPanel();
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    setBounds(100, 100, 670, 443); 
	    contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
	    setContentPane(contentPane);
	    contentPane.setLayout(null);
		getContentPane().setFont(new Font("Arial", Font.PLAIN, 20));
		getContentPane().setLayout(null);
		
		JLabel lblNewLabel = new JLabel("generador numeros");
		lblNewLabel.setFont(new Font("Arial Black", Font.PLAIN, 20));
		lblNewLabel.setBounds(80, 60, 231, 107);
		getContentPane().add(lblNewLabel);
		
		JRadioButton r1 = new JRadioButton("entre 0 y 100");
		r1.setFont(new Font("Arial", Font.PLAIN, 14));
		r1.setBounds(388, 84, 154, 21);
		getContentPane().add(r1);
		
		JRadioButton r2 = new JRadioButton("entre 100 y 200");
		r2.setFont(new Font("Arial", Font.PLAIN, 14));
		r2.setBounds(388, 107, 154, 21);
		getContentPane().add(r2);
		
		JRadioButton r3 = new JRadioButton("Entre 200 y 500");
		r3.setFont(new Font("Arial", Font.PLAIN, 14));
		r3.setBounds(388, 130, 154, 21);
		getContentPane().add(r3);
		
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		group.add(r3);
		
		JLabel numgenerado = new JLabel("");
		numgenerado.setForeground(new Color(0, 0, 0));
		numgenerado.setBackground(new Color(255, 255, 255));
		numgenerado.setFont(new Font("Arial", Font.PLAIN, 20));
		numgenerado.setBounds(292, 305, 122, 41);
		getContentPane().add(numgenerado);
		
		JButton btnNewButton = new JButton("generar");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				int n=0;
				if(r1.isSelected()==true) {
					n=(int)Math.round(Math.random()*100);
				}else if(r2.isSelected()==true) {
					n=100+(int)Math.round(Math.random()*100);
				}else if(r3.isSelected()==true) {
					n=200+(int)Math.round(Math.random()*300);
				}
				numgenerado.setText(String.valueOf(n));
			}
		});
		btnNewButton.setFont(new Font("Arial Black", Font.PLAIN, 20));
		btnNewButton.setBounds(242, 234, 122, 52);
		getContentPane().add(btnNewButton);
		


		




		
		

	}
	}
