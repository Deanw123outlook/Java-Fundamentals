public class JavaMethods {
    public static void main(String[] args) {
        // call method x1
        funcHello();
        // call method x2
        newFunc(5);
        // call method x3
        System.out.println("£ : " + multiplyFunc(20000));
        // call method (over-loading)
        System.out.println(functionsJ(40000,10));
    }
    //Declare function without any parameters or return value
    static void funcHello(){
        System.out.println("Hello World!");
    }
    // Declare function with parameter but NO return value
    static void newFunc(int repeatNumber){
        for (int i = 0; i <= repeatNumber; i++){
            System.out.println("Iteration :" + i + " Hello World!");
        }
    }
    // Declare function with more than one Parameter & return value
    static double multiplyFunc(int price){
        return price * 0.1;
    }
    // Over-Loading Java Methods
    // xA
    static double functionsJ(int price, int percent){
        return price * percent / 100.0;
    }
    // xB
    static double functionsJ(double price, int percent){
        return price * percent/ 100;
    }
}
