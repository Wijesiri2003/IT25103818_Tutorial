public class IT25103818Q5 {

    // Calculator class
    static class Calculator {

        int add(int a, int b) {
            return a + b;
        }

        int multiply(int a, int b) {
            return a * b;
        }

        int square(int a) {
            return a * a;
        }
    }

    // Main method
    public static void main(String[] args) {

        Calculator cal = new Calculator();

        // Expression 1: (3 * 4 + 5 * 7)^2
        int result1 = cal.square(
                cal.add(
                        cal.multiply(3, 4),
                        cal.multiply(5, 7)
                )
        );

        // Expression 2: (4 + 7)^2 + (8 + 3)^2
        int result2 = cal.add(
                cal.square(cal.add(4, 7)),
                cal.square(cal.add(8, 3))
        );

        System.out.println("Result of Expression 1: " + result1);
        System.out.println("Result of Expression 2: " + result2);
    }
}
