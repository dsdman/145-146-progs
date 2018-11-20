	/**
 * Written by Reed Chasteen and Charles Schneider and Dylan Desai.
 */

public class Person {

    private String name;
    private int age;
    private Person[] friends = new Person[10];

    //Default
    public Person() {
        this.name = "Default Defaulterson";
        this.age = 0;
    }
    //Constructor
    public Person(String aName, int anAge) {
        this.setName(aName);
        this.setAge(anAge);
    }

    //Accessors
    public String getName() {
        return this.name;
    }
    public int getAge() {
        return this.age;
    }

    //Mutators
    //TODO CHECK VALID VALUES????
    public void setName(String aName) {
        this.name = aName;
    }
    public void setAge(int anAge) {
        this.age = anAge;
    }

    //Methods
    public String toString() {
        return this.name+" "+this.age;
    }
    public boolean equals(Person aPerson) {
        return aPerson != null &&
                aPerson.getName() == this.name &&
                aPerson.getAge() == this.age;
    }
    public static Person createPerson(String aName, int anAge) {
        Person newPerson = new Person();
        newPerson.setName(aName);
        newPerson.setAge(anAge);
        return newPerson;
    }
    public void addFriend(Person aPerson) {
      //figure out value for i
        int i = 0;
        for (int x = 9; x >= 0; x--) {
            if (friends[x] == null) {
                i = x;
            }
        }
        
        //set friends to the value at i
        if (aPerson != null && friends[9] == null) {
            friends[i] = aPerson;
        } else {
            System.out.println("You have too many friends");
        }
    }
    public void addFriend(String aName, int anAge) {
      //figure out i
        int i = 0;
        for (int x = 9; x >= 0; x--) {
            if (friends[x] == null) {
             
                i = x;
         
            }
        }
        //System.out.println(i);
        //change the value of friends at i
        if (aName != null) {
            friends[i] = createPerson(aName, anAge);
           
        } 
    }
    public void addFriends(Person[] aPeople) {
      //figure out i
        int i = 0;
        for (int x = 0; x < friends.length; x++) {
            if (friends[x] == null && aPeople.length > i) {
              //add the parameter at i to friends
                friends[x] = aPeople[i];
                i++;
            }
            
        }

        if (aPeople[i] != null && friends[9] == null) {
            friends[i] = aPeople[i];
        } else {
            System.out.println("You have too many friends");
        }
    }
    public void removeFriend(Person aPerson) {
        for (int i = 0; i < friends.length; i++) {
            if (aPerson != null && friends[i] != null && friends[i].equals(aPerson)) {
                friends[i] = null;
            }
        }
    }
    public void printFriends() {
        for (int i = 0; i < friends.length; i++) {
            if (friends[i] != null) {
                System.out.println(friends[i].toString());
            }
        }
    }


    public static void main(String[] args) {

        System.out.println();
    }
}
