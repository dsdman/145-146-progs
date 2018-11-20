/**
 * Dylan Desai and Kevin Liriani
 */
public class appleTester {
  
  
  public static void main(String[] args) { 
    //create the first apple and set its values
    Apple red = new Apple();
    red.setName("Red Delicious");
    red.setWeight(0.5);
    red.setPrice(0.80);
    String apple1 = red.toString(red);
    System.out.println(apple1);
    
    System.out.println();
    
    //create the second apple and set its values
    Apple gala = new Apple();
    gala.setName("Gala");
    gala.setWeight(0.75);
    gala.setPrice(0.25);
    String apple2 = gala.toString(gala);
    System.out.println(apple2);
    
    System.out.println();
    
    //create the third apple and set its values
    Apple pineapple = new Apple();
    pineapple.setName("Abacaxi");
    pineapple.setWeight(8.2);
    pineapple.setPrice(4);
    String apple3 = pineapple.toString(pineapple);
    System.out.println(apple3);
    
    
    
  }
  
  /* ADD YOUR CODE HERE */
  
}
