package controller;

import java.awt.event.MouseEvent;
import java.awt.event.MouseListener;

import model.SpielLogik;

public class Maus implements MouseListener{
	private String whoAmI = "leer";
	private int x;
	private int y;
	
	public Maus(String p, int x, int y){
	
	// Parameterübergabe
	whoAmI = p;	
	this.x = x;
	this.y = y;
	}
	
	public Maus(int newX, int newY){
		this.x = newX;
		this.y = newY;
	}
	
	@Override
	public void mouseClicked(MouseEvent e) {
		System.out.println("Maus wurde geklickt!");
		
		switch (whoAmI) {
		case "BauerW":
			System.out.println("Weißer Bauer gewählt!");
			System.out.println(x);
			System.out.println(y);
			SpielLogik.meineLogik("BauerW", x, y);
			break;
			
		case "leer":
			System.out.println("leeres Feld angeklickt!");
			System.out.println(x);
			System.out.println(y);
			SpielLogik.meineLogik("leer", x, y);
		default:
			break;
		}
		
	
	}

	@Override
	public void mousePressed(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseReleased(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseEntered(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void mouseExited(MouseEvent e) {
		// TODO Auto-generated method stub
		
	}

}
