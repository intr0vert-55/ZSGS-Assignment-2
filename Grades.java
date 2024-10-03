import java.util.Scanner;
public class Grades{
    public static void main(String [] args){
        Scanner s = new Scanner(System.in);
        int mark = s.nextInt();    // Out of 100

        /*  Custom total 
          int marks = s.nextInt();
          double max = s.nextInt();
          double mark = (marks/max) * 100;
        */
        //   System.out.println(mark);
         
        grades(mark);
         
        
    }

    public static void grades(double mark){
        String result = "F";
        if(mark > 100 || mark < 0)  result = "Invalid Input";
        else if(mark > 89)   result = "A";
        else if(mark > 79)  result = "B";
        else if(mark > 69)  result = "C";
        else if(mark > 59)  result = "D";
        else if(mark > 49)  result = "E";
        System.out.println(result);
    }
}

// 2. Create a program that takes a student's score as input and outputs their corresponding grade.