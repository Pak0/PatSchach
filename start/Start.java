package start;

import design.Spielflaeche;
import figuren.FigurWeiss;

public class Start {
public static void main(String[] args) {
	Spielflaeche newFlaeche = new Spielflaeche();
	newFlaeche.setVisible(true);
	FigurWeiss.weissDarfZiehen = true;
	
	
}
}
