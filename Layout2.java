package com.example.ejerciciobasicojava;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import java.awt.Color;
import javax.swing.JCheckBox;
import javax.swing.JTextField;
import java.awt.Font;
import javax.swing.JScrollPane;
import javax.swing.JButton;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Layout2 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel Layout1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout2 frame = new Layout2();
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
	public Layout2() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 427);
		Layout1 = new JPanel();
		Layout1.setBackground(new Color(64, 128, 128));
		Layout1.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Layout1);
		Layout1.setLayout(new GridLayout(2, 1, 0, 0));
		
		JScrollPane scrollPane = new JScrollPane();
		Layout1.add(scrollPane);
		
		JButton btnNewButton = new JButton("uno");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "has Pulsado el boton1");
			}
		});
		scrollPane.setViewportView(btnNewButton);
		
		
		
		JButton btnNewButton_3 = new JButton("dos");
		Layout1.add(btnNewButton_3);
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "has Pulsado el boton 2");
			}
		});
		
		
		
		
		JButton btnNewButton_4 = new JButton("tres");
		Layout1.add(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "has Pulsado el boton 3");
			}
		});
		
		
		JButton btnNewButton_5 = new JButton("cuatro");
		Layout1.add(btnNewButton_5);
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "has Pulsado el boton 4");
			}
		});
		
		
		JButton btnNewButton_1 = new JButton("cinco");
		Layout1.add(btnNewButton_1);
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "has Pulsado el boton 5");
			}
		});
		
		
		JButton btnNewButton_2 = new JButton("seis");
		Layout1.add(btnNewButton_2);
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "has Pulsado el boton 6");
			}
		});
		
		
		
		
		
	}
}
