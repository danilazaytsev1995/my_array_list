import java.util.Comparator;
import java.util.Random;

public class QuickSort<E>{
    public static final Random RND = new Random();
    private void swap(E[] array, int i, int j) {
        E tmp = array[i];
        array[i] = array[j];
        array[j] = tmp;
    }
    private int partition(E[] array, int begin, int end, Comparator<E> cmp) {
        int index = begin + RND.nextInt(end - begin + 1);
        Object pivot = array[index];
        swap(array, index, end);
        for (int i = index = begin; i < end; ++ i) {
            if (cmp.compare(array[i], (E)pivot) <= 0) {
                swap(array, index++, i);
            }
        }
        swap(array, index, end);
        return (index);
    }
    private void qsort(E[] array, int begin, int end, Comparator <E>cmp) {
        if (end > begin) {
            int index = partition(array, begin, end, cmp);
            qsort(array, begin, index - 1, cmp);
            qsort(array, index + 1,  end,  cmp);
        }
    }
    public void sort(E[] array, Comparator <E>cmp) {
        qsort(array, 0, array.length - 1, cmp);
    }

}