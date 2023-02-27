package Kidusass2;

import java.util.Random;
import java.util.Scanner;

public class Assignmnet2 {

	public static void main(String[] args) {
		Random random = new Random();
		Scanner scanner =  new Scanner(System.in);
		boolean haswon = false;
		int playerguess = 0;
		
		
		
		int numberToGuess = random.nextInt(100)+1;
		
		
		while (playerguess<5) {
		System.out.println("Guess (1-100):");
		int playerguess1 =  scanner.nextInt();
		
		
		if (playerguess1 < 1 || playerguess1 > 100) {
		System.out.println("please pick anumber between 1 to 100:");
		}else  if (playerguess1 < numberToGuess) {
			System.out.println("L! higher");
			playerguess++;
			}
		
		
	
		else if (playerguess1 > numberToGuess) {
			System.out.println("L! lower");
			playerguess++;

			}
		
		else {
			haswon = true;
			break;
			}
		
	
		}
			if (haswon) {
				System.out.println("W! you go it");
				
				
			}else { System.out.println("L!");
				System.out.println("maximu attempt reached! Number was : " + numberToGuess);
			
	}
			
		scanner.close()	;	
				
			}
}	

		
		
		


	
		
		


