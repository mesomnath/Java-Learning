package javaBasics.forLoops;

public class SameNumberDecrementalOrderRightAlign {
    /*
    4444
    333
    22
    1
     */
    public static void main(String args[]){

        int n =4;
        for(int i = n; i > 0; i --){
            for(int j = 0; j < i; j++){
                System.out.print(i);
            }
            System.out.println();
        }

    }
}
