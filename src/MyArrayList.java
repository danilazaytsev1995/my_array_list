import java.util.AbstractList;
import java.util.List;

public class MyArrayList<E> {
    private Object [] elements; //массив
    private int size; //счетчик заполненных элементов в массиве
    private static final int DEFAULT_CAPACITY = 10; //размер массива по умолчанию

    /**
     * конструктор без параметров, который создает массив на 10 элементов, если размер не был указан
     */
    public MyArrayList() {
        this.elements = new Object[DEFAULT_CAPACITY];
    }

    /**
     * создает массив указанной емкости
     * @param initialCapacity входной параметр для указания размера массива
     */
    public MyArrayList(int initialCapacity) {
        if (initialCapacity >= 0) {
            this.elements = new Object[initialCapacity];
        }
        else {
            throw new IllegalStateException("Capacity can't be less than 0!");
        }
    }

    /**
     * @return возвращает количество элементов в списке
     */
    public int getSize() {
        return size;
    }

    /**
     * метод для увеличения емкости массива
     * @return возвращает новый массив
     */
    private Object [] increaseCapacity() {
        Object [] temp = new Object[(elements.length * 2)]; // создаем новый массив вдвое больше
        System.arraycopy(elements, 0, temp, 0, elements.length); // копируем элементы в новый массив
        return temp;
    }

    public void add(E element) {
        if (size == elements.length) {
            elements = increaseCapacity(); // если массив заполнен вызываем метод увеличивающий его
        }
        elements[size] = element; // записываем в конец новое значение
        size++; // и увеличиваем размер
    }

    /**
     * проверяем индекс, не выходит ли он за границы массива
     */
    private boolean isIndexExist(int index) {
        if (index >= size || index < 0) {
            throw new IndexOutOfBoundsException("Element can't be found! "
                    + "Number of elements in array = " + size
                    + ". Total size of array = " + elements.length);
        }
        else return true;
    }

    public boolean isEmpty() {
        return (size == 0);
    }

    public Object get(int index) {
        if (isIndexExist(index) == true) {
            return elements[index];
        }
        else {
            throw new IllegalStateException("Out of bounds!");
        }
    }

    /**
     * метод удаления элемента по индексу
     * @param index
     * @return возвращаем удаленный элемент
     */
    public Object remove(int index) {
        if (isIndexExist(index) == true) { // проверяем, что индекс в границах массива
            Object [] temp = elements; // копируем массив
            elements = new Object[temp.length - 1]; // создаем новый массив на 1 меньше
            Object value = temp[index]; // сохраняем элемент по индексу, чтобы вернуть его
            System.arraycopy(temp, 0, elements, 0, index); // копируем левую часть массива ДО индекса
            System.arraycopy(temp, index + 1, elements,
                    index, temp.length - index - 1); // копируем правую часть ОТ индекса и вставляем начиная с него
            size--; // уменьшаем счетчик заполненных элементов
            return value;
        }
        else {
            throw new IllegalStateException("Out of bounds!");
        }
    }

    /**
     * Вставка элемента по интексу
     * @param index
     * @param element
     */
    public void add(int index, E element) {
        if (isIndexExist(index) == true) { // проверяем, что индекс в границах массива
            Object [] temp = elements; // копируем массив
            elements = new Object[temp.length + 1]; // создаем новый массив на 1 больше
            System.arraycopy(temp, 0, elements,0, index); // копируем левую часть массива ДО индекса
            System.arraycopy(temp, index, elements,
                    index + 1, temp.length - index); // копируем правую начиная ОТ индекса
            elements[index] = element; // вставляем элемент в пустое место между двумя частями
            size++; // увеличиваем счетчик заполненных элементов
        }
    }
}