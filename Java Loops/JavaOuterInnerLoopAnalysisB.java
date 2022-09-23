public class JavaOuterInnerLoopAnalysisB {
    public static void main(String[] args) {
        // initiate array of elements
        int[] items = {10, 20, 30, 40};
        // Declare variable that can be accessed inside loop & incremented
        int iteration = 0;
        // Outer Loop
        for (int i = 0; i < (items.length); i++) {
            //
            iteration++; //increment variable
            System.out.println("Program-Iteration-Analysis : " + iteration);
            // Outer Loop
            System.out.println("Outer-Loop");
            System.out.println("Index : " + i);
            System.out.println(items[i]);
            // Inner Loop
            for (int x = 1; x < 2; x++) {
                System.out.println("Inner-Loop");
                System.out.println("Index : " + iteration);
                // if-else statement
                if (iteration < items.length) {
                    System.out.println(items[iteration]);
                }
                else
                {
                    System.out.println("Index-out-of-range");
                    System.out.println("Break-Loop");
                    // break statement will exit loop at the current iteration
                    break;
                }
            }
        }
    }
}

