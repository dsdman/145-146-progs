
public class StringHelperTester {
	public static void main(String[] args)
	{
		//test whether mesh method works
		String testMesh = StringHelper.meshStrings("harp", "fiddle");
		System.out.println("Testing mesh strings: " + testMesh);
		
		//test whether oodle method works
		String testOodle = StringHelper.replaceVowelsWithOodle("burrito");
		System.out.println("Testing replace vowels with oodle: " + testOodle);
		
		//test whether weight method works
		System.out.println("Testing String's weight: " + StringHelper.weight("burrito"));
		
	}
}
