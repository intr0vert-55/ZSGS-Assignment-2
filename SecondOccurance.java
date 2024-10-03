import java.util.Scanner;
public class SecondOccurance{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int n = s.nextInt();
        int [] arr = new int [n];
        for(int i = 0; i < n; i++){
            arr[i] = s.nextInt();
        }
        int target = s.nextInt();
        boolean flag = false;
        int result = -1;
        for(int i = 0; i < arr.length; i++){
            if(arr[i] == target){
                if(flag){    
                    result = i;
                    break;
                }
                flag = true;
            }
        }
        System.out.println(result); // Returns the index
    }
}

// 4. Write a program to find second occurrence of a given number in an array
