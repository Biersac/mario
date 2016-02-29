package objetos;

import java.awt.*;
import java.awt.event.KeyEvent;

import javax.swing.ImageIcon;


public class Personajes implements Objetos{
	
	private int x,y,v,vh,w,h,x2,y2;
	private Image mario;
	private boolean caer;
	Bloques suelo=new Bloques();
	Bloques bloque1=new Bloques();
	Rectangle rmario=new Rectangle(x,y,w,h);
	
	
	
	public Personajes(){
		
		iPersonajes();
	}
	
	public void iPersonajes(){
		
		ImageIcon m=new ImageIcon("C:/Users/David/workspace/Mario/bin/img/mario1.png");
		mario=m.getImage();
		x=43;
		y=441;
		w=23;
		h=35;
		
		
	}
	
	public void move(){
		x+=v;
		y+=vh;
		x2=x+w;
		y2=y+h;
		
		if(y==suelo.dameys()-40 || (y2==bloque1.damey11()-4 && x-30>bloque1.damex11()-47 && x2+30<bloque1.damex12()+47)){
			
			vh=0;
		}else{
			vh=1;
		}
		
		if((x2-1==bloque1.damex11()-47 && y+1==bloque1.damey12()+47) || (x+1==bloque1.damex12() && y+1==bloque1.damey12()+47)){
			
			x2=bloque1.damex11();
		}
		
		if(y<bloque1.damey12() && x>bloque1.damex11()-22 && x2<bloque1.damex12()+22 && y2>bloque1.damey11()){
			y=bloque1.damey12();
		}
		System.out.println(x + "   " + y);
		
		
		
		
	}
	
	public Image damePer(){
		
		return mario;
	}
	
	public int damex(){
		return x;
	}
	
	public int damey(){
		return y;
	}
	
	public static void pausa(){ 
		try { 
		Thread.sleep(1000); 
		} catch (Exception ignored) {} 
		} 

	
	
	
	
	
	
	
	
	public void keyPressed(KeyEvent e){
		
		int key=e.getKeyCode();
		
		if(key==KeyEvent.VK_D){
			
			
			v=1;
		}
		
		if(key==KeyEvent.VK_A){
			
			
			v=-1;
		}
		
	
		if(key==KeyEvent.VK_W && (y==suelo.dameys()-40 || (y2==bloque1.damey11()-4 && x-30>bloque1.damex11()-47 && x2+30<bloque1.damex12()+47))){
			
			int s=0;
			while(s<100){
				
				y--;
				s++;
				
				
			}
			
		}
	
	}
	
	public void keyReleased(KeyEvent e){
		
		int key=e.getKeyCode();
		
		if(key==KeyEvent.VK_D){
			
			v=0;
			
		}
		
		if(key==KeyEvent.VK_A){
			
			v=0;
		}
		
		if(key==KeyEvent.VK_W){
			
			vh=0;
			
		}
		
		
		
		
	}

	@Override
	public int coordenadas(int x, int y) {
		
		return this.x + this.y;
	}
	
	@Override
	public int velocidad(int v) {
		
		return this.x + this.y;
	}
	
}
