package com.ferragnez.party;

import java.util.Scanner;

public class CheckGuest {

	public static void main(String[] args) {
		Scanner inputUser = new Scanner(System.in);
		
		System.out.println("Come ti chiami?");
		String userName = inputUser.nextLine();
		
		
		
		String[] invitati = {"Dua Lipa", "Paris Hilton", "Manuel Agnelli", "J-Ax", "Francesco Totti", "Ilary Blasi", "Bebe Vio", "Luis", "Pardis Zarei", "Martina Maccherone", "Rachel Zeilic"};
		
		boolean invitatiFesta = false;
		
		for (int index = 0; index < invitati.length; index++) {
			 if (userName.equals(invitati[index])) {
			   invitatiFesta = true;
			   break;
			 }
		}
			 
			 if (invitatiFesta == true) {
			  System.out.println("Complimenti sei stato invitato al party!"); 
             } else {
        	  System.out.println("Mi dispiace non sei stato invitato al party");
             }
			 
			 inputUser.close();
	}

  }
	
