package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");
		String userName = inputUser.nextLine();
		
		inputUser.close();
		
		String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		for (int index = 0; index < invitati.length; index++) {
			
		   if (userName == invitati[index]) {
			  System.out.println("Complimenti sei stato invitato al party!");  
           } else {
        	  System.out.println("Mi dispiace non sei stato invitato al party");
           }
	
	}

  }
	
}