package Dessin;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.Graphics;
import java.util.ArrayList;

import javax.swing.JPanel;

class IHMDessiner extends JPanel {
	private static final long serialVersionUID = 1L;
	private ArrayList<Segment2D> segments = new ArrayList<Segment2D>();

	IHMDessiner() {
		Delegue delegue = new Delegue(this);

		setPreferredSize(new Dimension(300, 300));
		setBackground(Color.WHITE);
		addMouseListener(delegue);  
		addMouseMotionListener(delegue); 
	}
	public ArrayList<Segment2D> getSegments() {
		return segments;
	}

	public void paintComponent(Graphics g) {
		super.paintComponent(g);
		for (Segment2D s : segments)  s.dessiner(g);
	}
}