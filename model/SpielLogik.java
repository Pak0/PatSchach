package model;

import design.Spielflaeche;


public class SpielLogik {


	private static String startFigur = null;
	private static String endFigur = null;
	private static int aktX;
	private static int aktY;
	private static int neuX;
	private static int neuY;
	
	
	public static void meineLogik(String logik, int x, int y){
			
		switch (logik) {
		case "BauerW":
			System.out.println("Ich bin ein weiﬂer Bauer! (Test Methode: meineLogik in Klasse SpielLogik.");
			startFigur = "BauerW";
			aktX = x;
			aktY = y;
			System.out.println(aktX + " " + aktY);
		break;
		
		//leeres Feld angeklickt, Logik wird abgerufen
		case "leer":
			if (startFigur == null) {
				System.out.println("Bitte eine Figur ausw‰hlen!");	
			
		//Figurenlogik	
			} else if(startFigur == "BauerW") {
				neuX = x;
				neuY = y;
				System.out.println("Test");
				if (aktX == 6 & neuX == 5 ) {
					System.out.println("erfolgreich");
					Spielflaeche.fld[neuX][neuY].add(Spielflaeche.wBd2);
				} else {

				}
			}
			
		break;

		default:
			System.out.println("Figur undefiniert");
			break;
		}
		

	}
}
