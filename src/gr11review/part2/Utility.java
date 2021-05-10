package gr11review.part2;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class Utility {

    //Method 1

    public static String zipZap(String str){
        //replace middle word using .replaceAll
        str = str.replaceAll("zip","zp")
        .replaceAll("zap","zp").replaceAll("zop","zp");
        return str;
    }

    //FileIO1

    public static String longestWord(String filenametxt) throws FileNotFoundException {
        //initialize variables
        String wordCurrent = "";
        String wordLongest = "";
        //setup scanner and create file
        Scanner scanner = new Scanner (new File (filenametxt));
            while(scanner.hasNext()) {
                wordCurrent = scanner.next();
                if (wordCurrent.length() > wordLongest.length()) {
                    wordCurrent = wordLongest;
                }
            }

        return wordLongest;
    }

      public static int[] tenRun(int[] nums){
        // 2,10,3,20,2 ---> 2, 10, 10, 20, 2

        for(int i = 0; i< nums.length - 1; i++){
            //checking if the number is a multiple of 10
            if (nums[i] % 10 == 0) {
                //checking if the next element is not a multiple of 10
                if (nums[i+1] % 10 != 0) {
                    //if this is true, we set the next element to nums[i]
                    nums[i+1] = nums[i];
                }
            }

    }
        return nums;

    }

  //Array 3
    //Completed by Amaan
    public static boolean linearIn(int[] outer, int[] inner) {
        //initialize variables
        int j = 0;
        int i = 0;
        int counter = 0;
        while(i < outer.length && j < inner.length){ 
            if(outer[i] == inner[j]) {
                counter++;
                i++;
                j++;
            } else {
                i++;
            }
        }
        
        return (counter == inner.length);
    }
}
