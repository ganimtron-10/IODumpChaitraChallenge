/*

Day 5: Program to print sum of first n numbers.

*/

// Program
import java.util.Scanner;

public class Day5{
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int sum = 0;
        System.out.println("Enter the n: ");
        int n = sc.nextInt();

        sum = ((1 + n) * n) / 2;
        System.out.println("Sum of all the numbers upto "+n+" is "+sum);
    
    }
}

/*
 O/p :

Enter the n: 
5
Sum of all the numbers upto 5 is 15

Enter the n: 
100
Sum of all the numbers upto 100 is 5050

 */

