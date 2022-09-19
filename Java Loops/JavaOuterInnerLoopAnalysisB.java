public class JavaOuterInnerLoopAnalysisB {
    public static void main(String[] args) {
        // initiate array of elements
        int[] items = {10,20,30,40};
        // initiate empty array
        // Loop 1
        for (int i = 0; i < (items.length); i++){
            System.out.println("Outer-Loop");
            System.out.println("Index : " + i);
            System.out.println(items[i]);
            for (int x = 1; x < items.length; x++){
                System.out.println("Inner-Loop");
                System.out.println("Index : " + x);
                System.out.println(items[x]);
            }
        }
    }
}
