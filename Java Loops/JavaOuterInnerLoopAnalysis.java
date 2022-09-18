public class JavaOuterInnerLoopAnalysis {
    public static void main(String[] args) {
        //initiate an array of elements
        int[] items = {10, 20, 30, 40, 50, 60, 70, 80, 90};
        //for loop experimentation (inner loop iteration experimentation)
        for (int i = 0; i <= 5; i++) {
            System.out.println("-----------------");
            System.out.println("Outer For Loop Iteration Analysis");
            //sub-setting/indexing using declared integer/incrementer value
            System.out.println("Iteration :" + i + " | " + "Array Element :" + items[i]);
            //Inner for loop iteration analysis
            for (int x = 1; x <= 2; x++) {
                System.out.println("Inner For Loop Iteration Analysis");
                //sub-setting/indexing
                System.out.println("Iteration :" + x + " | " + "Array Element :" + items[x]);
                // output readability - linebreak
                if (x == 2){
                    System.out.print("-----------------");
                }
            }
        }
    }
}

