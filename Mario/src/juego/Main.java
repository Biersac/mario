package juego;

import java.awt.EventQueue;

import javax.swing.JFrame;





public class Main extends JFrame {
	
	public Main(){
		
		iniciar();
		
	}
	
	private void iniciar(){
		add(new Escenario());
		
		pack();
		
		setSize(700,560);
		setTitle("Mario Bros");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setLocationRelativeTo(null);
		
	}

	public static void main(String[] args) {

		EventQueue.invokeLater(new Runnable() {
			@Override
			public void run(){
				Main ex= new Main();
				ex.setVisible(true);
			}
		});

	}

}
