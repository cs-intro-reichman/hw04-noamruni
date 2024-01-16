public class ArrayOps {
    public static void main(String[] args) {
    }

    public static int findMissingInt(int[] array) {
        int fullArraySum = (array.length * (array.length + 1)) / 2;
        int arraySum = 0;
        int missingInt = 0;

        for (int i = 0; i < array.length; i++) {
            arraySum += array[i];
        }
        missingInt = fullArraySum - arraySum;
        return missingInt;
    }

    public static int secondMaxValue(int[] array) {
        int secondMax = 0;
        int max = 0;

        if (array[0] >= array[1]) {
            max = array[0];
            secondMax = array[1];
        } else {
            max = array[1];
            secondMax = array[0];
        }
        for (int i = 2; i < array.length; i++) {
            if (array[i] >= max) {
                secondMax = max;
                max = array[i];
            }
            if (array[i] < max && array[i] > secondMax){
                secondMax = array[i];
            }
        }
        return secondMax;
    }

    public static boolean containsTheSameElements(int[] array1, int[] array2) {
        for (int i = 0; i < array1.length; i++) {
            if (!contains(array1, array2[i])) {
                return false;
            }
        }
        for (int i = 0; i < array2.length; i++) {
            if (!contains(array2, array1[i])) {
                return false;
            }
        }
        return true;
    }

    public static boolean isSorted(int[] array) {
        boolean increasingOrder = true;
        boolean decreasingOrder = true;
        for (int i = 0; i < array.length - 1; i++){
            if (array[i] < array[i+1]){
                increasingOrder = false;
            }
            if (array[i] > array[i+1]){
                decreasingOrder = false;
            }
        }
        if(increasingOrder || decreasingOrder){
            return true;
        }
        return false;
    }

    public static boolean contains(int[] array, int element) {
        for (int i = 0; i < array.length; i++) {
            if (element == array[i]) {
                return true;
            }
        }
        return false;
    }
}


