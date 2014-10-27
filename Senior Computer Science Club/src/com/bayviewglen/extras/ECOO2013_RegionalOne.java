package com.bayviewglen.extras;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class ECOO2013_RegionalOne {

	public static void main(String[] args) throws FileNotFoundException {
		Scanner scanner = new Scanner(new File("data/DATA10.txt"));

		int numLate = 0;
		int leftToServe = 0;
		
		int currentTicket = Integer.parseInt(scanner.nextLine());		// I have the # 23
		boolean done = false;
		
		while(!done){
			String s = scanner.nextLine();	// s is one of the options
			if (s.trim().equals("EOF")){
				done = true;
			}else if (s.trim().equals("TAKE")){
				numLate++;	// adds one
				currentTicket++;
				leftToServe++;
				if (currentTicket == 1000)
					currentTicket = 1;
			}else if (s.trim().equals("SERVE")){
				leftToServe--;
			}else{
				System.out.println(numLate + " " + leftToServe + " " + currentTicket);
				numLate = 0;
				leftToServe = 0;
			}
		}
	}

}
