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
    
