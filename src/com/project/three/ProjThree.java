package com.project.three;

import java.io.PrintWriter;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class ProjThree {

	
	public static void main(String [] args) throws Exception {
		Animal animal= new Animal();
		Validator validator =new Validator();
		Pet pet = new Pet();
		ZooAnimal zanimal= new ZooAnimal();
		ProjThree prj=new ProjThree();
		

		
		//setting the value in Animal valiables
		/*
		 * animal.setAnimalId(101); animal.setAnimalType("abc"); animal.setWeight(5);
		 * 
		 * 
		 * System.out.println(animal);
		 */
		
		//setting the value in pet classes
		
		/*
		 * pet.setAnimalId(101); pet.setAnimalType("villager"); pet.setName("dog");
		 * pet.setOwner("akhilesh"); pet.setWeight(17);
		 * 
		 * System.out.println(pet);
		 */
	
		//settin the value in ZooAnimal classes
		
		/*
		 * zanimal.setAnimalId(8000);
		 * zanimal.setAnimalType(validator.animalType(zanimal.getAnimalId()));
		 * zanimal.setCageNumber(302); zanimal.setTrainer("Atul");
		 * zanimal.setWeight(15);
		 * 
		 * System.out.println(zanimal);
		 */
		int animalId = 0;
		String animalType = null;
		double weight = 0;
		String name = null;
		String Owner = null;
		int cageNumber = 0;
	    String trainer = null;
	    
	    List<Pet> petlist=new ArrayList();
		List<ZooAnimal> zooanimal=new ArrayList<ZooAnimal>();
		
		Scanner sc =new Scanner(System.in);
		System.out.println("inter input below");
		int input=1;
		int count =1;
		do {
		try {
			
			System.out.print("Enter Animal id ");  
			animalId=sc.nextInt(); 
		
		System.out.print("Enter Animal weight ");  
		weight=sc.nextDouble(); 
		
		System.out.print("Enter Animal name ");  
		name=sc.next(); 
		
		System.out.print("Enter Animal Owner name ");  
		Owner=sc.next();
			
		System.out.print("Enter Zoo cageNumber ");  
		cageNumber=sc.nextInt();
		
		System.out.print("Enter Animal trainer name ");  
		trainer=sc.next();
		String animalTyp=validator.animalType(animalId);
	
		
		System.out.print("Enter '1' if you have another record "); 
		input=sc.nextInt(); 
		count++;
		
	
		
	
		
		  petlist.add(new Pet(animalId,animalTyp, weight, name,
		  Owner));
		  System.out.println(petlist);
		  
		  
		  
		  
		  /*zooanimal.add(new ZooAnimal(animalId,animalTyp, weight, cageNumber,
		 * trainer)); System.out.println(petlist+" "+zooanimal);
		 */
		
		
		/*
		 * pet.setAnimalId(animalId);
		 * pet.setAnimalType(validator.animalType(pet.getAnimalId()));
		 * pet.setName(name); pet.setOwner(Owner); pet.setWeight(weight);
		 * zanimal.setCageNumber(cageNumber); zanimal.setTrainer(trainer);
		 */
		
		
			
		
		
		}
		catch(Exception e)
		{
			System.out.println("please provide valid input"+animalId+""+animalType+""+name+""+trainer+""+weight);
		}
		}

		while(input==1);
		
		System.out.println();
		
		/*
		 * pet.setAnimalId(animalId);
		 * pet.setAnimalType(validator.animalType(pet.getAnimalId()));
		 * pet.setName(name); pet.setOwner(Owner); pet.setWeight(weight);
		 * zanimal.setCageNumber(cageNumber); zanimal.setTrainer(trainer);
		 * 
		 * System.out.println("print count value===="+count); List petlist=new
		 * ArrayList<Pet>(); List zooanimal=new ArrayList<ZooAnimal>(); for(int
		 * i=0;i<=count;i++) { petlist.add(pet); zooanimal.add(zanimal);
		 * 
		 * }
		 */
		
		
		
		
		//System.out.println(petlist+" "+zooanimal);
		
	
		/*
		 * PrintWriter out = new PrintWriter("animalout.txt"); // Step 2
		 * out.println(petlist); out.println(zooanimal); out.close();
		 */
	
	
	
		
		
	
		
	}
}
