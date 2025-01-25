// Question 1a
public class NigeriaFlagSingleLoop {
    public static void main(String[] args) {
        int height = 7; // Number of rows
        int width = 15; // Total width of the flag

        for (int i = 1; i <= height; i++) {
            StringBuilder row = new StringBuilder();

            for (int j = 1; j <= width; j++) {
                if (j <= width / 3 || j > 2 * (width / 3)) {
                    row.append("G"); // Green part
                } else {
                    row.append("W"); // White part
                }
            }
            System.out.println(row.toString());
        }
    }
}


// Question 1b
public class NigeriaFlagNestedLoop {
    public static void main(String[] args) {
        int height = 7; // Number of rows
        int width = 15; // Total width of the flag

        for (int i = 1; i <= height; i++) {
            for (int j = 1; j <= width; j++) {
                if (j <= width / 3 || j > 2 * (width / 3)) {
                    System.out.print("G"); // Green part
                } else {
                    System.out.print("W"); // White part
                }
            }
            System.out.println();
        }
    }
}



// Question 2a
public class NigeriaFlagSingleLoop {
    public static void main(String[] args) {
        int rows = 7;  // Number of rows
        int columns = 15;  // Total width of the flag

        // Using a single loop
        for (int i = 0; i < rows; i++) {
            StringBuilder row = new StringBuilder();
            for (int j = 0; j < columns; j++) {
                if (j < columns / 3 || j >= 2 * (columns / 3)) {
                    row.append("G");  // Green part
                } else {
                    row.append("W");  // White part
                }
            }
            System.out.println(row);
        }
    }
}


// Question 2b
public class NigeriaFlagNestedLoop {
    public static void main(String[] args) {
        int rows = 7;  // Number of rows
        int columns = 15;  // Total width of the flag

        // Using nested loops
        for (int i = 0; i < rows; i++) {
            for (int j = 0; j < columns; j++) {
                if (j < columns / 3 || j >= 2 * (columns / 3)) {
                    System.out.print("G");  // Green part
                } else {
                    System.out.print("W");  // White part
                }
            }
            System.out.println();
        }
    }
}


// Question 3
import java.util.Arrays;

public class ArrayStatistics {
    public static void main(String[] args) {
        // Given array
        int[] data = {2, 5, 5, 9, 4, 7, 0, 9, 6, 11, 12};

        // Calculate mean
        double mean = calculateMean(data);
        System.out.println("Mean: " + mean);

        // Calculate median
        double median = calculateMedian(data);
        System.out.println("Median: " + median);

        // Calculate standard deviation
        double stdDev = calculateStandardDeviation(data, mean);
        System.out.println("Standard Deviation: " + stdDev);
    }

    // Method to calculate the mean
    public static double calculateMean(int[] array) {
        double sum = 0;
        for (int num : array) {
            sum += num;
        }
        return sum / array.length;
    }

    // Method to calculate the median
    public static double calculateMedian(int[] array) {
        Arrays.sort(array); // Sort the array
        int n = array.length;
        if (n % 2 == 0) {
            // If even, take the average of the two middle numbers
            return (array[n / 2 - 1] + array[n / 2]) / 2.0;
        } else {
            // If odd, take the middle number
            return array[n / 2];
        }
    }

    // Method to calculate the standard deviation
    public static double calculateStandardDeviation(int[] array, double mean) {
        double sumSquaredDiffs = 0;
        for (int num : array) {
            sumSquaredDiffs += Math.pow(num - mean, 2);
        }
        return Math.sqrt(sumSquaredDiffs / array.length); // Standard deviation formula
    }
}

// Question 4
import java.util.Scanner;

public class ArrayInputOutput {
    public static void main(String[] args) {
        // Declare an array of length 10
        int[] array = new int[10];
        Scanner scanner = new Scanner(System.in);

        // Part a: Assign elements to the array using user input
        System.out.println("Enter 10 numbers for the array:");
        for (int i = 0; i < array.length; i++) {
            System.out.print("Enter the value for index " + i + ": ");
            array[i] = scanner.nextInt();
        }

        // Part b: Print out the input using a for-each loop
        System.out.println("\nYou entered the following values:");
        for (int value : array) {
            System.out.println(value);
        }

        scanner.close();
    }
}


// Question 5
import java.util.Scanner;

public class TwoDArrayInputOutput {
    public static void main(String[] args) {
        // Declare a 2D array of size 10x10
        int[][] array = new int[10][10];
        Scanner scanner = new Scanner(System.in);

        // Part a: Assign elements to the 2D array using user input
        System.out.println("Enter values for a 10x10 array:");
        for (int i = 0; i < array.length; i++) { // Outer loop for rows
            for (int j = 0; j < array[i].length; j++) { // Inner loop for columns
                System.out.print("Enter value for index [" + i + "][" + j + "]: ");
                array[i][j] = scanner.nextInt();
            }
        }

        // Part b: Print out the 2D array using a for-each loop
        System.out.println("\nYou entered the following values:");
        for (int[] row : array) { // Iterate over rows
            for (int value : row) { // Iterate over values in each row
                System.out.print(value + " ");
            }
            System.out.println(); // Move to the next line after printing a row
        }

        scanner.close();
    }
}
