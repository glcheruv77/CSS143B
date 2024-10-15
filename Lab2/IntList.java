package Lab2;
//Glenn Cheruvathur Code

public class IntList {
    // Declare private fields
    private int[] data = new int[100];
    private int numElements = 0;

    // Method to add an integer to the list
    public void append(int n) {
        data[numElements++] = n;
    }

    // Method to return a string representation of the list
    @Override
    public String toString() {
        StringBuilder retVal = new StringBuilder();
        for (int i = 0; i < numElements; i++) {
            retVal.append(data[i]);
            if (i < numElements - 1) {
                retVal.append(", ");
            }
        }
        return retVal.toString();
    }

    // Method to sum up all elements in the list
    public int sum() {
        int total = 0;
        for (int i = 0; i < numElements; i++) {
            total += data[i];
        }
        return total;
    }
    //Do you see output for each integer added to your list? For example, “95 100 58” 
    // A: The code doesn’t print each integer as it’s added. 
    //Instead, the list elements are all printed at once when you call toString() in the main method.
    public static void main(String[] args) { 
        IntList a = new IntList();
        a.append(95); 
        a.append(100); 
        a.append(58);
        System.out.println(a.toString());
        System.out.println(a.sum());
    }

}