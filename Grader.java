import java.util.Scanner;

public class Grader {
    public static void main(String[] args){
        //Task 1: Checking if the # of grade is positive
        Scanner Input = new Scanner(System.in);
        System.out.println("Enter number of grades");
        int numGrades  = Input.nextInt();
        
        while (numGrades < 0){
            System.out.println("Please enter a positive number");
            numGrades = Input.nextInt();
        }

        //Task 2: Creating Array to store grades
        System.out.println("Please enter the grades separated by spaces");
        int[] IntGrades = new int[numGrades];
        for (int i = 0; i < numGrades; i++){
            IntGrades[i] = Input.nextInt();
        }

        for (int i = 0; i < IntGrades.length; i++){
            System.out.println("Grade " + i + ":"+ IntGrades[i]);
        }
    

        Input.close();
    }
    //Task 3: Assign Grades Values
    public static String getLetterGrade(int grade) {
        String letterGrade;
    
        switch (grade / 10) {
            case 10:
                letterGrade = "A";
            case 9:
                letterGrade = "A";
            case 8:
                letterGrade = "B";
            case 7:
                letterGrade = "C";
            case 6:
                letterGrade = "D";
            default:
                letterGrade = "F";
        }
    
        return letterGrade;
    }
    //Task 4: Finding the average

    public static double average (double doubleArray[]){
        double average = 0;
        for (int k = 0; k < doubleArray.length; k++){
            average += doubleArray[k];
        }
        average /= doubleArray.length;
        return average;
    }

    //Task 5: Same as Task 3 but using If instead of Switch.
    public static String getLetterGrade (double grade){
        String LetterGrade;
        if (grade > 90) {
            LetterGrade = "A";
        } else if (grade > 80){
            LetterGrade = "B";
        } else if( grade > 70){
            LetterGrade = "C";
        } else if (grade > 60){
            LetterGrade = "D";
        } else {
            LetterGrade = "F";
        }
        return LetterGrade;
    }
}
