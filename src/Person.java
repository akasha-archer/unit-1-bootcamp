public class Person {
  private String name;
  private String phoneNumber;
  private String city;

  public Person() {
  }

  public Person(String name) {
    this.name = name;
  }

  public String getCity() {
    return city;
  }

  public void setCity(String city) {
    this.city = city;
  }

  public String getPhoneNumber() {
    return phoneNumber;
  }

  public void setPhoneNumber(String phoneNumber) {
    this.phoneNumber = phoneNumber;
  }

  public String getName() {
    return name;
  }

  public void setName(String name) {
    this.name = name;
  }


  public boolean isFromLondon (String input) {

    if (input.equals("London")) {
      return true;
    } else {
      return false;
    }
  }


  public static void printName(Person person) {
    if (person.getName().length() > 5) {
      System.out.println("Name is " + person.getName());
    } else {
      System.out.println("Name is too short");
    }
  }

  public static void main(String[] args) {
    Person londonGirl = new Person("Layla-Rose");
    System.out.println(londonGirl.isFromLondon("Paris"));

    printName(londonGirl);
  }


}