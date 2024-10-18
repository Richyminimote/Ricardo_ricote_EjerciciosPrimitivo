package com.example.ejercicios_basicos_java;

import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;
import javax.swing.JTextField;
import javax.swing.JButton;
import java.awt.Color;
import javax.swing.SwingConstants;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import javax.swing.JLabel;

public class calculadora extends JFrame {
	
	int num1, num2;
	String signo;

	private JPanel menu;
	private JTextField Resultado;

	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					calculadora frame = new calculadora();
					frame.setVisible(true);
					frame.setLocationRelativeTo(null);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	public calculadora() {
		setTitle("Calculadora");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 299, 352);
		menu = new JPanel();
		menu.setBorder(new EmptyBorder(5, 5, 5, 5));

		setContentPane(menu);
		menu.setLayout(null);
		
		JPanel panel = new JPanel();
		panel.setBounds(10, 10, 273, 311);
		menu.add(panel);
		panel.setLayout(null);
		
		Resultado = new JTextField();
		Resultado.setHorizontalAlignment(SwingConstants.RIGHT);
		Resultado.setBounds(10, 162, 253, 30);
		panel.add(Resultado);
		Resultado.setColumns(10);
		
		JButton btnNewButton = new JButton("C");
		btnNewButton.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText("");
			}
		});
		btnNewButton.setBounds(24, 23, 44, 39);
		panel.add(btnNewButton);
		
		JButton btnNewButton_1 = new JButton("/");
		btnNewButton_1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(Resultado.getText());
				signo="/";
				Resultado.setText("");
			}
		});
		btnNewButton_1.setBounds(122, 59, 44, 39);
		panel.add(btnNewButton_1);
		
		JButton btnX = new JButton("X");
		btnX.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(Resultado.getText());
				signo="*";
				Resultado.setText("");
			}
		});
		btnX.setBounds(183, 59, 71, 39);
		panel.add(btnX);
		
		JButton btnNewButton_3 = new JButton("-");
		btnNewButton_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(Resultado.getText());
				signo="-";
				Resultado.setText("");
			}
		});
		btnNewButton_3.setBounds(24, 108, 73, 39);
		panel.add(btnNewButton_3);
		
		JButton btnNewButton_7 = new JButton("7");
		btnNewButton_7.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+"7");
			}
		});
		btnNewButton_7.setBounds(76, 202, 44, 39);
		panel.add(btnNewButton_7);
		
		JButton btnNewButton_8 = new JButton("8");
		btnNewButton_8.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+"8");
			}
		});
		btnNewButton_8.setBounds(219, 202, 44, 39);
		panel.add(btnNewButton_8);
		
		JButton btnNewButton_9 = new JButton("9");
		btnNewButton_9.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+"9");
			}
		});
		btnNewButton_9.setBounds(0, 59, 44, 39);
		panel.add(btnNewButton_9);
		
		JButton btnNewButton_Suma = new JButton("+");
		btnNewButton_Suma.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num1=Integer.parseInt(Resultado.getText());
				signo="+";
				Resultado.setText("");
			}
		});
		btnNewButton_Suma.setBounds(207, 113, 56, 39);
		panel.add(btnNewButton_Suma);
		
		JButton btnNewButton_5 = new JButton("4");
		btnNewButton_5.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+"4");
			}
		});
		btnNewButton_5.setBounds(99, 23, 44, 39);
		panel.add(btnNewButton_5);
		
		JButton btnNewButton_1_2 = new JButton("5");
		btnNewButton_1_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+"5");
			}
		});
		btnNewButton_1_2.setBounds(111, 108, 73, 39);
		panel.add(btnNewButton_1_2);
		
		JButton btnNewButton_2_2 = new JButton("6");
		btnNewButton_2_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+"6");
			}
		});
		btnNewButton_2_2.setBounds(68, 59, 44, 39);
		panel.add(btnNewButton_2_2);
		
		JButton btnNewButton_6 = new JButton("1");
		btnNewButton_6.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+"1");
			}
		});
		btnNewButton_6.setBounds(10, 202, 44, 39);
		panel.add(btnNewButton_6);
		
		JButton btnNewButton_1_3 = new JButton("2");
		btnNewButton_1_3.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+"2");
			}
		});
		btnNewButton_1_3.setBounds(153, 23, 44, 39);
		panel.add(btnNewButton_1_3);
		
		JButton btnNewButton_2 = new JButton("3");
		btnNewButton_2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+"3");
			}
		});
		btnNewButton_2.setBounds(143, 201, 44, 39);
		panel.add(btnNewButton_2);
		
		JButton btnNewButton_1_4 = new JButton("0");
		btnNewButton_1_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				Resultado.setText(Resultado.getText()+"0");
			}
		});
		btnNewButton_1_4.setBounds(10, 252, 186, 39);
		panel.add(btnNewButton_1_4);
		
		JButton btnNewButton_3_4 = new JButton("=");
		btnNewButton_3_4.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				num2=Integer.parseInt(Resultado.getText());
				
				switch (signo) {
				case "+":
					Resultado.setText(Integer.toString(num1+num2));
					break;
				case "-":
					Resultado.setText(Integer.toString(num1-num2));
					break;
				case "*":
					Resultado.setText(Integer.toString(num1*num2));
					break;	
				case "/":
					Resultado.setText(Integer.toString(num1/num2));
					break;	
				default:
					Resultado.setText("ERROR");
					break;
				}
			}
		});
		btnNewButton_3_4.setBounds(207, 250, 64, 51);
		panel.add(btnNewButton_3_4);
		
		JLabel lblNewLabel = new JLabel("Si funciona, no lo toques");
		lblNewLabel.setBounds(10, 0, 263, 13);
		panel.add(lblNewLabel);
	}
}