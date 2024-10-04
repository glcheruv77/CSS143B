import java.util.Scanner;
/*
 * InFixCalc, V0.0 (concept borrowed from Carol Zander's Infix Calculator)
 * Exercise author: Rob Nash
 * Complete the calculate() function below to build a simple, infix
 * calculator that evaluates a compound expression from left to right,
 * regardless of operator precedence
 *
 * Example: " 1 * -3 + 6 / 3"
 * Execution: calculate 1 * -3 first, then -3 + 6 next, then 3 / 3
 * last to obtain the value 1
*
* Solution by 
*/
public class InFixCalc {
    //example pattern: "3 + 5"
    //general pattern: <lhs='3'> <operation='+'> <rhs='5'> //extended pattern:     ...  
    //special case: 
    //other special cases?
    //implement this logic in the calculate method bellow

    public static void main(String[] args) { //String input = "4 + 4";
        //String input = "4 + 4 / 2";
        //String input ="1 * -3";
        String input ="1 * -3 + 6 / 3";
        //String input ="5";
        //String input ="-5";
        int answer = calculate(input);
        System.out.println("Answer is " + answer);
    }

//preconditions: all binary operations are separated via a space
//postconditions: returns the result of the processed string
    public static int calculate(String input) {
        int lhs = 0;
        int rhs = 0; //short for left-hand & right-hand side
        char operation = ' ';
        Scanner scanner = new Scanner(input);
        while(scanner.hasNext()){
            if  (scanner.hasNextInt()){
                if (lhs == 0){
                    lhs = scanner.nextInt();
                } else {
                    rhs = scanner.nextInt();
                    switch (operation){
                        case '+':
                            lhs += rhs;
                            break;
                        case '-':
                            lhs -= rhs;
                            break;
                        case '*':
                            lhs *= rhs;
                            break;
                        case '/':
                            lhs /= rhs;
                            break;
                    }
                }        
            } else {
                operation = scanner.next().charAt(0);
            }

        }
        scanner.close();
        return lhs;
    }
}