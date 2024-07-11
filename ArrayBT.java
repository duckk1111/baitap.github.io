import java.util.ArrayList;
import java.util.Scanner;

public class ArrayBT {

    public int SumEvenNumberArrays(int[] array) {
        int sum = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] % 2 == 0) {
                sum += array[i];
            }
        }
        return sum; 
    }
    public static int MaxInArray(int[] array) {
        int max = array[0];
        for (int i = 1; i < array.length; i++) {
            if (array[i] > max) {
                max = array[i];
            }
        }
        return max;
    }
    public int CountOccurrences(int[] array, int elementTofind) {
        int count = 0;
        for (int i = 0; i < array.length; i++) {
            if (array[i] == elementTofind) {
                count++;
            }
        }
        return count;
    }
    public void SumOfSquaresElements(ArrayList<Integer> arraylist) {
        Scanner scanner = new Scanner(System.in);
        String input;
        while (true) { 
            System.out.println("Input number into ArrayList: (input 'n' to stop): ");
            input = scanner.nextLine();
            if (input.equalsIgnoreCase("n")) {
                break;
            }
            try {
                int value = Integer.valueOf(input);
                arraylist.add(value);
            } catch (NumberFormatException e) {
                System.out.println("Invalid input. Please input a number.");
            }

        } 
        int sumOfSquares = 0;
        for (int num : arraylist) {
            sumOfSquares += num * num;
        }
        System.out.println("Sum of squares of elements in the ArrayList: " + sumOfSquares);
    }
    public static void main(String[] args) {
        ArrayBT arrayBT = new ArrayBT();
        int[] array = {5, 1 , 6, 7, 8, 3, 10, 15, 21};
        System.out.println("Sum of even numbers in the array: " + arrayBT.SumEvenNumberArrays(array));
        ArrayBT.MaxInArray(new int[] {5, 1 , 6, 7, 8, 3, 10, 15, 21});
        System.out.println("Max number in the array: " + ArrayBT.MaxInArray(array));
        System.out.println("Sum of odd numbers in the array: " + arrayBT.CountOccurrences(new int[] {5, 1, 6, 7 , 5 ,8 ,9 ,13, 5} , 5));     
        int sumEvenNumbers = arrayBT.SumEvenNumberArrays(array);
        System.out.println("Sum of even numbers in the array: " + sumEvenNumbers);
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayBT.SumOfSquaresElements(arrayList);
    }

}
