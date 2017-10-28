package br.com.ui;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JTabbedPane;

public class JFrameApp extends JFrame {
	
	JButton cadastrar;
	
	public JFrameApp(){
		setTitle("Rotas Logisticas");
		
		cadastrar= new JButton("Cadastrar Rotas");
			
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(500, 500);
		setLocationRelativeTo( null );
		setResizable(true);
		setVisible(true);
	}
	
	
	public static void main(String[] args) {
		new JFrameApp();

	}

}
