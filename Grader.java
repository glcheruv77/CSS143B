import java.util.Scanner;
// import java.util.Arrays;

public class Grader {
    public static void main(String[] args){
        //Task 1: Checking if the # of grade is positive
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter number of grades");
        int numGrades  = Input.nextInt();
        
        while ( numGrades < 0 ){
            System.out.println("Please enter a positive number");
            numGrades = Input.nextInt();
        }

        //Creating Array to store grades
        // System.out.println("Please enter the grades separated by spaces");
        // int[] listOfGrades = Input.nextInt();

        // for(int i = 0; i < numGrades; i++){
        //     System.out.println(listOfGrades[i]);
        // }


        

        Input.close();
    }
    
}
