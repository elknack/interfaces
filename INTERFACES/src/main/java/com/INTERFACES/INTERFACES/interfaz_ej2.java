package com.INTERFACES.INTERFACES;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JLabel;
import java.awt.Font;
import java.awt.Image;

import javax.swing.ButtonGroup;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.JRadioButton;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.border.BevelBorder;

public class interfaz_ej2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel contentPane;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					interfaz_ej2 frame = new interfaz_ej2();
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
	public interfaz_ej2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 716, 531);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(contentPane);
		contentPane.setLayout(null);
		
		JLabel lblNewLabel = new JLabel("Elige una opcion para ver la imagen");
		lblNewLabel.setFont(new Font("Arial", Font.BOLD, 20));
		lblNewLabel.setBounds(78, 52, 437, 58);
		contentPane.add(lblNewLabel);
		
		JButton btnNewButton = new JButton("salir");
		
		btnNewButton.setBackground(new Color(0, 0, 0));
		btnNewButton.setForeground(new Color(255, 0, 0));
		btnNewButton.setFont(new Font("Arial", Font.BOLD, 14));
		btnNewButton.setBounds(496, 65, 117, 39);
		contentPane.add(btnNewButton);
		
		JRadioButton r1 = new JRadioButton("perro");
		r1.setFont(new Font("Arial", Font.PLAIN, 13));
		r1.setForeground(new Color(255, 0, 0));
		r1.setBounds(125, 173, 103, 21);
		contentPane.add(r1);
		
		JRadioButton r2 = new JRadioButton("gato");
		r2.setFont(new Font("Arial", Font.PLAIN, 13));
		r2.setForeground(new Color(255, 0, 0));
		r2.setBounds(125, 196, 103, 21);
		contentPane.add(r2);
		
		JRadioButton r3 = new JRadioButton("tigre");
		r3.setFont(new Font("Arial", Font.PLAIN, 13));
		r3.setForeground(new Color(255, 0, 0));
		r3.setBounds(125, 219, 103, 21);
		contentPane.add(r3);
		
		JRadioButton r4 = new JRadioButton("leon");
		r4.setFont(new Font("Arial", Font.PLAIN, 13));
		r4.setForeground(new Color(255, 0, 0));
		r4.setBounds(125, 242, 103, 21);
		contentPane.add(r4);
		
		ButtonGroup group = new ButtonGroup();
		group.add(r1);
		group.add(r2);
		group.add(r3);
		group.add(r4);
		
		JPanel panel = new JPanel();
		panel.setBorder(new BevelBorder(BevelBorder.LOWERED, null, null, null, null));
		panel.setBackground(new Color(255, 255, 255));
		panel.setVisible(false);
		panel.setBounds(405, 331, 263, 128);
		contentPane.add(panel);
		panel.setLayout(null);
		
		JLabel lblNewLabel_1 = new JLabel("desea salir?");
		lblNewLabel_1.setBounds(51, 33, 121, 30);
		lblNewLabel_1.setFont(new Font("Arial", Font.PLAIN, 14));
		panel.add(lblNewLabel_1);
		
		JButton btnNewButton_1 = new JButton("claro que si");
		btnNewButton_1.setBounds(23, 85, 110, 21);
		panel.add(btnNewButton_1);
		
		JButton btnNewButton_1_1 = new JButton("claro que no");
		btnNewButton_1_1.setBounds(143, 85, 110, 21);
		panel.add(btnNewButton_1_1);
		
		JLabel imagen = new JLabel("");
		imagen.setBounds(293, 177, 286, 198);
		contentPane.add(imagen);
		

		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				panel.setVisible(true);
			}
		});
		btnNewButton_1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                System.exit(0);
	            }
	        });
		btnNewButton_1_1.addActionListener(new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                panel.setVisible(false);
	            }
	        });
		 ActionListener animalListener = new ActionListener() {
	            public void actionPerformed(ActionEvent e) {
	                String animal = ((JRadioButton) e.getSource()).getText();
	                String raiz = "";

	                switch (animal) {
	                    case "perro":
	                    	raiz = "/perro.jpg";
	                        break;
	                    case "gato":
	                    	raiz = "/gato.jpg";
	                        break;
	                    case "tigre":
	                    	raiz = "/tigre.jpg"; 
	                        break;
	                    case "leon":
	                    	raiz = "/leon.jpg"; 
	                        break;
	                }

	                
	                ImageIcon icon = new ImageIcon(getClass().getResource(raiz));
	                Image img = icon.getImage().getScaledInstance(imagen.getWidth(), imagen.getHeight(), Image.SCALE_SMOOTH);
	                imagen.setIcon(new ImageIcon(img));
	            }
	        };

	        r1.addActionListener(animalListener);
	        r2.addActionListener(animalListener);
	        r3.addActionListener(animalListener);
	        r4.addActionListener(animalListener);
	}
}
