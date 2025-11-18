package javaBasics.forLoops;

public class LeftStarPattern {
    /*
     ****
      ***
       **
        *
     */

    public static void main(String args[]){
        for(int i = 4; i > 0; i--){
            for(int j = 1; j<i+1; j++){
                System.out.print("*");
            }
            System.out.println();
            for(int j = i-1; j<4; j++){
                System.out.print(" ");
            }
        }
    }
}
