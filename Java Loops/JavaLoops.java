import java.util.Arrays;

public class JavaLoops {
    public static void main(String[] args) {
        // initiate manual counter variable
        int counterA = 0;
                // Java while loop (condition) {statement}
                while (counterA <= 10) {
                    System.out.println("Java While Loop - counterA : " + counterA);
                    // ++ and —- signs represent increment and decrement operators, respectively by 1
                    ++ counterA;
                }
                int counterB = 0;
                // Java do while loop {statement} (condition)
                do {
                    System.out.println("Java Do While Loop Test - counterB : " + counterB);
                    ++ counterB;
                } while (counterB <= 4);
        // Java for loop (initialization: condition: update statement)
        for (int counterC = 0; counterC <= 5; counterC ++){
            System.out.println("Java For Loop - counterC : " + counterC);
        }

        // initiate array of integers
        int [] myNums = {20,40,50,60,70,80,90};
        // Java indexing
        System.out.println(myNums[0]);
        System.out.println(myNums[5]);
        System.out.println(myNums[0] + myNums[2]);

        // Java length method (returns length of data structure
        System.out.println(myNums.length);

        // Ternary Operator
        System.out.println("Java Ternary Operator - Control Flow");
        // Java Ternary Operator ( varName = expression ? value1: value2 ;)
        String indexTest = myNums[0] == 20 ? "Expression is True":"Expression is False";
        System.out.println(indexTest);

    }
}

