import java.util.Scanner;
public class SumOfEvenNumbers{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int result = 0;
        for(int i : arr){
            if(i % 2 == 0)  continue;
            result += i;
        }
        System.out.println(result);
    }
}

// 6. Write a program to find the sum of even numbers only in a given array. Use continue.
