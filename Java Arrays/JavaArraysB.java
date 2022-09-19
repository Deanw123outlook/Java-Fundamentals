import java.util.Arrays;
public class JavaArraysB {
    public static void main(String[] args) {
        // Initiate DATA
        int [] arrayNums = {0,5,10,20,30,35,40,50,60,70}; // initiate array of integer
        // Java for loop (initialization; condition; update statement)
        for (int i = 0; i < arrayNums.length; i += 1 ){ // length method will return the length of the specified data structure
            // if condition true execute statement ...
            if (arrayNums[i] >= 30){ // sub-setting using for loop declared variable i
                System.out.println("Output One - all elements >= 30");
                System.out.println(arrayNums[i]);
                // else previous if condition NOT true execute else statement
            } else {
                System.out.println("Output Two - all elements < 30");
                System.out.println(arrayNums[i]);
            }
        }
    }
}
