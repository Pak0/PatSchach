package figuren;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseAdapter;
import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import javax.swing.JPanel;

import controller.Maus;

public class Figuren extends JPanel {
	
	private JPanel [][] aktuellePos;
	
	public Figuren(){
		this.setPreferredSize(new Dimension(90,90));
		this.setOpaque(false);
		
		
//		this.addMouseListener(new Maus(){@Override
//			public void mouseClicked(MouseEvent e) {
//			System.out.println("mouseClick, implementierung Figuren");		
//				}});
	}

	


}

