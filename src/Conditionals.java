/**
 * Created by alexandraqin on 4/14/15.
 */
public class Conditionals {

  public static void main (String args[]) {

    //Person.java questions completed in Person.java Class

  }

  // 1. isOdd
  public boolean isOdd(int num) {
    if (num % 2 == 0) {
      return false;
    } else {
      return true;
    }
  }


  // 2. isMultipleOfThree
  public boolean isMultipleOfThree(int num) {
    if (num % 3 == 0) {
      return false;
    } else {
      return true;
    }
  }


  // 3. isOddAndIsMultipleOfThree
  public boolean isOddAndIsMultipleOfThree(int num) {
    if (isOdd(num) && isMultipleOfThree(num)) {
      return true;
    } else {
      return false;
    }
  }


  // 4. isOddAndIsMultipleOfThree2
  public boolean isOddAndIsMultipleOfThree2(int num) {
    if (num % 3 == 0 && num % 2 != 0) {
      return true;
    } else {
      return false;
    }
  }

  // 5. fizzMultipleOfThree
  public static void fizzMultipleOfThree(int num) {
    if (num % 3 == 0) {
      System.out.println("Fizz");
      ;
    } else {
      System.out.println(num);
    }
  }




}
