package fr.benab.projet1.creatMenu;

import fr.benab.projet1.gamer.GamerMachine;
import fr.benab.projet1.gamer.GamerMen;

public class Challenge implements GameMode{
	
	@Override
	public void gameMode() {
		
		GamerMen gamerMen = new GamerMen();
		GamerMachine gamerMachine = new GamerMachine();
		
		String reponse = null;
		int nbrEssai = 0;
		String combiDef = gamerMachine.combiSecret();
		String combAtt;
		
		while (nbrEssai < 5) {
			
			combAtt = gamerMen.proposition(reponse);
			reponse = "";
			System.out.println("Reponse avant traitement : " + reponse);
			
			int i = 0;
			while (i < combAtt.length()) {
				if (Integer.valueOf(combAtt.charAt(i)) > Integer.valueOf(combiDef.charAt(i))) {
					reponse += "-";
				}else if (Integer.valueOf(combAtt.charAt(i)) < Integer.valueOf(combiDef.charAt(i))) {
					reponse += "+";
				}else if(Integer.valueOf(combAtt.charAt(i)) == Integer.valueOf(combiDef.charAt(i))) {
					reponse += "=";
				}
				i++;
			}
			System.out.println("Reponse apres traitement " + reponse);
			System.out.println("Proposition : " + combiDef +" Reponse : " + reponse + " "+combAtt);
			nbrEssai++;
		}

	}
}