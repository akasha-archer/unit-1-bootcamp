/**
 * Created by alexandraqin on 4/14/15.
 */
public class ClassesAndObjects {

  /*
  1. Cool cats
  Create 3 cats named Garfield, Pink Panther, and Catwoman.
  Assign each of them a favorite food (Garfield's favorite food should be Lasagna).
  Assign each of them an age.
   */
  public static void main(String[] args) {
    Cat garfield = new Cat("Garfield");
    Cat pinkPanther = new Cat("Pink Panther");
    Cat catwoman = new Cat("Catwoman");

    garfield.setFavoriteFood("Lasagna");
    pinkPanther.setFavoriteFood("Meow Mix");
    catwoman.setFavoriteFood("Sardines");

    garfield.setAge(13);
    pinkPanther.setAge(4);
    catwoman.setAge(6);

    Person bob = new Person("Bob");

    adoption(garfield, bob);
    System.out.println(isFree(garfield));

  }


/*
2. isOlder
Write a method called isOlder that takes 2 Cats as parameters and returns whether or not the first Cat is older than the second.
ex: // if Garfield is 9 years old and Catwoman is 10 years old
    isOlder(garfield, catwoman) returns false
 */

  public static boolean isOlder(Cat cat1, Cat cat2) {
    if (cat1.getAge() > cat2.getAge()) {
      return true;
    } else {
      return false;
    }
  }



/*
3. Best Friends
Write a method called makeBestFriends that takes 2 Cats as parameters and sets both of their
favorite foods to the same thing.
 */

  public static void makeBestFriends(Cat cat1, Cat cat2) {
    String faveFood = "bacon";
    cat1.setFavoriteFood(faveFood);
    cat2.setFavoriteFood(faveFood);
  }


    /*
    4. Kitten
Write a method called makeKitten that takes 2 Cats as parameters and returns a new Cat with a name that
is the combination of the 2 parent Cats' names. The age of the new Cat should be 0.
ex: makeKitten(garfield, catwoman) returns a Cat named "GarfieldCatwoman" with age 0
     */


  public static Cat makeKitten(Cat cat1, Cat cat2) {
    String name = cat1.getName() + cat2.getName();
    Cat newCat = new Cat(name);
    newCat.setAge(0);
    return newCat;
  }

    /*
    5. Adoption
Write a method called adoption that takes 1 Cat and 1 Person as a paramater and sets the Cat's owner to be the Person.
ex: Person jon = Person('Jon');
    adoption(garfield, jon); // Jon is now Garfield's owner!
Hint: this method does not return anything!
Bonus Challenge
If the Cat's name is Catwoman, don't set the owner, but instead print: "Catwoman will never be anyone's pet!"
     */


  public static void adoption(Cat cat, Person person) {
    cat.setOwner(person);
    if (cat.getName().equals("Catwoman")) {
      System.out.println("Catwoman will never be anyone's pet!");
    } else {
      System.out.println(person.getName() + " is the owner of " + cat.getName());
    }
  }

/*
6. isFree
Write a method called isFree that checks whether or not a Cat has an owner.
ex: isFree(garfield) returns false
 */

  public static boolean isFree(Cat cat) {
    if (cat.getOwner() == null) {
      return true;
    } else {
      return false;
    }
  }


/*
7. isSibling
Write a method called isSibling that checks whether or not 2 Cats have the same owner.
 */

  public static boolean isSibling(Cat cat1, Cat cat2) {
    if (cat1.getOwner() == cat2.getOwner()) {
      return true;
    } else {
      return false;
    }
  }





}
