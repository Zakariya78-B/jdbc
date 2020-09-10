package test;
import java.util.ArrayList;
public class exo {
public static void candidateOutputList( ArrayList<String> testlist ){

		        // parcourez chaque élément de l'ArrayList et affichez le suivi par un retour chariot
		        for(int i = 0;i<testlist.size();i++){
		            System.out.println(testlist.get(i));
		        }
		        for(String i: testlist) {System.out.println(i);}
		        	
		        
				/*----------NE MODIFIEZ PAS LE CODE AU DESSUS DE CETTE LIGNE, IL SERA REINITIALISE LORS DE l'EXECUTION----------*/
		  
		        
		          
				/*----------NE MODIFIEZ PAS LE CODE EN DESSOUS DE CETTE LIGNE, IL SERA REINITIALISE LORS DE l'EXECUTION----------*/
		    };
	public static void main(String[] args) {
		ArrayList<String> zak= new ArrayList<String>();
		zak.add("bob");
		zak.add("marley");
		candidateOutputList(zak);
		 
	}

}
