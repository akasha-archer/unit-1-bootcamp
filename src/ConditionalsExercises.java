package nyc.c4q.akashaarcher;

/**
 * Created by akashaarcher on 12/27/16.
 */


public class ConditionalsExercises {

    public static void main(String[] args) {

    }

       /*
    1. Cigar Party

When squirrels get together for a party, they like to have cigars. A squirrel party is successful when the number
of cigars is between 40 and 60, inclusive. Unless it is the weekend, in which case there is no upper bound on the number of cigars.
Write a method called cigarParty that takes an int (the number of cigars) and boolean (whether or not it is the weekend) as parameters,
 and returns true if the party with the given values is successful, or false otherwise.
     */


    public static boolean cigarParty(int numCigars, boolean isWeekend) {
        if (numCigars >= 40 && numCigars <= 60) {
            return true;
        } else if (numCigars >= 40 && (isWeekend)) {
            return true;
        } else {
            return false;
        }
    }



       /*
       2. Caught Speeding
        */


    public static int caughtSpeeding(int speed, boolean myBirthday) {
        int result = 0;
        int minSpeed = 60;
        int midSpeed = 80;
        int maxSpeed = 81;
        int birthdaySpeed = speed + 5;

        if (speed <= minSpeed && myBirthday == false ){
            result = 0;
        } else if (speed > minSpeed && speed <= midSpeed && myBirthday == false) {
            result= 1;
        } else if (speed >= maxSpeed && myBirthday == false) {
            result = 2;
        } else if (birthdaySpeed <= minSpeed + 5 && myBirthday == true) {
            result = 0;
        } else if (birthdaySpeed <= midSpeed + 5 && myBirthday == true) {
            result= 1;
        } else if (birthdaySpeed <= maxSpeed && myBirthday == true) {
            result = 2;
        }

        return result;
    }


    //4. Lottery Ticket

     public static int lottery(int num1, int num2, int num3) {

       if (num1 == num2 && num2 == num3) {
         return 20;
       } else if (num1 != num2 && num1 != num3 && num2 != num3) {
         return 0;
       } else if (num1 == num2 || num1 == num3) {
         return 10;
       }
       return -1;
     }



    //5. BlackJack


     public static int blackJack(int num1, int num2) {
       int diff1 = 21 - num1;
       int diff2 = 21 - num2;

       if (diff1 < 0 && diff2 > 0) {
         return num2;
       } else if (diff2 < 0 && diff1 > 0) {
         return num1;
       }  else if (diff1 < 0 && diff2 < 0) {
         return 0;
       } else if (diff2 < diff1) {
         return num2;
       } else if (diff1 < diff2 ) {
         return num1;
       }
       return -1;
     }


    //6. Evenly Spaced

    public static boolean sameDiff(int num1, int num2, int num3) {
        int[] diffArray = {num1, num2, num3};
        Arrays.sort(diffArray);

        for(int i=0; i<diffArray.length; i++) {
            System.out.println(diffArray[i]);
        }
        System.out.println(" ");

        int diff1 = diffArray[1] - diffArray[0];
        int diff2 = diffArray[2] - diffArray[1];
        System.out.println("diff 1 is: " + diff1);
        System.out.println("diff 2 is: " + diff2);

        if (diff1 == diff2) {
            return true;
        } else {
            return false;
        }
         return false;
    }



}
