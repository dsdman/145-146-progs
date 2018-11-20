/*
 * Dylan Desai
 */
package sortingLaundry;

public class Dresser {
	private Clothing [][] Clothes;
	
	//constructor: default
	public Dresser()
	{
		this.Clothes = new Clothing [5][10];
	}
	
	//methods
	public void add(Clothing aClothes)
	{
		int i = 0;  //number for which drawer
		int j = 0;  //variable for which item of clothing (limit is 10)
		boolean full = false;
		
		//determine i
		switch (aClothes.getType())
		{
		case Bottom:
			i = 3;
			break;
		case Cape:
			i = 4;
			break;
		case Socks:
			i = 1;
			break;
		case Stockings:
			i = 1;
			break;
		case Top:
			i = 2;
			break;
		case Undergarmet:
			i = 0;
			break;
		}
		
		//determine j
		for (int x = 0; x < 10; x++)
		{
			//if clothes is null at position (i, x), then j must be x
			if (this.Clothes[i][x] == null)
			{
				j = x;
			}
			
			//checks for full drawer
			if(x == 0 && this.Clothes[i][x] != null)
			{
				full = true;
			}
		}
		
		//add aClothes to the appropriate spot
		if (!full)
		{
			this.Clothes[i][j] = aClothes;
		}
		else
		{
			System.out.println("The drawer is full.");
		}
				
				
	}
	public void remove(Clothing aClothes)
	{
		boolean removed = false; //checks if something was removed or not
		
		//remove if aClothes equals this.clothes at position (i,j) and something wasn't removed yet
		for (int i = 0; i < 5 && !removed; i++)
		{
			for (int j = 0; j < 10 && !removed; j++)
			{
				if (this.Clothes[i][j] != null && this.Clothes[i][j].equals(aClothes))
				{
					this.Clothes[i][j] = null;
					removed = true;
				}
			}
		}
	}
	
	public void print()
	{
		for (int i = 0; i < 5; i++)
		{
			System.out.println("\nDrawer " + i);
			for (int j = 0; j < 10; j++)
			{
				//print the thing if it isn't null
				if (this.Clothes[i][j] != null)
				{
					System.out.println(this.Clothes[i][j].toString());
					
				}
			}
		}
		
	}
}
