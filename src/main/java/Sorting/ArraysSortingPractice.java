package Sorting;
import java.util.*;
public class ArraysSortingPractice {

   static Integer[] test = new Integer[10000];
    static int[] array = new int[10000];
    private int length;

    public static void main(String[] args) {

        ArraysSortingPractice a = new ArraysSortingPractice();

        for(int x = 0; x < test.length; x++){
            int y = (int) (Math.random() *3001);
            test[x] = y;
            array[x] = y;
        }
       long begin = System.currentTimeMillis();

        mergeSort(test);
        System.out.println(Arrays.toString(test));
        long end = System.currentTimeMillis();
        long exec = (end - begin);
        System.out.println("Merge exec --> "+exec);
        System.out.println(" size merge arrat " + test.length);

        long begin2 = System.currentTimeMillis();
        a.sort(array);
        System.out.println(Arrays.toString(array));
        long end2 = System.currentTimeMillis();
        long exec2 = (end2 - begin2);
        System.out.println("QuickSort exec -->"+ exec2);
        System.out.println(" size " + array.length);
    }

    //MERGE SORT
    @SuppressWarnings("rawtypes")
    public static Comparable[] mergeSort(Comparable[] list)
    {
        //If list is empty; no need to do anything
        if (list.length <= 1) {
            return list;
        }

        //Split the array in half in two parts
        Comparable[] first = new Comparable[list.length / 2];
        Comparable[] second = new Comparable[list.length - first.length];
        System.arraycopy(list, 0, first, 0, first.length);
        System.arraycopy(list, first.length, second, 0, second.length);

        //Sort each half recursively
        mergeSort(first);
        mergeSort(second);

        //Merge both halves together, overwriting to original array
        merge(first, second, list);
        return list;
    }

    @SuppressWarnings({ "rawtypes", "unchecked" })
    private static void merge(Comparable[] first, Comparable[] second, Comparable[] result) {
        //Index Position in first array - starting with first element
        int iFirst = 0;

        //Index Position in second array - starting with first element
        int iSecond = 0;

        //Index Position in merged array - starting with first position
        int iMerged = 0;

        //Compare elements at iFirst and iSecond,
        //and move smaller element at iMerged
        while (iFirst < first.length && iSecond < second.length)
        {
            if (first[iFirst].compareTo(second[iSecond]) < 0)
            {
                result[iMerged] = first[iFirst];
                iFirst++;
            }
            else
            {
                result[iMerged] = second[iSecond];
                iSecond++;
            }
            iMerged++;
        }
        //copy remaining elements from both halves - each half will have already sorted elements
        System.arraycopy(first, iFirst, result, iMerged, first.length - iFirst);
        System.arraycopy(second, iSecond, result, iMerged, second.length - iSecond);
    }

    /*
      ************************************************************
     */

    //QUICKSORT

    public void sort(int[] inputArr) {

        if (inputArr == null || inputArr.length == 0) {
            return;
        }
        this.array = inputArr;
        this.length = inputArr.length;
        quickSort(0, length - 1);
    }

    private void quickSort(int lowerIndex, int higherIndex) {

        int i = lowerIndex;
        int j = higherIndex;
        // calculate pivot number, I am taking pivot as middle index number
        int pivot = array[lowerIndex+(higherIndex-lowerIndex)/2];
        // Divide into two arrays
        while (i <= j) {
            /**
             * In each iteration, we will identify a number from left side which
             * is greater then the pivot value, and also we will identify a number
             * from right side which is less then the pivot value. Once the search
             * is done, then we exchange both numbers.
             */
            while (array[i] < pivot) {
                i++;
            }
            while (array[j] > pivot) {
                j--;
            }
            if (i <= j) {
                exchangeNumbers(i, j);
                //move index to next position on both sides
                i++;
                j--;
            }
        }
        // call quickSort() method recursively
        if (lowerIndex < j)
            quickSort(lowerIndex, j);
        if (i < higherIndex)
            quickSort(i, higherIndex);
    }

    private void exchangeNumbers(int i, int j) {
        int temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }
    public int[] getArray() {
        return array;
    }

    public void setArray(int[] array) {
        this.array = array;
    }

    public int getLength() {
        return length;
    }

    public void setLength(int length) {
        this.length = length;
    }

}
