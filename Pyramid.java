import java.util.Arrays;
import java.util.Scanner;

/**
 * 
 * Created by Antonio Martinez
 * pyramid- Java School
 * 
 */

public class Pyramid {
    public static void main(String[] args) {

        // Create an Array to store input from user
        int numbers[] = new int[6];

        // Ask for numbers to be populated in the pyramid
        System.out.println("Please, write 6 numbers to be filled in the pyramide: ");
        Scanner input = new Scanner(System.in);

        // Save numbers in Array
        for (int i = 0; i < numbers.length; i++) {
            numbers[i] = input.nextInt();
        }

        // Sort numbers ascending from top to bottom
        Arrays.sort(numbers);

        // print Array in console
        for (int i = 0; i < numbers.length; i++) {
            System.out.print(numbers[i]);
        }
        // go to next Line
        System.out.println("");

        // Create 2D Array
        int pyramid[][] = new int[3][5];

        // Paste numbers into the pyramid
        pyramid[0][2] = numbers[0];
        pyramid[1][1] = numbers[1];
        pyramid[1][3] = numbers[2];
        pyramid[2][0] = numbers[3];
        pyramid[2][2] = numbers[4];
        pyramid[2][4] = numbers[5];

        // Print numbers
        for (int i = 0; i < pyramid.length; i++) {
            System.out.println(Arrays.toString(pyramid[i]));
        }
    }
}
