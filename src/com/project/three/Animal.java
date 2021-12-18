package com.project.three;

public class Animal {

	private int animalId;
	private String animalType;
	private double weight;
	
	
	
	
	public int getAnimalId() {
		return animalId;
	}


	public void setAnimalId(int animalId) {
		this.animalId = animalId;
	}


	public String getAnimalType() {
		return animalType;
	}


	public void setAnimalType(String animalType) throws Exception {
if (animalType.length()>=3) {
			
			this.animalType = animalType;
			
			}
			else
			{
				throw new Exception("invalid animal type "+animalType);
			}
	}


	public double getWeight() {
		return weight;
	}


	public void setWeight(double weight) {
		this.weight = weight;
	}


	public Animal(int animalId, String animalType, double weight) throws Exception {
		super();
		
		this.animalId = animalId;
		if (animalType.length()>=3) {
			
			this.animalType = animalType;
			
			}
			else
			{
				throw new Exception("invalid animal type "+animalType);
			}
		this.weight = weight;
	}


	/*
	 * public Animal() { // TODO Auto-generated constructor stub }
	 */


	public Animal() {
		// TODO Auto-generated constructor stub
	}


	@Override
	public String toString() {
		return "Animal [animalId=" + animalId + ", animalType=" + animalType + ", weight=" + weight + "]";
	}
	
	
}
