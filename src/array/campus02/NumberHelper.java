package array.campus02;

public class NumberHelper {

    public static void main(String[] args) {
        int[] arr = {6,2,3,4,5};

        System.out.println(isSortedArray(arr));
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
}
