package juego;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyAdapter;
import java.awt.event.KeyEvent;
import javax.swing.ImageIcon;
import javax.swing.JPanel;
import javax.swing.Timer;

import objetos.*;




public class Escenario extends JPanel implements ActionListener{
	
	private Image fondo;
	private Personajes mario;
	private Bloques bloque1, suelo;
	private Timer timer;
	private final int DELAY=10;
	
	public Escenario(){
		
		iescenario();
	}
	
	public void iescenario(){
		
		cargarfondo();
		addKeyListener(new TAdapter());
		setFocusable(true);
		setPreferredSize(new Dimension(700, 525));
		mario=new Personajes();
		bloque1=new Bloques();
		suelo=new Bloques();
		
		timer=new Timer(DELAY,this);
		timer.start();
	}
	
	public void cargarfondo(){
		
		ImageIcon f=new ImageIcon("C:/Users/David/workspace/Mario/bin/img/fondojuego.jpg");
		fondo=f.getImage();
	}
	
	@Override
	public void paintComponent(Graphics g){
		
		super.paintComponent(g);
		doDrawing(g);
		Toolkit.getDefaultToolkit().sync();
		g.drawRect(bloque1.damex11(),bloque1.damey11(), 102, 44);
		g.drawRect(mario.damex(), mario.damey(), 23, 35);
	}
	
	
	
	private void doDrawing(Graphics g){
		
		Graphics2D g2d=(Graphics2D)g;
		
		
		g.drawImage(fondo, 0, 0, null);
		g2d.drawImage(mario.damePer(), mario.damex(), mario.damey(), null);
		g2d.drawImage(bloque1.dameB1(), bloque1.damex11(), bloque1.damey11(), null);
		g2d.drawImage(suelo.dameS(), suelo.damexs(), suelo.dameys(), null);
		
		
		
	}

	@Override
	public void actionPerformed(ActionEvent arg0) {
		mario.move();
		bloque1.move();
		repaint();
		
	}
	
	private class TAdapter extends KeyAdapter{
		
		@Override
		public void keyReleased(KeyEvent e){
			mario.keyReleased(e);
		}
		@Override
		public void keyPressed(KeyEvent e){
			mario.keyPressed(e);
		}
	}


}
