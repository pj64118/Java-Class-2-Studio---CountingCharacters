package org.launchcode.java.studios.countingcharacters;

import java.util.HashMap;
import java.util.Map;

public class Studio3 {

    public static void main(String[] args) {

        String saying = "If the product of two terms is zero then common sense says at least one of the" +
                " two terms has to be zero to start with. So if you move all the terms over to one side, " +
                "you can put the quadratics into a form that can be factored allowing that side of the " +
                "equation to equal zero. Once you’ve done that, it’s pretty straightforward from there.";
        HashMap<Character, Integer> letters = new HashMap<>();

       for (int i=0; i<saying.length(); i++) {
           char lowerCaseChar = saying.toLowerCase().charAt(i);
           if (letters.containsKey(lowerCaseChar)) {
               int count = letters.get(lowerCaseChar) + 1;
               letters.put(lowerCaseChar, count);
           } else {
               letters.put(lowerCaseChar, 1);
           }
       }

       System.out.println("Character frequency in the string (combining upper with lowercase characters):");
       for (Map.Entry<Character, Integer> letter : letters.entrySet()) {
           System.out.println(letter.getKey() + ":" + letter.getValue());
       }
    }

}
