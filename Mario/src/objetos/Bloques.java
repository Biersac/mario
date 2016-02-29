package objetos;

import java.awt.*;

import javax.swing.ImageIcon;

public class Bloques implements Objetos{

	private Image bloque1;
	private Image suelo;
	private int[] x=new int[5];
	private int[] y=new int[5];
	private int[] v=new int[5];
	private int[] x2=new int[5];
	private int[] y2=new int[5];
	
	private boolean[] move=new boolean[5];
	Rectangle rbloque1=new Rectangle(191,354,102,44);
	
	
	
	public Bloques(){
		
		iBloques();
	}
	
	public void iBloques(){
		
		ImageIcon b1=new ImageIcon("C:/Users/David/workspace/Mario/bin/img/bloque1.png");
		ImageIcon s=new ImageIcon("C:/Users/David/workspace/Mario/bin/img/suelo.png");
		bloque1=b1.getImage();
		suelo=s.getImage();
		x[1]=191;
		y[1]=354;
		x2[1]=x[1]+102;
		y2[1]=y[1]+44;
		v[1]=10;
		x[0]=0;
		y[0]=481;
		v[0]=0;
	}
	
	public void move(){
		
		
		
	}
	
	
	public Image dameB1(){
		return bloque1;
	}
	public Rectangle drbloque1(){
		return rbloque1;
	}
	
	public Image dameS(){
		return suelo;
	}
	
	public int damex11(){
		return x[1];
	}
	public int damey11(){
		return y[1];
	}
	public int damex12(){
		return x2[1];
	}
	public int damey12(){
		return y2[1];
	}
	public int damexs(){
		return x[0];
	}
	public int dameys(){
		return y[0];
	}
	
	

	@Override
	public int coordenadas(int x, int y) {
		
		return this.x[0] + this.y[0];
	}
	
	@Override
	public int velocidad(int v) {
		
		return this.x[0] + this.y[0];
	}
	
	
	

	
	
}
