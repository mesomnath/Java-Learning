package javaBasics.forLoops;

public class DecrementalNumberRightAlign {
    /*
    4321
    321
    21
    1
     */
    public static void main(String args[]){
        int n = 4;
        for(int i = n; i >0 ; i--){
            for(int j = i; j > 0; j-- ){
                System.out.print(j);
            }
            System.out.println();
        }

    }
}
