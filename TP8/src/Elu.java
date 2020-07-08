import java.util.ArrayList;

public class Elu extends Personne implements interfaceElu {
	
	ArrayList<Assistant> tab;
	
public Elu(String nom,String prenom) {
	super(nom,prenom);
}

//implémentation des 3 méthodes abstraites de l'interface
public void licencier(Assistant ass) {
	tab.remove(0);
}


public void embaucher(Assistant ass) {
	tab.add(ass);
}


public void verser(int montant) {
	int res = montant / tab.size();
	
	for (int i=0;i<tab.size();i++) {
		tab.get(i).addSous(res);
		System.out.println(tab.get(i).compteBancaire);
	}
	
	
}



public static void main (String[] args) {
	Elu el = new Elu("Tuan","Abdou");
	Elu el2 = new Elu("Micka","Abdou");
	
	EluMafieu el3 = new EluMafieu("Micka","Abdou");
	EluMafieu el4 = new EluMafieu("Micka","Abdou");
	
	EluEco el5 = new EluEco("grger","ret");
	EluEco el6 = new EluEco("Micerteka","erte");
	
	EluEscroc el7 = new EluEscroc("sfdg","fgdg");
	EluEscroc el8 = new EluEscroc("fdgd","erte");
	
	Assistant as = new Assistant("Micka", "Ezdin");
	Assistant as2 = new Assistant("Micka", "Ezdin2");
	Assistant as3 = new Assistant("fgdg", "fgd");
	
	
	
	el.tab = new ArrayList<Assistant>();
	
	el.embaucher(as);
	el.embaucher(as2);
	el.verser(0);
	
	
	System.out.println("-----------------------------------------");
	
	
	el3.tabMafieu = new ArrayList<Assistant>();
	el3.embaucher(as);
	el3.embaucher(as2);
	el3.verser(0);
	
	
	System.out.println("-----------------------------------------");
	
	
	el5.tabEco = new ArrayList<Assistant>();
	el5.embaucher(as);
	el5.embaucher(as2);
	el5.embaucher(as3);
	el5.verser(0);
	
	
	System.out.println("-----------------------------------------");
	
	
	el7.tabEscroc = new ArrayList<Assistant>();
	el7.embaucher(as);
	el7.embaucher(as2);
	el7.embaucher(as3);
	el7.verser(10000);
	el7.addEscroqueries();
	
	
	
	
	
}

}
