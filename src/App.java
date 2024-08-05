import java.util.Scanner;

public class App {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        double[] numbers = new double[10];

        // Read 10 double numbers from the user
        System.out.println("Enter 10 double numbers:");
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = scanner.nextDouble();
        }

        // Sort the numbers using bubble sort
        bubbleSort(numbers);

        // Display sorted numbers
        System.out.println("Sorted numbers: ");
        for (double number : numbers) {
            System.out.print(number + " ");
        }

        scanner.close();
    }

    // Bubble sort method
    public static void bubbleSort(double[] array) {
        for (int i = 0; i < array.length - 1; i++) {
            boolean swapped = false;
            for (int j = 0; j < array.length - 1 - i; j++) {
                if (array[j] > array[j + 1]) {
                    // Swap the elements
                    double temp = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = temp;
                    swapped = true;
                }
            }
            if (!swapped) break; // If no swap occurred, the array is sorted
        }
    }
}