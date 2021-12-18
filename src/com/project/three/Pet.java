package com.project.three;

public class Pet extends Animal {

	/*
	 * public Pet(int animalId, String animalType, double weight) { super(animalId,
	 * animalType, weight); // TODO Auto-generated constructor stub }
	 */
	private String name;
	private String Owner;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		if (name.length() >= 3) {
			this.name = name;
		} else {
			System.out.println("name invalid ");
		}

	}

	public String getOwner() {
		return Owner;
	}

	public void setOwner(String Owner) throws Exception {
		if (Owner.length() >= 3) {

			this.Owner = Owner;

		} else {
			throw new Exception("invalid animal type "+Owner);
		}

	}
	
	

	public Pet(int animalId, String animalType, double weight, String name, String owner) throws Exception {
		super(animalId, animalType, weight);
		this.name = name;
		if (Owner.length() >= 3) {

			this.Owner = Owner;

		} else {
			throw new Exception("invalid animal type "+Owner);
		}
	}

	public Pet() {
		// TODO Auto-generated constructor stub
	}

	@Override
	public String toString() {
		return "Pet [name=" + name + ", Owner=" + Owner + ", AnimalId()=" + getAnimalId() + ", AnimalType()="
				+ getAnimalType() + ", Weight()=" + getWeight() + "]";
	}



	

}
