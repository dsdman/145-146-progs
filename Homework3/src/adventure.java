//Written by Dylan Desai

import java.util.Scanner;
public class adventure {

	public static void main(String[] args) {
		/*
		 * ALL OF THE OBJECTS AND VARIABLES ARE GOING HERE!!1
		 */
		Scanner input = new Scanner(System.in);
		String choice;
		int rebelNumber;
			
		//The adventure
		System.out.println("Welcome to the land of Dogfart!!\nYou are a thief who got caught during one of your hiests.\n"
				+ "You have been arrested for the theft of 2 million gold. \n"
				+ "The trial beings now! Do you plead guilty or not guilty?\n"
				+ "(enter guilty, not guilty)");
		choice = input.nextLine();
		
		//choice 1 (uses string comparison)
		if(choice.equalsIgnoreCase("guilty"))
		{
			System.out.println("You are sentenced to life in the maximum security prison, located in the capital of Dogfart with no parole!\n");
			System.out.println("You are now in jail.\n"
					+ "Will you start a rebellious movement, dig a tunnel, or rot in prison?\n"
					+ "(enter rebel, dig, rot)\n");
			choice = input.nextLine();
			
			//Choice 2
			if (choice.equalsIgnoreCase("rebel"))
			{
				System.out.println("How many people will you recruit for your rebellion? "
						+ "(enter whole number from 0-9)\n");
				choice  = input.nextLine();
				rebelNumber = Integer.parseInt(choice);
				
				
				//Choice 3 branch 1 (uses number comparison and a compound boolean expression)
			    if (rebelNumber > 4 && rebelNumber < 10)
			    {
			    	System.out.println("You gather up " + rebelNumber +" of the strongest inmates in your block in the following weeks, having the charisma and wits to do so.\n"
			    			+ "After conspiring with these inmates, you decide to make your move in the morning.\n"
			    			+ "When all the prison cells in your block open for inspection next morning, you signal your group for action.\n"
			    			+ "The nearby guards are no match for you and your friends, and you overpower them easily.\n"
			    			+ "You take a guard's weapon, beat him to a pulp, and continue mauling down the other guards in your prison block\n"
			    			+ "After releasing and arming your fellow inmates, a riot ensues, and you make a break for the exit\n"
			    			+ "As you approach the exit to the prison, you see the prison warden.\n"
			    			+ "The warden, furious, yells \"What the **** is going on to my prison!? I'll kill all of y'all right now!!\"\n"
			    			+ "\nHow will you get past the warden? Will you fight the warden, or use your thief skills to sneak past him?\n"
			    			+ "(enter fight, sneak)\n");
			    	choice = input.nextLine();
			    	//choice 4 branch 1 and ending 5
			    	if (choice.equalsIgnoreCase("fight"))
			    	{
			    		System.out.println("You draw your weapon and approach the warden. The warden welcomes the fight.\n"
			    				+ "For the next 5 minutes, you and the Warden brawl it out. You manage to break his ankle and nose, but pretty soon\n"
			    				+ "Your luck ends, and your weapon breaks. The warden slashes at you repeatedly, eventually slashing right through your heart.\n"
			    				+ "You callapse on the ground, now in pieces. The warden stares at your giblets, exclaiming \"Victory is mine!!!!!\" \n"
			    				+ "The end!");
			    	}
			    	//ending 7
			    	else if (choice.equalsIgnoreCase("sneak"))
			    	{
			    		System.out.println("You creep to the shadows carefully and stay there, keeping an eye on the warden, who is cursing for his guards. After a while, the warden's 10 guards show up.\n"
			    				+ "Very soon after this, a group of rioting prisoners run up to the warden and his guards, and the two groups begin dueling each other.\n"
			    				+ "You sieze this oppurtanity to sneak past all of them, and manage to do so very easily. You find a shattered window next to the locked down exit\n"
			    				+ "and jump through it swiftly to safety.\n"
			    				+ "\nYou are free at last, and return to your life as a master thief. The rest of your jobs and hiests execute cleanly without a hitch.\n"
			    				+ "You retire as one of the wealthiest men in the land of Dogfart, content to have escaped from prison unharmed.\n"
			    				+ "The end!");
			    	}
			    }
			    //ending 3
			    else if (rebelNumber >=0 && rebelNumber <=4)
			    {
			    	System.out.println("After gathering up and conspiring with " + rebelNumber + " inmates, you decide to make your move in the morning.\n"
			    			+ "When all the prison cells in your block open for inspection next morning, you signal your group for action.\n"
			    			+ "You and your friends are no match for the prison guards, however, and you quickly surrender.\n"
			    			+ "The warden executes you and your group, then feeds the corpses to the dogs.\n"
			    			+ "The end!");
			    }
			    else
			    {
			    	System.out.println("nope!");
			    	System.exit(0);
			    }
				
			}
			else if(choice.equalsIgnoreCase("dig"))
			{
				System.out.println("What will you dig with? A spoon, or your hands?\n"
						+ "(enter spoon, hands)\n");
				choice = input.nextLine();
				//Choice 3 branch 2
				if (choice.equalsIgnoreCase("spoon"))
				{
					System.out.println("You take a spoon from the chow hall and begin digging, covering up the hole in the wall\n"
							+ "With a poster (very original). After several months of digging, your tunnel leads\n"
							+ "into the local sewer. You smell the foulest scent as you apporach the sewer. Do you dare venture into the\nsewer without a gas mask?\nEnter (yes, no)\n");
					choice = input.nextLine();
					//Choice 4 branch 2 and ending 6
					if (choice.equalsIgnoreCase("yes"))
					{
						System.out.println("You muster up the courage to crawl into the sewer pipe, at first not bothered by the scent.\n"
								+ "After a while, however, the putrid scent is too much for you, and you throw up. The narrow\n"
								+ "sewer pipe starts to fill with your vomit, and eventually you drown and suffocate in your own vomit.\n"
								+ "The end!");
					}
					else if(choice.equalsIgnoreCase("no"))
					{
						System.out.println("You retreat to your cell. Over the next week, you create a makeshift gas mask\n"
								+ "Using scraps and other junk in the prison. After this is done, you return to the sewer, gasmask in hand.\n"
								+ "You crawl through the narrow pipe, and after a couple of hours, you find light on the other side.\n"
								+ "As you scan the exit, you see a group of mutated talking rats hanging out near the exit to the sewer.\n"
								+ "One of the rats notices you and says \"Aye! You're in our domain now, mate. If you wish to leave, then\n"
								+ "you must answer this here riddle that goes like this: What has a head and a tail, but no body?\"\n"
								+ "Enter (my ex, a coin, a snake)");
						choice = input.nextLine();
						//choice 5 and endings 8 and 9 (This uses another string comparison)
						if(choice.equalsIgnoreCase("my ex") || choice.equalsIgnoreCase("a snake"))
						{
							System.out.println("\"That be a good guess, but not the right answer, mate. Me and me mates will have to eat ye now.\"\n"
									+ "The rats begin biting you with their sharp fangs, and soon you find yourself in the bowels of their stomachs.\n"
									+ "The end!");
						}
						else if(choice.equalsIgnoreCase("a coin"))
						{
							System.out.println("\"Aye, that be the answer. You may leave our turf now, mate!\"\n"
									+ "\nYou are free at last, and return to your life as a master thief. The rest of your jobs and hiests execute cleanly without a hitch.\n"
			    				+ "You retire as one of the wealthiest men in the land of Dogfart, content to have escaped from prison unharmed.\n"
			    				+ "The end!");
						}
						
					}
				}
				//ending 4
				else if (choice.equalsIgnoreCase("hands"))
				{
					System.out.println("You begin digging with your hands, making little progress. After a while, your hands are in pain and you feel\n"
							+ "your hands going numb. Your hands begin bleeding internally and externally from the several dozen cuts inflicted by digging.\n"
							+ "Shortly thereafter, you die because of blood loss and your stupidity.\n"
							+ "The end!");
				}
				
			}
			//ending 2
			else if(choice.equalsIgnoreCase("rot"))
			{
				System.out.println("You decide to live out the rest your life in jail, accepting your fate as the wanna-be master thief that never was.\n"
						+ "Dont drop the soap now!");
			}
			
		}
		//ending 1
		else if(choice.equalsIgnoreCase("not guilty"))
		{
			System.out.println("The court realizes that you're lying and hangs you\n"
					+ "in the town square as an example to all who dare\n"
					+ "lie in the holy court of Dogfart.\n"
					+ "The end!");
		}
		
	}

}
