import java.util.ArrayList;

class Question{
String enonce;
String reponse;
String valeurV;

public  String getValeurV() {
	return valeurV;
}

public void setValeurV(String valeurV) {
	this.valeurV = valeurV;
}
int difficulte=50; // la difficulte varie de 0 à 100


Question(String e){
this.enonce = e;
}

void setDifficulte(int d){
this.difficulte = d;
}

int getDifficulte(){
return this.difficulte;
}

String getEnonce(){
return this.enonce;
}

String getReponse(){
return this.reponse;
}

public void afficheQuestion()

{
	System.out.println(enonce);
}
public void afficheReponse(String tab)

{
	System.out.println(tab);
	
	
}
 public boolean valeurdeV(String rep) {
	 if(valeurV.equals(rep) ) return true;
	 else return false;
 }
}