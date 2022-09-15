import java.util.Arrays;

public class JavaArrays {
    public static void main(String[] args) {

        int [] arrayNums = {0,5,10,20,30,35,40,50,60,70};
        int [] emptyArr = {};

        // Java for loop
        for (int i = 0; i < arrayNums.length; i += 1 ){
            if (arrayNums[i] >= 30){
                System.out.println("Output One all elements >= 30");
                System.out.println(arrayNums[i]);
            } else {
                System.out.println("Output Two all elements < 30");
                System.out.println(arrayNums[i]);

            }

            }
        }

    }
