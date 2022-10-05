public class JavaArraysC {
    public static void main(String[] args) {
        // initiate an array with default values for primitive data type
        int [] newArray = new int[10];
        // add value to first index
        newArray[0] = 25;
        // check code
        System.out.println(newArray[0]);
        // Array length
        System.out.println(newArray.length);

        // for each loop
        for (int i: newArray){
            System.out.println("Array-Value-Check");
            System.out.println(i);
        }

        //multidimensional array
        int [][] multiArray = {
                {1,2,3,4},
                {10,20,30,40},
                {100,200,300,400}
        };

        //
        System.out.println("Multidimensional-Array-Analysis");
        for (int i = 0 ; i < multiArray.length ; i++) {
            for (int j = 0; j < multiArray[i].length; j++) {
                // print row & column
                System.out.print(multiArray[i][j] + " ");
            }
            System.out.println();
        }
    }
}
