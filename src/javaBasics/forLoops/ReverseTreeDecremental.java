package javaBasics.forLoops;

public class ReverseTreeDecremental {
    /*
    56789
     234
      1
     */
    public static void main(String args[]){
        int n =3;
        for(int i = n; i > 0 ; i--){
           for(int j = ((i-1)*(i-1) +1); j <= (i*i); j++){
                System.out.print(j);
            }
            System.out.println();
            for(int j = i; j <=n; j++){
                System.out.print(" ");
            }
        }
    }
}
