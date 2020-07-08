import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> tabQ = new ArrayList<>();
		ArrayList<String> tabV = new ArrayList<>();
		ArrayList<String> tabR = new ArrayList<>();
		ArrayList<String> tabD = new ArrayList<>();
		
		// question une
		tabQ.add("5+5=?");
		tabV.add("10");
		tabR.add("4, 10, 36");
		tabD.add("1");
		
		// question deux
		tabQ.add("54+5=?");
		tabV.add("59");
		tabR.add("59, 10, 36");
		tabD.add("2");
		
		// question trois
		tabQ.add("5*5=25");
		tabV.add("25");
		tabR.add("63, 25, 36, 69, 21");
		tabD.add("3");
		
		// question quatre
		tabQ.add("Quel est la capitale de la France ?");
		tabV.add("paris");
		tabR.add("paname, paris, 75");
		tabD.add("5");
		
		double res = 0;
		
for (int i=0;i<tabQ.size();i++) {
	 	
		Question q = new Question(tabQ.get(i));
		q.afficheQuestion();
		q.afficheReponse(tabR.get(i));
		q.setValeurV(tabV.get(i));
		System.out.println("mets ta réponse frère");
		Scanner scanner = new Scanner(System.in);
		String reponse = scanner.nextLine();
		System.out.println(q.valeurdeV(reponse));
		
		res = res + Double.parseDouble(tabD.get(i));
}

		System.out.println(res/tabD.size());

	}

}
