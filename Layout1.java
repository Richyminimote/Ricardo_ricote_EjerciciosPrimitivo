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
import javax.swing.BoxLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;

public class Layout1 extends JFrame {

	private static final long serialVersionUID = 1L;
	private JPanel Layout1;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Layout1 frame = new Layout1();
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
	public Layout1() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 481, 427);
		Layout1 = new JPanel();
		Layout1.setBackground(new Color(64, 128, 128));
		Layout1.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(Layout1);
		Layout1.setLayout(new GridLayout(5, 1, 0, 0));
		
		JButton btnNewButton_1 = new JButton("1");
		Layout1.add(btnNewButton_1);
		
		JButton btnNewButton_2 = new JButton("2");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
			}
		});
		Layout1.add(btnNewButton_2);
		
		JButton btnNewButton_3 = new JButton("3");
		Layout1.add(btnNewButton_3);
		
		JScrollPane scrollPane = new JScrollPane();
		Layout1.add(scrollPane);
		

		JButton btnNewButton_5 = new JButton("5");
		scrollPane.setViewportView(btnNewButton_5);
		
		JButton btnNewButton_4 = new JButton("4");
		scrollPane.setColumnHeaderView(btnNewButton_4);
		btnNewButton_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JOptionPane.showMessageDialog(null, "has Pulsado el boton 4");
			}
		});
		
		
		
		
	}
}
