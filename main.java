import java.util.Arrays;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner newScanner = new Scanner(System.in);

        int[] array1 = { 8, 4, 6, 3, 9 };
        
        System.out.println("array 1 " + Arrays.toString(array1));
        System.out.println("length of array 1 är " + array1.length);

        int sum = (array1[0] + array1[1] + array1[2] + array1[3] + array1[4]);
        double average = sum / 5;
        System.out.println("array 1 average " + average);
        newScanner.nextLine();

        int[] array2 = { 18, 14, 16, 13, 19 };
        int sum2 = array2[0] + array2[1] + array2[2] + array2[3] + array2[4];
        System.out.println("sum of second array and first array " + (sum + sum2));
        newScanner.nextLine();

        double average2 = sum2 / 5;
        System.out.println("array 2 average " + average2);
        newScanner.nextLine();

        int[] sumArray = {array1[0] + array2[0], array1[1] + array2[1],
        array1[2] + array2[2], array1[3] + array2[3], array1[4] + array2[4]};
        
        System.out.println("sum of first and second array in array " + Arrays.toString(sumArray));

        // user array choice
        System.out.println("first digit");
        int firstIndex = newScanner.nextInt();
        
        System.out.println("second digit");
        int secondIndex = newScanner.nextInt();

        System.out.println("Third digit");
        int thirdIndex = newScanner.nextInt();

        System.out.println("fourth digit");
        int fourthIndex = newScanner.nextInt();

      
        int[] userArr = {firstIndex, secondIndex, thirdIndex, fourthIndex};
        System.out.println("User array: " + Arrays.toString(userArr));
        
        



    }
}