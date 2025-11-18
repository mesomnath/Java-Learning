package javaBasics.forLoops;

public class DecrementalTreeWithDigit {
    /*
    1234567
     12345
      123
       1
     */
    public static void main(String args[]){
        int n = 5;
        for(int i = n; i > 0; i--){
            for(int j = 1; j <= (2*i-1) ; j++){
                System.out.print(j);
            }
            System.out.println();
            for(int j = i; j <= n; j++){
                System.out.print(" ");
            }
        }

    }
}
