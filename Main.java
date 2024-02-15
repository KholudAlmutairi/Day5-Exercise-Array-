import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);
        //Exercise (Array)

        // --------------------------------1-------------------------------------
       /* 1.Write a Java program to test if the first and the last element of an array of
        integers are same. The length of the array must be greater than or equal to 2*/

         /*int[] array = {50, -20, 0, 30, 40, 60, 10};

        System.out.println("Output: " + (array.length >= 2 && array[0] == array[array.length - 1]));*/


        // --------------------------------2-------------------------------------
        /*2.Write a Java program to find the numbers greater than the average of the
        numbers of a given array.
        Original Array [1, 4, 17, 7, 25, 3, 100] */

       /* int[] Array = {1, 4, 17, 7, 25, 3, 100};
        double sum = 0;
        for (int num : Array) {
            sum += num;
        }
        double average = sum / Array.length;

        System.out.println("The average of the said array is: " + average);
        System.out.print("The numbers in the said array that are greater than the average are: ");
        for (int num : Array) {
            if (num > average) {
                System.out.print(num + " ");
            }
        } */

        // --------------------------------3-------------------------------------
       /* 3.Write a Java program to get the larger value between first and last
        element of an array of integers.
        Original Array [20, 30, 40]*/
        /*int[] Array = {20, 30, 40};

        int firstElement = Array[0];
        int lastElement = Array[Array.length - 1];

        int largerValue;
        if (firstElement > lastElement) {
            largerValue = firstElement;
        } else {
            largerValue = lastElement;
        }

        System.out.println("Larger value between first and last element: " + largerValue);*/

        // --------------------------------4-------------------------------------
        /*4.Write a Java program to swap the first and last elements of an array and
        create a new array.Original Array:[20, 30, 40]*/
        /*int[] numbers = {20, 30, 40};
        int temp = numbers[0];
        numbers[0] = numbers[numbers.length - 1];
        numbers[numbers.length - 1] = temp;

        System.out.println("New array after swapping the first and last elements: " + Arrays.toString(numbers));*/

        // --------------------------------5-------------------------------------
        /*5. Write a program that places the odd elements of an array before the
        even elements.
        Original Array:[2,3,40,1,5,9,4,10,7]
        Sample Output:[3,1,5,9,7,2,40,4,10]*/
        /*int[] arrayNumbers = {2,3,40,1,5,9,4,10,7};
        int oddCount = 0;
        for (int num : arrayNumbers) {
            if (num % 2 != 0) {
                oddCount++;
            }
        }
        int[] resultArray = new int[arrayNumbers.length];


        int oddIndex = 0;
        int evenIndex = oddCount;
        for (int num : arrayNumbers) {
            if (num % 2 != 0) {
                resultArray[oddIndex++] = num;
            } else {
                resultArray[evenIndex++] = num;
            }
        }

        System.out.println("Result Array: " + Arrays.toString(resultArray));*/
        // --------------------------------6-------------------------------------
        /*6. Write a program that test the equality of two arrays.
        [2,3,6,6,4] [2,3,6,6,4]
        Sample Output:
        true*/

        int[] array1 = {2, 3, 6, 6, 4};
        int[] array2 = {2, 3, 6, 6, 4};

        if(Arrays.equals(array1, array2)) {
            System.out.println("true");
        } else {
            System.out.println("false");
        }








        }
}