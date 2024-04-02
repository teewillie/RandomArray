/** Class: RandomArray
 * @author: Tee Willie
 * @version: 1.0
 * Course: ITEC 2150 Fall 2024
 * Written: March 31, 2024
 * Description: randomly create an array of 50 double values.
 */
import java.util.Random;
import java.util.Scanner;

public class RandomArray {

    public static void main(String[] args) {
        double[] array = createRandomArray(50);

        Scanner scanner = new Scanner(System.in);
        System.out.print("Please input an index: ");
        int index = scanner.nextInt();

        try {
            double value = array[index];
            System.out.println("The value at index " + index + " is: " + value);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Error: Index is out of range!");
        }
    }

    public static double[] createRandomArray(int size) {
        Random random = new Random();
        double[] array = new double[size];
        for (int i = 0; i < size; i++) {
            array[i] = random.nextDouble();
        }
        return array;
    }
}
