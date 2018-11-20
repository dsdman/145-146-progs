package classExample2;
import java.util.Random;
enum PetType {cat, dog, hamster, hedgehog, armadillo, turkey, owl, abomination};
public class Pet {
	private String name;
	private int age;
	private double weight;
	private PetType type;
	
	public Pet()//Default
	{
		this.name = "No name yet";
		this.age = 1;
		this.weight = 1.0;
		this.type = PetType.abomination;
	}
	public Pet(String aName, int AnAge, double aWeight, PetType aType) //parameterized
	{
		//write in mutators
		this.setName(aName);
		this.setAge(AnAge);
		this.setWeight(aWeight);
		this.setType(aType);
	}
	//Accessors and getters
	public String getName()
	{
		return this.name;
	}
	public int getAge()
	{
		return this.age;
	}
	public double getWeight()
	{
		return this.weight;
	}
	public PetType getType()
	{
		return this.type;
	}
	//mutators/setters
	public void setName(String aName)
	{
		this.name = aName;
	}
	public void setAge(int anAge)
	{
		if (anAge > 0)
		{
			this.age = anAge;
		}
	}
	public void setWeight(double aWeight)
	{
		if (aWeight > 0.0)
		{
			this.weight = aWeight;
		}
	}
	public void setType(PetType aType)
	{
		this.type = aType;
	}
	public String toString()
	{
		return this.name + " " + this.age + " " + this.weight + " " + this.type;
	}
	public boolean equals(Pet aPet)
	{
		return aPet !=null && this.name.equals(aPet.getName()) && this.age == aPet.getAge() && this.weight == aPet.getWeight() && this.type == aPet.getType();
	}
	//static methods
	public static Pet breed(Pet pet01, Pet pet02)
	{
		if (pet01 == null || pet02 == null)
		{
			return null;
		}
		
		if (pet01.getType() != pet02.getType())
		{
			System.out.println("This is not possible");
			return null;
		}
		else
		{
			return createNewPet(pet01.getType());
		}
	}
	public static Pet splice(Pet pet01, Pet pet02)
	{
		if (pet01 == null || pet02 == null)
		{
			return null;
		}
		if (pet01.getType() != pet02.getType())
		{
			System.out.println("You are committing a crime against nature!");
			System.out.println("You are creating a " +pet01.getType() + " " + pet02.getType());
			return createNewPet(PetType.abomination);
		}
		else
		{
			System.out.println("That's boring!");
			return createNewPet(PetType.abomination);
		}
	}
	public static Pet splice(Pet[] Pets)
	{
		if (Pets == null)
		{
			return null;
		}
		System.out.println("You are creating a super crime against nature!!!");
		System.out.print("A part ");
		/*for (int i = 0; i < Pets.length; i++)
		{
			if (Pets[i] != null)
			{
				System.out.print(Pets[i].getType());
			}
		}*/
		//for each version as the above
		for (Pet Pet: Pets)
		{
			if (Pet != null)
			{
				System.out.print(Pet.getType()+ " ");
			}
		}
		System.out.println();
		return createNewPet(PetType.abomination);
	}
	public static Pet createNewPet(PetType aType)
	{
		Pet newPet = new Pet();
		newPet.setType(aType);
		return newPet;
	}
	//main method
	public static void main(String[] args)
	{
		/*
		Pet pet01 = new Pet("Fluffy", 1, 1.0, PetType.abomination);
		Pet pet02 = new Pet("fluffy", 1, 1.0, PetType.abomination);
		Pet pet03 = new Pet();
		
		
		System.out.println(pet01);
		Pet pet04 = Pet.breed(pet01, pet02);*/
		Random r = new Random();
		Pet[] armFullOfPets = new Pet[5];
		for (int i = 0; i < armFullOfPets.length; i++)
		{
			int randNum = r.nextInt(PetType.values().length);
			armFullOfPets[i] = createNewPet(PetType.values()[randNum]);
			
		}
		Pet megaPet = splice(armFullOfPets);
	}
}
