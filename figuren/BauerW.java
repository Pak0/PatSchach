package figuren;

import java.awt.Color;
import java.awt.Dimension;
import java.awt.event.MouseEvent;
import java.awt.image.BufferedImage;
import java.io.File;
import java.io.IOException;

import javax.imageio.ImageIO;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JPanel;

import model.SpielLogik;
import controller.Maus;


public class BauerW extends FigurWeiss {
	private BufferedImage myPicture = null;
	private JLabel picLabel;

	
	public BauerW(final int x, final int y){
		bildInit();
		logikInit();
		this.addMouseListener(new Maus("BauerW", x, y));

	}

	
	//Laden und einfügen des Spielfigur-Bildes
	public void bildInit(){
	try {
		myPicture = ImageIO.read(new File("../schach/Bilder/bauerWeiss.png"));
	} catch (IOException e) {
		e.printStackTrace();
		System.out.println(e);
	}//end try-catch
	
	picLabel = new JLabel(new ImageIcon(myPicture));
//	Dimension d = new Dimension(90, 90);
//	picLabel.setPreferredSize(d);
	this.add(picLabel);
	
}

	public void logikInit(){
		//noch LEER
	}//logikInit
}
