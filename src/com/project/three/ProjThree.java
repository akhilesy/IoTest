package com.project.three;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Scanner;

public class ProjThree {

	public static void main(String[] args) throws Exception {
		Animal animal = new Animal();
		/* Validator validator =new Validator(); */
		Pet pet = new Pet();
		ZooAnimal zanimal = new ZooAnimal();
		ProjThree prj = new ProjThree();

		int animalId = 0;
		String animalType = null;
		double weight = 0;
		String name = null;
		String Owner = null;
		int cageNumber = 0;
		String trainer = null;

		List<Pet> petlist = new ArrayList();
		List<ZooAnimal> zooanimal = new ArrayList<ZooAnimal>();

		Scanner sc = new Scanner(System.in);
		System.out.println("inter input below");
		int input = 1;
		int count = 0;
		String animalTyp = null;
		do {
			try {

				System.out.print("Enter Animal id ");
				animalId = sc.nextInt();

				System.out.print("Enter Animal weight ");
				weight = sc.nextDouble();

				System.out.print("Enter Animal name ");
				name = sc.next();

				System.out.print("Enter Animal Owner name ");
				Owner = sc.next();

				System.out.print("Enter Zoo cageNumber ");
				cageNumber = sc.nextInt();

				System.out.print("Enter Animal trainer name ");
				trainer = sc.next();
				animalTyp = Validator.animalType(animalId);

				System.out.print("Enter '1' if you have another record ");
				input = sc.nextInt();
				count++;
				petlist.add(new Pet(animalId, animalTyp, weight, name, Owner));
				zooanimal.add(new ZooAnimal(animalId, animalTyp, weight, cageNumber, trainer));
				//petlist.add(new Pet(animalId, animalTyp, weight, name, Owner));
			

				

			

			} catch (Exception e) {
				System.out.println("please provide valid input" + animalId + " " + animalTyp + " " + name + " "
						+ trainer + " " + weight);
			}
		}

		while (input == 1);

		System.out.println();
		/*
		 * petlist.add(new Pet(animalId, animalTyp, weight, name, Owner));
		 * zooanimal.add(new ZooAnimal(animalId, animalTyp, weight, cageNumber,
		 * trainer));
		 */
		System.out.println(petlist + " " + zooanimal);
		System.out.println();

		

		
		
		  PrintWriter out = new PrintWriter("animalout.txt"); // Step 2
		  out.println(petlist); 
		  out.println(zooanimal);
		  out.close();
		 

	}
}
