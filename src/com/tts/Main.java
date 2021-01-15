package com.tts;

import java.math.BigInteger;
import java.util.*;

public class Main {

    public static void main(String[] args) {
        // write your code here
        int num1, num2;
        double dub1;
        int ans;
        int choose;
        Scanner intInput = new Scanner(System.in);


        System.out.println("Choose your operation:");
        System.out.println("1 - Addition");
        System.out.println("2 - Subtraction");
        System.out.println("3 - Multiplication");
        System.out.println("4 - Division");
        System.out.println("5 - Squared");
        System.out.println("6 - Sin");
        System.out.println("7 - Cosine");
        System.out.println("8 - Tangent");
        System.out.println("9 - Factorial");
        choose = intInput.nextInt();

        switch (choose) {
            case 1:
                System.out.println("Your operation: 1 - Addition");
                System.out.println("Give me two numbers: ");
                num1 = intInput.nextInt();
                num2 = intInput.nextInt();
                System.out.println("Your output = " + add(num1, num2));
                break;

            case 2:
                System.out.println("Your operation: 2 - Subtraction");
                System.out.println("Give me two numbers: ");
                num1 = intInput.nextInt();
                num2 = intInput.nextInt();
                System.out.println("Your output = " + sub(num1, num2));
                break;

            case 3:
                System.out.println("Your operation: 3 - Multiplication");
                System.out.println("Give me two numbers: ");
                num1 = intInput.nextInt();
                num2 = intInput.nextInt();
                System.out.println("Your output = " + mult(num1, num2));
                break;

            case 4:
                System.out.println("Your operation: 4 - Division");
                System.out.println("Give me two numbers: ");
                num1 = intInput.nextInt();
                num2 = intInput.nextInt();
                System.out.println("Your output = " + div(num1, num2));
                break;

            case 5:
                System.out.println("Your operation: 5 - Squared");
                System.out.println("Give me a number to square: ");
                num1 = intInput.nextInt();
                System.out.println("Your output = " + square(num1));
                break;

            case 6:
                System.out.println("Your operation: 6 - Sin");
                System.out.println("Give me a number to convert into radians");
                dub1 = intInput.nextDouble();
                System.out.println("Your output = " + Math.sin(Math.toRadians(dub1)));
                break;

            case 7:
                System.out.println("Your operation: 7 - Cosine");
                System.out.println("Give me a number to convert into radians");
                dub1 = intInput.nextDouble();
                System.out.println("Your output = " + Math.cos(Math.toRadians(dub1)));
                break;

            case 8:
                System.out.println("Your operation: 8 - Tan");
                System.out.println("Give me a number to convert into radians");
                dub1 = intInput.nextDouble();
                System.out.println("Your output = " + Math.tan(Math.toRadians(dub1)));
                break;

            case 9:
                System.out.println("Your operation: 9 - Factorial");
                System.out.println("What number do you need to ∏?");
                num1 = intInput.nextInt();
                System.out.println("Your factorial = " + factorialLargeResult(num1));
                break;

            default:
                System.out.println("You messed up, buddy. Try again.");
        }
    }
            public static int add ( int x, int y){
                return x + y;
            }

            public static int sub ( int x, int y){
                return x - y;
            }

            public static int mult ( int x, int y){
                return x * y;
            }

            public static int div ( int x, int y){
                return x / y;
            }

            public static int square ( int x){
                return x * x;
            }

            public static BigInteger factorialLargeResult ( int x){
                BigInteger bigIntResult = BigInteger.ONE;
                for (int i = 2; i <= x; i++)
                    bigIntResult = bigIntResult.multiply(BigInteger.valueOf(i));
                return bigIntResult;
            }
        }


