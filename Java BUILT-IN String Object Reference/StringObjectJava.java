public class StringObjectJava {

    public static void main (String[] args){

        System.out.println("Java String BUILT-IN Object References");
        // Java variable declaration - data type variableName = value
        String javaString = "Hello World!";

        // Java string object methods
        System.out.println("Original String:"+ javaString);
        System.out.println("Java String Function Analysis :" + javaString.toLowerCase());
        System.out.println("Java String Function Analysis :" + javaString.toUpperCase());
        System.out.println("Java String Function Analysis :" + javaString.equals(javaString.toUpperCase()));

    }

}
