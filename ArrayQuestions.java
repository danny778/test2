import com.sun.deploy.util.ArrayUtil;
import com.sun.org.apache.xpath.internal.SourceTree;

import java.util.*;
import java.util.stream.IntStream;

/**
 * Created by danie on 20/10/2016.
 */
public class ArrayQuestions {

    Scanner input = new Scanner(System.in);
    Random rand = new Random();

    public ArrayQuestions() {
        System.out.println("Which task would you like to view?\n" +
                "1. arrayWithInputValues\n" +
                "2. arrayWithRandomValues\n" +
                "3. sumOfArrays\n" +
                "4. largestElement\n" +
                "5. randomShufflingArray\n" +
                "6. smallestIndexOfLargestNumber\n" +
                "7. shiftingElements");
        int taskViewInput = input.nextInt();
        switch(taskViewInput) {
            case 1:
                arrayWithInputValues();
                break;
            case 2:
                arrayWithRandomValues();
                break;
            case 3:
                sumOfArrays();
                break;
            case 4:
                largestElement();
                break;
            case 5:
                randomShufflingArray();
                break;
            case 6:
                smallestIndexOfLargestNumber();
                break;
            case 7:
                shiftingElements();
                break;
        }
    }

    public static void main(String[] args) {
        new ArrayQuestions();
    }

    void arrayWithInputValues() {
        int[] myIntArray = new int[5];

        for (int i = 0; i < myIntArray.length; i++) {
            System.out.println("Enter input for array position "+i+":");
            int arrayValueInput = input.nextInt();
            myIntArray[i] = arrayValueInput;
        }
        System.out.println(Arrays.toString(myIntArray));
    }

    void arrayWithRandomValues() {
        int[] myIntArray = new int[5];

        for (int i = 0; i < myIntArray.length; i++) {
            int randomNumber = rand.nextInt(100) + 1;
            myIntArray[i] = randomNumber;
        }
        System.out.println(Arrays.toString(myIntArray));
    }

    void sumOfArrays() {
        int[] myIntArray = new int[5];

        for (int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i + 1;
        }
        System.out.println("Sum of arrays: " + IntStream.of(myIntArray).sum());
    }

    void largestElement() {
        int[] myIntArray = new int[5];

        for(int i = 0; i < myIntArray.length; i++) {
            myIntArray[i] = i + 1;
        }
        System.out.println("Largest element: " + Arrays.stream(myIntArray).max().getAsInt());
    }

    void randomShufflingArray() {
        Integer[] myIntArray = new Integer[5];

        for (int i = 0; i < myIntArray.length ; i++) {
            myIntArray[i] = i + 1;
        }
        System.out.println("Unshuffled Array: " + Arrays.toString(myIntArray));
        Collections.shuffle(Arrays.asList(myIntArray));
        System.out.println("Shuffled Array: " + Arrays.toString(myIntArray));
    }

    void smallestIndexOfLargestNumber() {
        int[] myIntArray = new int[5];
        int largestNumber = 0;

        for (int i = 0; i < 5; i++) {
            myIntArray[i] = rand.nextInt(100) + 1;
            if (largestNumber < myIntArray[i]) {
                largestNumber = myIntArray[i];
            }
        }
        int i;
        for(i = 0; i < 5; i++) {
            if(myIntArray[i] == largestNumber) {
                break;
            }
        }
        System.out.println("Array List: " + Arrays.toString(myIntArray));
        System.out.println("Smallest index of largest element: " + i);
    }

    void shiftingElements() {
        Integer[] myIntList = new Integer[5];

        for(int i = 0; i < myIntList.length; i++) {
            myIntList[i] = i + 1;
        }
        System.out.println("How many places do you want the array list to shift by? ");
        int shiftPlacesInput = input.nextInt();

        System.out.println("Unshifed Array: " + Arrays.toString(myIntList));
        Collections.rotate(Arrays.asList(myIntList), shiftPlacesInput);
        System.out.println("Shifed Array: " + Arrays.toString(myIntList));
    }

}
