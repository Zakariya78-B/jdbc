package test;

import java.util.Scanner;

public class algo {

	public static void main(String[] args) {
		Scanner reader = new Scanner(System.in);
		System.out.println("Entrez un nombre reel : ");
		double x = reader.nextDouble();
		double y = reader.nextDouble();
		double z = reader.nextDouble();
		double w = reader.nextDouble();
		
		double moy = (x+y+z+w)/4;
		System.out.println("votre moyenne est "+ moy);
		
		
		

	}

}
