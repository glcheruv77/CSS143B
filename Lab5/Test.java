import java.util.ArrayList;

public class Test {
    public static ArrayList<Integer> removeDupes(int[] input){
        ArrayList <Integer> removedDupes = new ArrayList<>();
        removedDupes.add(input[0]);
        for(int i = 0; i < input.length; i++){
            int checkDupe = input[i];
            for(int j = 0; j < input.length; j++){
                if(checkDupe != input[j]){
                    if (!removedDupes.contains(input[i])) {
                        removedDupes.add(input[i]);
                    }
                
                }
            }
        }
        return removedDupes;
    }
}
