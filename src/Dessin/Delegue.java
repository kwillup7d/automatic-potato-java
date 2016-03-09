package Dessin;

import java.awt.Color;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;
import java.awt.event.MouseMotionListener;
import java.util.Random;

public class Delegue implements MouseListener, MouseMotionListener {
	IHMDessiner ardoise;
	int x, y;
	Color c;
	Random rnd = new Random();

	public Delegue(IHMDessiner ardoise) {
		this.ardoise = ardoise;
	} 

	public void mousePressed(MouseEvent evt) {
		x = evt.getX();
		y = evt.getY();
		c = Color.getHSBColor(rnd.nextFloat(), rnd.nextFloat(), rnd.nextFloat());
	}	 

	public void mouseReleased(MouseEvent evt) {} 	  

	public void mouseClicked(MouseEvent evt) {}
	public void mouseEntered(MouseEvent evt) {}
	public void mouseExited(MouseEvent evt) {} 
 

	public void mouseDragged(MouseEvent evt) {
		int nouveauX = evt.getX(), nouveauY = evt.getY();
		Random rnd = new Random();
    	

		Segment2D s = new Segment2D(x , y, nouveauX, nouveauY,c);
		ardoise.getSegments().add(s);
		x = nouveauX;
		y = nouveauY;
		ardoise.repaint();
	} 

	public void mouseMoved(MouseEvent evt) {}
}