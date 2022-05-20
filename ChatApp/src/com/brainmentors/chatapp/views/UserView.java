package com.brainmentors.chatapp.views;

import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;

public class UserView extends JFrame {
	int counter;
	public UserView() {
		counter = 0;
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(800,500);
//		setLocation(400, 100);
		setLocationRelativeTo(null);
		setResizable(false);
		setTitle("My Chat App...");
		
		JLabel titleLabel = new JLabel("Welcome to Chat App");
		titleLabel.setFont(new Font("Arial", Font.BOLD, 40));
		titleLabel.setBounds(200,20,450,100);
		
		JLabel counterLabel = new JLabel("0");
		counterLabel.setFont(new Font("Arial", Font.BOLD, 20));
		counterLabel.setBounds(450,120,150,40);
		
		JButton button = new JButton("Login...");
		button.setFont(new Font("Arial", Font.BOLD, 30));
		button.addActionListener(new ActionListener() {
			
			@Override
			public void actionPerformed(ActionEvent e) {
				counter++;
				counterLabel.setText("Count : " + counter);
			}
		});
		button.setBounds(200,120,200,50);
		
		Container container = this.getContentPane();
		container.setLayout(null);
		container.add(titleLabel);
		container.add(button);
		container.add(counterLabel);
		
		setVisible(true);
	}

	public static void main(String[] args) {
		UserView obj = new UserView();
	}

}
