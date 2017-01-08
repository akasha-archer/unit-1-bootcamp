/**
 * Created by alexandraqin on 4/14/15.
 */
public class Loops {

  public static void main (String args[]) {

  }



    /*
    Exercises
1. Write a method that prints the numbers 1 through 10 using a loop.
2. Write a method that prints the numbers 1 through 10 using a different kind of loop.
3. Write a method that takes in an int n and prints the numbers 1 through n.
     */

  public static void oneToTen() {
    for (int i = 1; i <= 10; i++) {
      System.out.println(i);
    }
  }


  public static void oneToTen2() {
    int num = 1;
    while (num < 11) {
      System.out.println(num);
      num++;
    }
  }

  public static void oneToN(int n) {
    for (int i = 1; i <= n; i++) {
      System.out.println(i);
    }
  }


/*
4. Write a method that takes in an int n and prints the even numbers 2 through n.
5. Write a method that prints the sum of 1 through 10 using a loop.
6. Write a method that takes in an int n and prints the sum of the numbers 1 through n using a loop.
7. Use the method you wrote in part 6 to print the sum of the numbers from 1 through 10000.
 */


  public static void twoToN(int n) {
    for (int i = 2; i <= n; i += 2) {
      System.out.println(i);
    }
  }

  public static void sumToTen() {
    int sum = 0;
    for (int i = 1; i <= 10; i++) {
      sum += i;
    }
    System.out.println(sum);
  }


  public static void sumToN(int n) {
    int sum = 0;
    for (int i = 1; i <= n; i++) {
      sum += n;
    }
    System.out.println(sum);
  }



/*
8. Write a method that takes in an int n and a String s and prints out s on its own line, n times.
If n is negative, print "".
9. Modify the method to print out the string concatenated with itself n times.
10. Write a method that prints the first ten Fibonnaci numbers.
11. Modify the method to sum the first ten Fibonnaci numbers.
12. Modify the method to take in an int n and sum the first n Fibonnaci numbers.
 */


  public static void printString(int n, String s) {
    if (n < 0) {
      System.out.println(" \"\" ");
    }
    for (int i = 1; i <= n; i++) {
      System.out.print(s + " ");
    }
  }

  public static void firstTenFib() {
    int fibOne = 0;
    int fibTwo = 1;
    int fibVal;

    for (int i = 0; i <= 10; i++) {
      fibVal = fibOne + fibTwo;
      fibOne = fibTwo;
      fibTwo = fibVal;
      System.out.println(fibVal);

    }

  }

  public static void sumFirstTenFib() {
    int fibOne = 0;
    int fibTwo = 1;
    int fibVal;
    int sum = 0;

    for (int i = 0; i <= 10; i++) {
      fibVal = fibOne + fibTwo;
      fibOne = fibTwo;
      fibTwo = fibVal;
      sum += fibVal;
    }
    System.out.println(sum);
  }

  public static void sumFirstNFib(int n) {
    int fibOne = 0;
    int fibTwo = 1;
    int fibVal;
    int sum = 0;

    for (int i = 0; i <= n; i++) {
      fibVal = fibOne + fibTwo;
      fibOne = fibTwo;
      fibTwo = fibVal;
      sum += fibVal;
    }
    System.out.println(sum);
  }

    /*
    1. sumNumbers

Given a string, return the sum of the numbers appearing in the string, ignoring all other characters.
A number is a series of 1 or more digit chars in a row. (Note: Character.isDigit(char) tests if a char is one
of the chars '0', '1', .. '9'. Integer.parseInt(string) converts a string to an int.)
     */

  public static int sumNumbers(String input) {
    String numString = " ";
    int sum = 0;
    for (int i = 0; i < input.length(); i++) {
      if (Character.isDigit(input.charAt(i))) {
        numString += input.charAt(i) + " ";
        System.out.println(numString);
//              int num = input.charAt(i);
//              sum += num;
      }
    }

    return sum;
  }



    /*
    5. Digits
Use nested for loops to generate a list of all the positive two digit numbers.
Display the numbers, and the sums of their digits.

10, 1+0 = 1
11, 1+1 = 2
12, 1+2 = 3
     */

  public static void twoDigitSum() {

    for (int i = 10; i < 100; i++) {
      int digit1 = i / 10;
      int digit2 = i % 10;
      int sum = digit1 + digit2;
      System.out.println(i + ", " + digit1 + " + " + digit2 + " = " + sum);
    }
  }





}
