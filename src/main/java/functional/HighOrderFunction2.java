package functional;

import java.util.Comparator;

public class HighOrderFunction2 {

    public static void main(String[] args) {
        String[] letters = {"A", "Y", "V", "L", "M"};

        System.out.println("Initial array: ");
        print(letters);

        sort(letters, Comparator.naturalOrder());

        System.out.println("Natural order: ");
        print(letters);

        sort(letters, Comparator.reverseOrder());
        print(letters);
    }

    private static <T> void print(T[] array) {
        for (T element : array)
            System.out.println(element);
        System.out.println();
    }

    private static <T> void sort(T[] array, Comparator<T> cmp) {
        for (int j = 0; j < array.length - 1; j++)
            for (int i = array.length - 1; i > j; i--)
                if (cmp.compare(array[i], array[j]) < 0)
                    swap(array, i, j);
    }

    private static <T> void swap(T[] array, int i, int j) {
        T temp = array[i];
        array[i] = array[j];
        array[j] = temp;
    }

}
