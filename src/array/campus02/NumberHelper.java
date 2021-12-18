package array.campus02;

import java.util.Arrays;

public class NumberHelper {

    public static void main(String[] args) {
        int[] arr = {6,2,3,6,5};

        System.out.println(Arrays.toString(removeDuplicates(arr)));
    }

    public static boolean isSortedArray(int[] numbers){
        int tmp = 0;
        for(int i = 0; i < numbers.length; i++) {
            if( tmp < numbers[i] ) {
                tmp = numbers[i];
            } else return false;
        }
        return true;
    }

    public static int[] removeDuplicates(int[] numbers) {
        for(int i = 0; i < numbers.length; i++) {
            for(int j = i + 1; j < numbers.length; j++ ){
                if (numbers[i] == numbers[j]) numbers[j] = -1;
            }
        }
        return numbers;
    }
}
