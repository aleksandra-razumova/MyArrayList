
public class QuickSort {

    public static <T extends Comparable<T>> void quickSort(MyArrayList<T> arr, int low, int high) {
        if (low < high) {
            int pivotIndex = partition(arr, low, high);
            quickSort(arr, low, pivotIndex - 1);
            quickSort(arr, pivotIndex + 1, high);
        }
    }

    private static <T extends Comparable<T>> int partition(MyArrayList<T> arr, int low, int high) {
        //Разделение массива на две части относительно опорного элемента
        T pivot = arr.get(high);
        int i = low - 1;
        for (int j = low; j < high; j++) {
            if (arr.get(j).compareTo(pivot) < 0) {
                i++;
                swap(arr, i, j);
            }
        }
        swap(arr, i + 1, high);
        return i + 1;
    }

    private static <T extends Comparable<T>> void swap(MyArrayList<T> arr, int i, int j) {
        //Замена позиций двух элементов в массиве.
        T temp = arr.get(i);
        arr.add(i, arr.get(j));
        arr.add(j, temp);
    }
}
