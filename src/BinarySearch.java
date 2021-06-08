public class BinarySearch {

    public static void main(String args[]) {

        int[] array = {1, 3, 6, 10, 15, 21, 28, 37, 47, 58};
        int indexOfNumber = 10;

        binarySearch(array, indexOfNumber);
    }


    public static void binarySearch(int[] array, int indexOfNumber) {

        int smalestIndex = 0;
        int largestIndex = array.length - 1;
        boolean flag = false;

        while (smalestIndex <= largestIndex) {

            int middleIndex = (smalestIndex + largestIndex) / 2;

            if (array[middleIndex] == indexOfNumber) {
                System.out.println("Element found on position " + middleIndex);
                flag = true;
                break;
            }

            if(indexOfNumber < array[middleIndex]) {
                largestIndex = middleIndex - 1;
            } else {
                smalestIndex = middleIndex + 1;
            }

        }

        if(flag == false) {
            System.out.println("Element not found");
        }

    }
}