import java.util.ArrayList;

public class EluEscroc extends Elu implements interfaceElu {

	ArrayList<Assistant> tabEscroc;
	int compteSuisse = 0;	

	public EluEscroc(String nom, String prenom) {
		super(nom, prenom);
	}

	//Implementation des 3 méthodes abstraites de l'interface
			public void licencier(Assistant ass) {
				tabEscroc.remove(0);
			}


			public void embaucher(Assistant ass) {
				tabEscroc.add(ass);
			}

			public void verser(int montant) {
			
				int smic = 1480;
				int res = montant / smic;
				
				int economies = 0;
				
				if (res > tabEscroc.size()) {
					economies = montant - (smic* tabEscroc.size());
					for (int i=0;i<tabEscroc.size();i++) {
						tabEscroc.get(i).addSous(smic);
						System.out.println(tabEscroc.get(i).compteBancaire);	
					}
				} else {
					int res2 = montant / tabEscroc.size();
					
					for (int i=0;i<tabEscroc.size();i++) {
						tabEscroc.get(i).addSous(res);
						System.out.println(tabEscroc.get(i).compteBancaire);
					}
				}
				
				this.compteSuisse = this.compteSuisse+economies;
			}

			
			public void addEscroqueries() {
				
				System.out.println("Vous avez ajouté "+this.compteSuisse);
			}
			
			
			

}
