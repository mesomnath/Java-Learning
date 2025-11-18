package javaBasics;

import java.util.Scanner;

public class Calculator {

    public static String Calculation(int a, int b, String operation){
        String c = null;
        if(operation.equals("+"))
         c = String.valueOf(a+b);
        else if(operation.equals("-"))
            if(a>b)
                c = String.valueOf(a-b);
            else
                c= "B is greater than A";
        else  if(operation.equals("*"))
            c = String.valueOf(a*b);
        else if(operation.equals("%"))
            if(a>b)
                if(a%b==0)
                    c = String.valueOf(a/b);
                else
                    c = "A is not divisible by B, it will return floating value.";
            else
                c = "A is not divisible by B";
        else
            c = "You have chosen wrong operator";
        return c;
    }

    public static void  main(String[] args){
        System.out.println("============= CALCULATOR ===========");
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter First Number: ");
        int a = scanner.nextInt();
        System.out.print("Enter Second Number: ");
        int b = scanner.nextInt();
        System.out.print(("Enter operation type (i.e, +, -, %, *): "));
        String operation = scanner.next();
        String output = Calculation(a, b, operation);
        System.out.println("Output of your operation: " + a + operation + b + " = " + output);
        System.out.println("====================================");
    }
}
