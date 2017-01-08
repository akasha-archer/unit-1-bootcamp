/**
 * Created by alexandraqin on 4/14/15.
 */
public class DataStructures {


    /*
1. Cool Cats Pt. II
Create an ArrayList of 5 Cats.
Use a loop to print the contents of each object in the ArrayList.
     */

    public static void main(String[] args) {

        List<Cat> catList = new ArrayList<>();
        catList.add(new Cat("Garfield"));
        catList.add(new Cat("Kitty"));
        catList.add(new Cat("Muffy"));
        catList.add(new Cat("Tabby"));
        catList.add(new Cat("Monica"));

        for (int i = 0; i < catList.size(); i++) {
            System.out.println(catList.get(i));
        }

        for (Cat cats : catList) {
            System.out.println(cats);
        }


        /*
        3. Pod HashMap
Create a HashMap that maps the names of all the Access Coders in your Pod to their age.
Use a loop to print each key-value pair of the HashMap.
         */

        Map<String, Integer> myPod = new HashMap<>();

        myPod.put("Akasha", 19);
        myPod.put("Cue", 23);
        myPod.put("Lily", 24);
        myPod.put("Eddie", 32);
        myPod.put("Derek", 21);
        myPod.put("Jose", 36);


        // TO DO print each key-value pair


        List<String> words = new ArrayList<>();
        words.add("a");
        words.add("bb");
        words.add("b");
        words.add("ccc");

        //  System.out.println(wordsWithoutList((ArrayList<String>) words, 3)
        //  );


        ArrayList<Integer> clumps = new ArrayList<>();
        clumps.add(0);
        clumps.add(4);
        clumps.add(7);
        clumps.add(3);
        clumps.add(5);
        clumps.add(5);

        System.out.println(countClumps(clumps));


//
        ArrayList<Integer> freq = new ArrayList<>();
        freq.add(5);
        freq.add(2);
        freq.add(5);
        freq.add(5);
        freq.add(1);
        freq.add(6);

        System.out.println(mostFrequentElement(freq));

    }



       /*
        2. Most Frequent Element
Write a method called mostFrequentElement that takes an ArrayList of Integers and finds the most frequently occurring element in the ArrayList.
At the end print the element and its number of occurrences. If there is more than one such element, any one of them may be printed.
         */

    public static String mostFrequentElement(ArrayList<Integer> input) {
        int count = 0;
        int tempCount;
        int temp;
        int mostFrequent = input.get(0);

        for (int i = 0; i < (input.size() - 1); i++) {
            temp = input.get(i);
            tempCount = 0;
            for (int j = 0; j < input.size(); j++) {
                if (temp == input.get(j)) {
                    tempCount++;
                }

                if (tempCount > count) {
                    mostFrequent = temp;
                    count = tempCount;
                }
            }
        }
        String result = mostFrequent + " appears " + count + " times.";
        return result;
    }



/*
4. canRentACar
Write a method called canRentACar that takes the Pod HashMap as a parameter and returns whether or not the Pod can rent a car.
If one or more studetns is over 25, it should return true. If no one in the Pod is over 25, it should return false.
 */

//public static boolean canRentACar(){
//
//
//     for(Map.Entry<String, Integer> e : myPod.entrySet()) {
//        String key = e.getKey();
//        String value = e.getValue();
//    }
//
//    }

    /*
    5. wordsWithoutList
Given an array of strings and an integer, write a method that return a an ArrayList where all the
strings of the given length are omitted.
     */


    public static ArrayList wordsWithoutList(ArrayList<String> input, int num) {
        for (int i = 0; i < input.size(); i++) {
            if (input.get(i).length() == num) {
                input.remove(i);
            }
        }
        return input;
    }



    /*
    6. How many clumps?
Say that a "clump" in an ArrayList is a series of 2 or more adjacent elements of the same value. Write a method that returns
the number of clumps in the given ArrayList.

{5, 4, 7, 3, 5, 5}
     */


    public static int countClumps(ArrayList<Integer> input) {
        int clumpCount = 0;
        int temp;
        for (int i = 0; i < (input.size() - 1); i++) {
            temp = input.get(i);
            System.out.println("I am i " + i);
            if (temp == input.get(i + 1)) {
                clumpCount++;
                System.out.println("count plus");
            }
        }
        return clumpCount;
    }


}
