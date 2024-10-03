import java.util.Scanner;
public class MultiplicationTable{
    public static void main(String [] args){
        int num = new Scanner(System.in).nextInt();
        System.out.println();
        int n = 20;  // s.nextInt()
        // Returns tables from 1 to 20 for the given number
        for(int i = 1; i < n + 1; i++){
            System.out.println(num + " x " + i + " = " + num * i);
        }
    }

}

// 3. Write a program to print multiplication table of a given number in a neat format
