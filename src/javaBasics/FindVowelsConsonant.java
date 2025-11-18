package javaBasics;
/*
*
* Find vowels and consonant from given text
*  String somnath
* vowel : 2
* consonant : 5
 */

import java.util.HashMap;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class FindVowelsConsonant {
    public static HashMap<String, Integer> findVowelsConsonant(String value){
        int vowel = 0, consonant = 0;
        String comingValue = null;
        Pattern pattern = Pattern.compile("[a-z]");
        Matcher match = pattern.matcher(value);
        while (match.find()){
             comingValue = match.group()+ " ";
        }
        System.out.println(comingValue);
        for(int i = 0; i < comingValue.toLowerCase().length(); i ++){
            char ch = value.charAt(i);
            if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u' ){
                vowel = vowel+1;
            }else {
                consonant = consonant+1;
            }
        }
        HashMap<String, Integer> values = new HashMap<>();
        values.put("vowel", vowel);
        values.put("consonant", consonant);
        return values;
    }
    public static void main (String args[]){

        String givenInput = "somnath Sah";
        HashMap output = findVowelsConsonant(givenInput);
        System.out.println("Vowel Count: " + output.get("vowel"));
        System.out.println("Consonant Count: " + output.get("consonant"));

    }
}
