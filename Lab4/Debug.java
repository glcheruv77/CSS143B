// Glenn Cheruvathur
// CSSSKL143

class Debug {
    // set dmode to false to compile out debug code
    public static final boolean dmode = false;

    public static void main(String[] args) {
        int[] numbers = {0, 1, 2, 3};

        if (dmode) {
            System.out.println("Debug is turned on");
        }

        for (int i = 0; i < numbers.length; i++) {
            if (dmode) {
                System.out.println("DEBUG_STATEMENT: number[" + i + "]=" + numbers[i]);
            }
        }

        System.out.println("Debug is turned off");

        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i] + ", ");
        }
    }
}
