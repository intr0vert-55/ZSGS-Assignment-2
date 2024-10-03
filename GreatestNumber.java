import java.util.Scanner;
public class GreatestNumber{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int [] arr = new int [3];
        int max = 0;
        for(int i = 0; i < arr.length; i++){
            arr[i] = s.nextInt();
            max = Math.max(max, arr[i]);
        }
        System.out.println(max);
    }
}

// 1. Take three numbers from the user and print the greatest number.