package javaBasics.forLoops;

public class StarPattern {
    /*

     *
     **
     ***
     ****

     */

    public static void main(String args[]){
        int n = 9;
        for(int i = 0; i < n; i++){
            for(int j = 0; j < i+1; j++) {
                System.out.print("* ");
            }
            System.out.println();
        }

    }
}
