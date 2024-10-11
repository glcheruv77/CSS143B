package Lab2;
//Glenn Cheruvathur Code

public class ObjectList {
    // Declare private fields
    private Object[] myShapes = new Object[100];
    private int numElements = 0;

    // Method to add an Object to the list
    public void add(Object shape) {
        if (numElements < 100) {
            myShapes[numElements++] = shape;
        } else {
            System.out.println("List is full. Cannot add more shapes.");
        }
    }

    // Override toString method
    @Override
    public String toString() {
        StringBuilder retVal = new StringBuilder();
        for (int i = 0; i < numElements; i++) {
            retVal.append(myShapes[i].toString()).append(" ");
        }
        return retVal.toString();
    }

    // Main method for testing
    public static void main(String[] args) {
        ObjectList shapesList = new ObjectList();

        Square firstSquare = new Square();
        Square secondSquare = new Square(10, 20);
        Circle firstCircle = new Circle();
        Circle secondCircle = new Circle(5, 10, 7.5);
        Circle thirdCircle = new Circle(7, 14, 5.5);

        shapesList.add(firstSquare);
        shapesList.add(secondSquare);
        shapesList.add(firstCircle);
        shapesList.add(secondCircle);
        shapesList.add(thirdCircle);

        System.out.println(shapesList.toString());
    }
}

