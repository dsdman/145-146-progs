/**
 * Written by Reed Chasteen and Charles Schneider and Dylan Desai.
 */

public class FriendlyPeople {

    public static void main(String[] args) {
        // TODO Auto-generated method stub
        System.out.println("Let's meet some friendly people");
        Person[] people =
                {
                        new Person("Tom Jones", 29),
                        new Person("Bob Jones", 40),
                        new Person("Alf Pererdur", 10),
                        new Person("Ripley Carver",20),
                        new Person("Britton Raven",47),
                        new Person("Joyce Elihu",93),
                        new Person("Kevin Jody",63),
                        new Person("Ben Jayce", 32),
                        new Person("Emerson Ezra",27),
                        new Person("Yorick Fearghal",44),
                        new Person("Kim Yori",23),
                        new Person("Sheldon Ambrose", 36),
                        new Person("Leonard Damion",33),
                        new Person("Agam Saburou", 53),
                        new Person("Webster Chaz", 46),
                        new Person("Carol Dudel", 31)
                };
        Person p1 = new Person("Dacre Casey", 29);
        System.out.println("Testing the initial person");
        System.out.println(p1.toString());
        System.out.println();


        System.out.println("Adding one friend");
        p1.addFriend(Person.createPerson("Wetzel Edmund", 62));
        p1.printFriends();
        System.out.println();

        System.out.println("Adding a new friend using the overloaded operator");
        p1.addFriend("Judith Katheryne", 32);
        p1.printFriends();
        System.out.println();

        System.out.println("Adding a group of friends that exceeds the number of friends.");
        p1.addFriends(people);
        p1.printFriends();
        System.out.println();

        System.out.println("Removing a friend "+people[0].toString());
        p1.removeFriend(people[0]);
        p1.printFriends();
        System.out.println();
        
        System.out.println("Removing more people");
        p1.removeFriend(people[3]);
        p1.removeFriend(people[5]);
        p1.printFriends();
        System.out.println();
        
        System.out.println("seeing if two people are the same");
        Person p2 = new Person("Donald Trump",70);
        Person p3 = new Person("Donald Trump", 70);
        System.out.println("Person 2's name and age: " + p2.getName() + " " + p2.getAge());
        System.out.println("Person 3's name and age: " + p3.getName() + " " + p3.getAge());
        boolean same = p2.equals(p3);
        System.out.println(same);
        if (same)
        {
        	System.out.println(p2.getName() + " " + p2.getAge() + " equals " + p3.getName() + " " + p3.getAge());
        }
       
        
    }

}
