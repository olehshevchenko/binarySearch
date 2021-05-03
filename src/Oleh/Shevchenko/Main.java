package Oleh.Shevchenko;

import java.util.Arrays;

public class Main {

    public static void main(String[] args) {

        int [] originArray = {1, 12, 52, 123, 76, 57, 10, 15, 24};
        System.out.println("your original array:" + Arrays.toString(originArray));
        Arrays.sort(originArray);
        System.out.println("your sort array:" + Arrays.toString(originArray));
        int result = binarySearch(originArray, 144);
        System.out.println("Index number of your search element is: " + result);
    }
    public static int binarySearch (int [] arr, int searchElement) {
        int firstElement = 0;
        int lastElement = arr.length - 1;
        int middleElement = 0;
        while (firstElement < lastElement) {
            middleElement = (firstElement + lastElement) / 2;
            if (arr[middleElement] < searchElement) {
                firstElement = middleElement + 1;
            } else if (arr[middleElement] > searchElement) {
                lastElement = middleElement - 1;
            } else
                return middleElement;
        }
        return -1;
    }
}