/*
 * Written by Dylan Desai
 */
public class FruitTester {

	public static void main(String[] args) {
		//variables
		Fruit apple = new Fruit("Apple",0.5);
		Fruit orange = new Fruit ("Orange",0.8);
		Fruit apple2 = new Fruit("Apple",0.5);
		Fruit apple3 = new Fruit("Apple",0.8);
		
		//test equals
		if (apple.equals(apple2))
			System.out.println("They are equal");
		else
			System.out.println("This shouldn't print");
		
		//test comparison
		if (apple.compareTo(apple3) < 0)
			System.out.println("apple is less than apple3");
		else
			System.out.println("This shouldn't print");
		
		//test tostring
		System.out.println(orange.toString());
	}

}
