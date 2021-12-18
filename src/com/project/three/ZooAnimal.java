package com.project.three;

public class ZooAnimal extends Animal {

	private int cageNumber;
	private String trainer;

	public int getCageNumber() {
		return cageNumber;
	}

	// check the value of cageNumber if >1 then print invalid
	public void setCageNumber(int cageNumber) throws Exception {
		if (cageNumber >= 1) {
			this.cageNumber = cageNumber;
		} else {
			throw new Exception("Please provide valid cage Number" + cageNumber);
		}
	}

	public String getTrainer() {
		return trainer;
	}

	public void setTrainer(String trainer) throws Exception {

		if (trainer.length() >= 3) {
			this.trainer = trainer;
		} else {
			throw new Exception("invalid trainer " + trainer);
		}
	}

//ToString method to print all the details of animal and ZooAnimal classes
	@Override
	public String toString() {
		return "ZooAnimal [cageNumber=" + cageNumber + ", trainer=" + trainer + ", AnimalId=" + getAnimalId()
				+ ", AnimalType=" + getAnimalType() + ", Weight=" + getWeight() + "]";
	}
	// Constructor set the value in animal and ZooAnimal classes

	public ZooAnimal(int animalId, String animalType, double weight, int cageNumber, String trainer) throws Exception {
		super(animalId, animalType, weight);

		if (cageNumber >= 1) {
			this.cageNumber = cageNumber;
		} else {
			throw new Exception("Please provide valid cage Number" + cageNumber);
		}
		if (trainer.length() >= 3) {
			this.trainer = trainer;
		} else {
			throw new Exception("invalid trainer " + trainer);
		}
	}

	public ZooAnimal() {
		// TODO Auto-generated constructor stub
	}

}
