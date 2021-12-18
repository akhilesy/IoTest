package com.project.three;

public class Validator {
	
	
	public static  String animalType(int animalId) {
		
		if(animalId >= 3000 && animalId <= 7999) {
			return "pet";
		}
		else if (animalId >= 8000 && animalId <=9999) {
			return "ZooAnimal";
		}
		else if (animalId >= 1000 && animalId <=2999) {
			return "Animal";
		}
		else {
		return "invalid animal type";
		}
	}
	
	

}
