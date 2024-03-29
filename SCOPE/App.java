public class App {
    public static void main(String[] args) throws Exception {

        App myApp = new App();

        // Non-static method call
        myApp.showHelloJava();

        // Static method call
        showHelloWorld();

        // Non-static method call with parameter
        myApp.showName("Elizer");

        // Static method call with parameter
        showAge(20);

        // Static method call with two parameters
        showNameAndAge("Elizer", 20);

        // Non-static method call with two parameters that returns an int
        int sum = myApp.add(1, 1);
        System.out.println(sum);

        // Static method call with two parameters that returns an int
        int multiply = multiply(96, 86);
        System.out.println(multiply);

        int quotient = quotient(10, 2);
        System.out.println(quotient);

        int modolo = modolo(21, 2);
        System.out.println(modolo);

        boolean isequal = isequal(2, 2);
        System.out.println(isequal);

        boolean isequals = isequals(3, 2);
        System.out.println(isequals);

        boolean isgreaterthan = isgreaterthan(3, 2);
        System.out.println(isgreaterthan);
    }

    // Non-static method
    void showHelloJava() {
        System.out.println("Hello Java! This is a non-static method.");
    }

    // Static method
    static void showHelloWorld() {
        System.out.println("Hello World! This is a static method.");
    }

    // Non-static method with a parameter
    void showName(String name) {
        System.out.println("My name is " + name);
    }

    // Static method with a parameter
    static void showAge(int age) {
        System.out.println("My age is " + age);
    }

    // Static method with two parameters
    static void showNameAndAge(String name, int age) {
        System.out.println("Hello: " + name);
        System.out.println("You are : " + age + " years old!");
    }

    // Non-static method with two parameters with a return type
    int add(int x, int y) {
        int z = x + y;
        return z;
    }

    // Static method with two parameters with a return type
    static int multiply(int x, int y) {
        int z = x * y;
        return z;
    }

    static int quotient(int x, int y) {
        int z = x / y;
        return z;
    }

    static int modolo(int x, int y) {
        int z = x % y;
        return z;
    }

    static boolean isequal(int x, int y) {
        boolean z = x == y;
        return z;
    }

    static boolean isequals(int x, int y) {
        boolean z = x == y;
        return z;
    }

    static boolean isgreaterthan(int x, int y) {
        boolean z = x > y;
        return z;
    }
}
