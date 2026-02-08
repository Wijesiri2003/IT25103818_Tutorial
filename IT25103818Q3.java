// Class to determine even or odd numbers
public class EvenOddNumber {
    
    // Method to check if a number is even or odd
    // Returns true if even, false if odd
    public boolean findEvenOrOdd(int i) {
        if (i % 2 == 0) {
            return true;  // Even
        } else {
            return false; // Odd
        }
    }
}

// Demo class with main method
public class IT25103818Q3 {
    public static void main(String[] args) {
        // Create an object of EvenOddNumber
        EvenOddNumber obj = new EvenOddNumber();

        // Test numbers
        int[] numbers = {5, 12, 7, 20, 33};

        // Loop through numbers and check if even or odd
        for (int num : numbers) {
            if (obj.findEvenOrOdd(num)) {
                System.out.println(num + " is Even");
            } else {
                System.out.println(num + " is Odd");
            }
        }
    }
}
