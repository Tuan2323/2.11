import java.util.ArrayList;

public class EluMafieu extends Elu implements interfaceElu {

	ArrayList<Assistant> tabMafieu;
	
	public EluMafieu(String nom, String prenom) {
		super(nom, prenom);
	}

	//Implementation des 3 m�thodes abstraites de l'interface
	public void licencier(Assistant ass) {
		tab.remove(0);
	}


	public void embaucher(Assistant ass) {
		
		if (nom.equals(ass.nom)) {
			tabMafieu.add(ass);
		} else {
			System.out.println("Vous n'�tes pas accept�, d�sol�");
		}
	}


	public void verser(int montant) {
		int res = montant / tabMafieu.size();
		
		for (int i=0;i<tabMafieu.size();i++) {
			tabMafieu.get(i).addSous(res);
			System.out.println(tabMafieu.get(i).compteBancaire);
		}
		
		System.out.println(tabMafieu);
		
	}

	
}
