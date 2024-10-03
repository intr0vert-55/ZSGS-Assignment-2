public class PrimeNumbers{
    public static void main(String [] args){
        for(int i = 0; i < 31; i++){
            if(prime(i))    System.out.println(i);
        }
    }
    public static boolean prime(int n){
        if(n == 0 || n == 1)    return false;
        for(int i = 2; i <= n/2; i++){
            if(n % i == 0)  return false;
        }
        return true;
    }
}

// 5. Write a program to print prime numbers between 1 to 30
