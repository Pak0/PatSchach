package design;

import java.awt.Color;

import javax.swing.JFrame;
import javax.swing.JPanel;

import net.miginfocom.swing.MigLayout;
import controller.Maus;
import figuren.BauerS;
import figuren.BauerW;
import figuren.SpringerS;
import figuren.SpringerW;
import figuren.TurmS;
import figuren.TurmW;

public class Spielflaeche extends JFrame{
	
	private JPanel mainPanel = new JPanel();
	public static JPanel[][] fld = null;
	
	
	//Figuren initialisierung
	//weiﬂe Figuren
	public static BauerW wBa2;
	public static BauerW wBb2;
	public static BauerW wBc2;
	public static BauerW wBd2;
	public static BauerW wBe2;
	public static BauerW wBf2;
	public static BauerW wBg2;
	public static BauerW wBh2;
	public static TurmW wTa1;
	public static TurmW wTh1;
	public static SpringerW wSb1;
	public static SpringerW wSg1;
	
	//schwarze Figuren
	private static BauerS sBa2;
	private static BauerS sBb2;
	private static BauerS sBc2;
	private static BauerS sBd2;
	private static BauerS sBe2;
	private static BauerS sBf2;
	private static BauerS sBg2;
	private static BauerS sBh2;
	private static TurmS sTa8;
	private static TurmS sTh8;
	private static SpringerS sSb8;
	private static SpringerS sSg8;
	
	
	//ctr
	public Spielflaeche(){
		brettInit();
		felderInit();
		figurenInit();
	}//end ctr
	
	//Spielbrett erstellen
	public void brettInit(){
		mainPanel.setLayout(new MigLayout());
		this.add(mainPanel);
		this.setSize(800, 800);
		this.setLocationRelativeTo(null);	
	}//end brettInit();
	
	//Spielfelder erstellen
	public void felderInit(){
		int x = 8, y=8;
		fld = new JPanel[x][y];
		
		for (int i = 0; i < x; i++) {
			for (int j = 0; j < y; j++) {
				fld[i][j] = new JPanel();
				fld[i][j].setLayout(new MigLayout());
				fld[i][j].addMouseListener(new Maus(i,j));
				
				if (j!=7) {
					mainPanel.add(fld[i][j],"w 90!, h 90!");
				} else {
					mainPanel.add(fld[i][j],"w 90!, h 90!, wrap");
				}// end if else
				
				if (((i+10)%2==0) &((j+10)%2==1) | ((i+10)%2==1) &((j+10)%2==0)) {
					fld[i][j].setBackground(Color.BLACK);
				} else {
					fld[i][j].setBackground(Color.WHITE);
				}// end if else
			} // end for
		} // end for
	}// end felderInit
	
	public void figurenInit(){
		int a = 6, b = 3;
		wBd2 = new BauerW(a,b);
		fld[a][b].add(wBd2);
	}
}