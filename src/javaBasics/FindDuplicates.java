package javaBasics;

public class FindDuplicates {

    public static  void main (String[] args) {
        String value = "i love some java program with Some  concept ";
        String[] charArray = value.trim().toLowerCase().split(" ");
        int count = 0;
        String match = null;

        for (int i = 0; i < charArray.length; i ++){
//            System.out.println(charArray[i]);

            for(int j =i+1; j<charArray.length; j++){
                if(charArray[i].equals(charArray[j])){
                    match = charArray[i];
                    count++;
                    break;
                }
            }

        }
        System.out.println(match);
        System.out.println(count);

    }

}
