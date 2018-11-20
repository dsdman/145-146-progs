package classAndMethods;

public class houseofCats {

	public static void main(String[] args) {
		Cat mrFlufferkins; //declares  object
		if (mrFlufferkins == null)
		{
			
		}
		//This crashes program mrFlufferkins.setName("Mr.flufferkins"); 
		
		mrFlufferkins = new Cat(); //initializes object
		mrFlufferkins.setName("Mr.flufferkins");
		//mrFlufferkins.setWeight(50);
		
		Cat roscoe = new Cat();
		roscoe.setName("Roscoe");
		roscoe.setWeight(15);
		
		//alternative without any classes
		String nameMrFlufferKins = "Mr. Flufferkins";
		double weightMrFlufflerkins;
		int numberofLegsMrFlufferkins;
		
		String nameRoscoe = "roscoe";
		double weightRoscoe = 15;
		
	}

}
