/**
 * Created by alexandraqin on 4/14/15.
 */
public class Methods {


    public static void main(String[] args) {
//      System.out.println(calculateSquareRoot(120));
//
//      System.out.println(toLowerCase("BIGLY"));

        //  System.out.println(isMultiple(2, 3));

        //prettyInteger(6);

        System.out.println(random(5, 60));


    }

    // 1. Calculate Square
    public static int calculateSquare(int input) {
        int numSquared = input * input;
        return numSquared;
    }

    // 2. Calculate Square Root
    public static int calculateSquareRoot(int input) {
        int numSquareRt = (int) Math.floor(Math.sqrt(input));
        return numSquareRt;
    }


    //3. toLowerCase
    public static String toLowerCase(String input) {
        String lowerCase = input.toLowerCase();
        return lowerCase;
    }


    //4. isMultiple
    public static boolean isMultiple(int num1, int num2) {
        if (num2 % num1 == 0) {
            return true;
        } else {
            return false;
        }
    }


    //5. Pretty Integer
    public static void prettyInteger(int num) {
        String prettyNum = " ";

        for (int i = 1; i <= num; i++) {
            prettyNum += "*";
        }

        prettyNum += (" " + num + " ");

        for (int i = 1; i <= num; i++) {
            prettyNum += "*";
        }

        System.out.println(prettyNum);
    }


    //6. Random
    public static int random(int min, int max) {
        Random rand = new Random();
        int range = max - min + 1;
        int randomNum = rand.nextInt(range) + min;
        return randomNum;
    }


}
