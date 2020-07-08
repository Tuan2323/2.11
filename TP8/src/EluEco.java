import java.util.ArrayList;

public class EluEco extends Elu implements interfaceElu {

	ArrayList<Assistant> tabEco;
	
	
	public EluEco(String nom, String prenom) {
		super(nom, prenom);
	}

	
	//Implementation des 3 méthodes abstraites de l'interface
		public void licencier(Assistant ass) {
			tabEco.remove(0);
		}


		public void embaucher(Assistant ass) {
			tabEco.add(ass);
		}



		public void verser(int montant) {
		
			int smic = 1480;
			int res = montant / smic;
			
			double economies = 0;
			
			if (res > tabEco.size()) {
				economies = montant - (smic* tabEco.size());
				for (int i=0;i<tabEco.size();i++) {
					tabEco.get(i).addSous(smic);
					System.out.println(tabEco.get(i).compteBancaire);	
				}
			} else {
				int res2 = montant / tabEco.size();
				
				for (int i=0;i<tabEco.size();i++) {
					tabEco.get(i).addSous(res);
					System.out.println(tabEco.get(i).compteBancaire);
				}
			}
			
			System.out.println("Les eocnomies sont de "+economies);
			
		}

		
		
}
